package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.CursoPersonal;
import com.example.demo.repository.CursoPersonalRepository;

public class CursoPersonalServiceImpl implements CursoPersonalService{
	@Autowired
	CursoPersonalRepository cursoPersonalRepository;

	@Override
	public List<CursoPersonal> findAllCursoPersonal() {
		return cursoPersonalRepository.findAll();
	}	
	
	@Override
	public Optional<CursoPersonal> findCursoPersonalById(Long id) {
		return cursoPersonalRepository.findById(id);
	}

	@Override
	public CursoPersonal saveCurso(CursoPersonal newCursoPersonal) {
		return cursoPersonalRepository.save(newCursoPersonal);
	}
	
	public List<CursoPersonal> findAllCursoPersonal(Long id){
		return cursoPersonalRepository.findAllCursoPersonal(id);
	}

}
