package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Docente;
import com.example.demo.repository.DocenteRepository;

public class DocenteServiceImpl implements DocenteService{
	
	@Autowired
	DocenteRepository docenteRepository;
	
	@Override
	public List<Docente> findAllDocente() {
		return docenteRepository.findAll();
	}

	@Override
	public Optional<Docente> findDocenteById(Long id) {
		return docenteRepository.findById(id);
	}

	@Override
	public Docente saveDocente(Docente newDocente) {
		return docenteRepository.save(newDocente);
	}

	@Override
	public String deleteDocente(Long id) {
		if (docenteRepository.findById(id) != null) {
			docenteRepository.deleteById(id);
			return "OK";
		}
		return "error: id no existe";
	}

	@Override
	public String updateDocente(Docente docente) {
		if (docenteRepository.findById(docente.getId()) != null) {
			docenteRepository.save(docente);
			return "OK";
		}

		return "error: id no existe";
	}

}
