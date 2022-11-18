package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.CursoEmpresarial;
import com.example.demo.service.CursoEmpresarialService;

public class CursoEmpresaController {
	@Autowired
	CursoEmpresarialService cursoEmpresarialService;
	
	@RequestMapping(value = "/cursos", method = RequestMethod.GET, produces = "application/json")
	public List<CursoEmpresarial> getCursos() {
		return cursoEmpresarialService.findAllCursoEmpresarial();
	}
	
	@RequestMapping(value = "/cursos/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<CursoEmpresarial> getCurso(@PathVariable("id") Long id) {
		return cursoEmpresarialService.findCursoEmpresarialById(id);
	}
	
	
	@RequestMapping(value = "/cursos/add", method = RequestMethod.POST, produces = "application/json")
	public CursoEmpresarial addCurso(CursoEmpresarial cursoEmpresarial) {
		return cursoEmpresarialService.saveCurso(cursoEmpresarial);
	}
	// no se si estara bien
	@RequestMapping(value = "/cursos/empresa/{id}", method = RequestMethod.GET, produces = "application/json")
	public List<CursoEmpresarial> getCursoEmpresa(@PathVariable Long id) {
		return cursoEmpresarialService.findAllCursoEmpresarial(id);
	}

}
