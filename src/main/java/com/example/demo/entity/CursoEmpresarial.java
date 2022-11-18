package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cursos_empresariales")
public class CursoEmpresarial {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;
	@Column(name = "precio_total")
	int precio_total;
	@OneToOne(fetch = FetchType.LAZY)
	@Column(name = "id_empresa")
	Empresa empresa;
	@Column(name = "cantidad_alumnos")
	int cantidad_alumnos;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_curso")
	Curso curso;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getPrecio_total() {
		return precio_total;
	}
	public void setPrecio_total(int precio_total) {
		this.precio_total = precio_total;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public int getCantidad_alumnos() {
		return cantidad_alumnos;
	}
	public void setCantidad_alumnos(int cantidad_alumnos) {
		this.cantidad_alumnos = cantidad_alumnos;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
