package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.CursoPersonal;

public interface CursoPersonalService {
	public List<CursoPersonal> findAllCursoPersonal();

	public Optional<CursoPersonal> findCursoPersonalById(Long id);

	public CursoPersonal saveCurso(CursoPersonal newCursoPersonal);
	
	public List<CursoPersonal> findAllCursoPersonal(Long id);

}
