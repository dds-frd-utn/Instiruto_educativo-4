package com.example.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Empresa;
import com.example.demo.service.EmpresaService;

public class EmpresaControler {
	@Autowired
	EmpresaService empresaService;
	
	@RequestMapping(value = "/empresas", method = RequestMethod.GET, produces = "application/json")
	public List<Empresa> getEmpresa() {
		return empresaService.findAllEmpresa();
	}
	
	@RequestMapping(value = "/empresas/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Empresa> getEmpresa(@PathVariable("id") Long id) {
		return empresaService.findEmpresaById(id);
	}
	
	@RequestMapping(value = "/empresas/nombre/{nombre}", method = RequestMethod.GET, produces = "application/json")
	public List<Empresa> getEmpresaLikeTitulo(@PathVariable("nombre") String nombre) {
	    System.out.println(nombre);
		return empresaService.findLikeNombre("%"+nombre+"%");
	}
	
	@RequestMapping(value = "/empresas/add", method = RequestMethod.POST, produces = "application/json")
	public Empresa addPostPost(Empresa empresa) {
		return empresaService.saveEmpresa(empresa);
	}

	@RequestMapping(value = "/empresas/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public String deleteEmpresa(@PathVariable Long id) {
		return empresaService.deleteEmpresa(id);
	}
	
	@RequestMapping(value = "/empresas/update", method = RequestMethod.PUT, produces = "application/json")
	public String updateEmpresa(Empresa empresa) {
		return empresaService.updateEmpresa(empresa);
	}
	
	
	
}
