package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Curso;
import com.example.demo.service.CursoService;

public class CursoController {
	@Autowired
	CursoService cursoService;
	
	@RequestMapping(value = "/cursos", method = RequestMethod.GET, produces = "application/json")
	public List<Curso> getCursos() {
		return cursoService.findAllCurso();
	}
	
	@RequestMapping(value = "/cursos/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Curso> getCurso(@PathVariable("id") Long id) {
		return cursoService.findCursoById(id);
	}
	
	
	@RequestMapping(value = "/cursos/add", method = RequestMethod.POST, produces = "application/json")
	public Curso addCurso(Curso curso) {
		return cursoService.saveCurso(curso);
	}
	// no se si estara bien
	@RequestMapping(value = "/cursos/empresa/{id}", method = RequestMethod.GET, produces = "application/json")
	public List<Curso> getCursoEmpresa(@PathVariable Long id) {
		return cursoService.findAllCurso(id);
	}

}
