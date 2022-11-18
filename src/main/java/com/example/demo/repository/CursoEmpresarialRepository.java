package com.example.demo.repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.CursoEmpresarial;

public interface CursoEmpresarialRepository extends JpaRepository<CursoEmpresarial, Long>{
	void save(Optional<CursoEmpresarial> CursoEmpresarialToUpdate);
	
	@Query(value = "select c.id, c.nombre, c.id_tema, c.fecha_inicio, c.id_docente from cursos_personales as cp join alumno_curso_personal as acp on cp.id = acp.id_curso_personal INNER JOIN cursos AS c ON cp.id_curso = c.id where acp.id_alumno=:id", nativeQuery = true)
	List<CursoEmpresarial> findAllCursoEmpresarial(@Param("id") Long id);

}
