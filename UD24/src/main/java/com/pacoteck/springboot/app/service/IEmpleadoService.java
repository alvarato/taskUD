package com.pacoteck.springboot.app.service;

import java.util.List;
import java.util.Optional;

import com.pacoteck.springboot.app.dto.Empleado;


public interface IEmpleadoService {

	public void deleteById(Long id);
	public List<Empleado> findAll();
	public void createUpdate(Empleado empleado);
	public List<Empleado> findByTrabajo(String trabajo);
	public Optional<Empleado> findById(Long id);
}
