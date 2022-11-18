package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Docente;

public interface DocenteService {
	public List<Docente> findAllDocente();

	public Optional<Docente> findDocenteById(Long id);

	public Docente saveDocente(Docente newDocente);

	public String deleteDocente(Long id);

	public String updateDocente(Docente docente);

}
