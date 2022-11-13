package com.pacoteck.springboot.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacoteck.springboot.app.dto.Empleado;

public interface EmpleadoDAO extends JpaRepository<Empleado, Long>{

	public List<Empleado> findAll();
	
	public Optional<Empleado> findById(Long id);
	
	public void deleteById(Long id);
}
