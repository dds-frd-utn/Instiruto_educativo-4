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
@Table(name = "cursos_personales")
public class CursoPersonal {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;
	@Column(name = "precio_por_alumo")
	int precio_por_alumno;
	@OneToOne(fetch = FetchType.LAZY)
	@Column(name = "id_aula")
	Aula id_aula;
	@Column(name = "cantidad_alumnos")
	int cantidad_alumnos;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_curso")
	Tema curso;

}
