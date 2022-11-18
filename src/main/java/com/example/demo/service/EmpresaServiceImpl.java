package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Empresa;
import com.example.demo.repository.EmpresaRepository;

public class EmpresaServiceImpl implements EmpresaService{
	@Autowired
	EmpresaRepository empresaRepository;

	@Override
	public List<Empresa> findAllEmpresa() {
		return empresaRepository.findAll();
	}

	@Override
	public Optional<Empresa> findEmpresaById(Long id) {
		return empresaRepository.findById(id);
	}

	@Override
	public Empresa saveEmpresa(Empresa newEmpresa) {
		return empresaRepository.save(newEmpresa);
	}

	@Override
	public String deleteEmpresa(Long id) {
		if (empresaRepository.findById(id) != null) {
			empresaRepository.deleteById(id);
			return "OK";
		}
		return "ERROR: el id no existe";
	}

	@Override
	public String updateEmpresa(Empresa empresa) {
		if (empresaRepository.findById(empresa.getId()) != null) {
			empresaRepository.save(empresa);
			return "OK";
		}
		return "ERROR: el id no existe";
	}

	@Override
	public List<Empresa> findLikeNombre(String nombre) {
		return empresaRepository.findLikeNombre(nombre);
	}

}
