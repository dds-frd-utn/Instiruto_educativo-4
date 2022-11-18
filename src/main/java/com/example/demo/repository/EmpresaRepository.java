package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
void save(Optional<Empresa> EmpresaToUpdate);
	
	@Query(value = "select * from empresas as t where t.nombre like :nombre", nativeQuery = true)  
	List<Empresa> findLikeNombre(@Param("nombre")String nombre);

}
