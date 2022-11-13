package com.pacoteck.springboot.app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="trabajo")
	private String trabajo;
	
	@Column(name="salario")
	private int salario;
	
	public Empleado() {}

	public Empleado(Long id, String nombre, String trabajo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = Trabajos.salarios(trabajo);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	
}
