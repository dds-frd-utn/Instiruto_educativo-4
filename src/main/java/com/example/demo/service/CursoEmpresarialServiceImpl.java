package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.CursoEmpresarial;
import com.example.demo.repository.CursoEmpresarialRepository;

public class CursoEmpresarialServiceImpl implements CursoEmpresarialService{
	@Autowired
	CursoEmpresarialRepository cursoEmpresarialRepository;

	@Override
	public List<CursoEmpresarial> findAllCursoEmpresarial() {
		return cursoEmpresarialRepository.findAll();
	}	
	
	@Override
	public Optional<CursoEmpresarial> findCursoEmpresarialById(Long id) {
		return cursoEmpresarialRepository.findById(id);
	}

	@Override
	public CursoEmpresarial saveCurso(CursoEmpresarial newCursoEmpresarial) {
		return cursoEmpresarialRepository.save(newCursoEmpresarial);
	}
	
	public List<CursoEmpresarial> findAllCursoEmpresarial(Long id){
		return cursoEmpresarialRepository.findAllCursoEmpresarial(id);
	}

}
