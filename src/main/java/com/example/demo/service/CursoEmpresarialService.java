package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.CursoEmpresarial;

public interface CursoEmpresarialService {
	public List<CursoEmpresarial> findAllCursoEmpresarial();

	public Optional<CursoEmpresarial> findCursoEmpresarialById(Long id);

	public CursoEmpresarial saveCurso(CursoEmpresarial newCursoEmpresarial);
	
	public List<CursoEmpresarial> findAllCursoEmpresarial(Long id);

}
