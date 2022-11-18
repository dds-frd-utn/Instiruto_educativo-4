package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Docente;
import com.example.demo.service.DocenteService;

public class DocenteController {
	@Autowired
    DocenteService docenteService;

    @RequestMapping(value = "/docentes", method = RequestMethod.GET, produces = "application/json")
    public List<Docente> getDocentes() {
        return docenteService.findAllDocente();
    }

    @RequestMapping(value = "/docentes/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Docente> getDocentes(@PathVariable Long id) {
        return docenteService.findDocenteById(id);
    }

    @RequestMapping(value = "/docentes/add", method = RequestMethod.POST, produces = "application/json")
    public Docente addPostPost(Docente docente) {
        return docenteService.saveDocente(docente);
    }

    @RequestMapping(value = "/docentes/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public String deletePost(@PathVariable Long id) {
        return docenteService.deleteDocente(id);
    }

    @RequestMapping(value = "/docentes/update", method = RequestMethod.PUT, produces = "application/json")
    public String updateDocente(Docente docente) {
        return docenteService.updateDocente(docente);
    }
	
	
	

}
