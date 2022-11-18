package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Empresa;

public interface EmpresaService {
	public List<Empresa> findAllEmpresa();

	public Optional<Empresa> findEmpresaById(Long id);

	public Empresa saveEmpresa(Empresa newEmpredsa);

	public String deleteEmpresa(Long id);

	public String updateEmpresa(Empresa empresa);
	
	public List<Empresa> findLikeNombre(String nombre);

}
