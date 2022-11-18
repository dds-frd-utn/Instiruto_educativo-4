package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Aula;
import com.example.demo.repository.AulaRepository;

@Service
public class AulaServiceImpl implements AulaService{
	@Autowired
	AulaRepository aulaRepository; 
									

	@Override
	public List<Aula> findAllAula() {
		return aulaRepository.findAll();
	}

	@Override
	public Optional<Aula> findAulaById(Long id) {
		return aulaRepository.findById(id);
	}

	@Override
	public Aula saveAula(Aula newAula) {
		return aulaRepository.save(newAula);
	}

	@Override
	public String deleteAula(Long id) {
		if (aulaRepository.findById(id) != null) {
			aulaRepository.deleteById(id);
			return "OK";
		}
		return "ERROR: el id no existe";
	}

	@Override
	public String updateAula(Aula aula) {
		if (aulaRepository.findById(aula.getId()) != null) {
			aulaRepository.save(aula);
			return "OK";
		}

		return "ERROR: el id no existe";
	}

}
