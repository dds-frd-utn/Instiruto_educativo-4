package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.CursoPersonal;
import com.example.demo.service.CursoPersonalService;

public class CursoPersonalController {
	
	@Autowired
	CursoPersonalService cursoPersonalService;
	
	@RequestMapping(value = "/cursos", method = RequestMethod.GET, produces = "application/json")
	public List<CursoPersonal> getCursos() {
		return cursoPersonalService.findAllCursoPersonal();
	}
	
	@RequestMapping(value = "/cursos/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<CursoPersonal> getCurso(@PathVariable("id") Long id) {
		return cursoPersonalService.findCursoPersonalById(id);
	}
	
	
	@RequestMapping(value = "/cursos/add", method = RequestMethod.POST, produces = "application/json")
	public CursoPersonal addCurso(CursoPersonal cursoPersonal) {
		return cursoPersonalService.saveCurso(cursoPersonal);
	}
	// no se si estara bien
	@RequestMapping(value = "/cursos/docentes/{id}", method = RequestMethod.GET, produces = "application/json")
	public List<CursoPersonal> getCursoDocente(@PathVariable Long id) {
		return cursoPersonalService.findAllCursoPersonal(id);
	}
}
