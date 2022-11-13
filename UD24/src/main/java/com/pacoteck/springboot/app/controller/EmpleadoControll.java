package com.pacoteck.springboot.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pacoteck.springboot.app.dto.Empleado;
import com.pacoteck.springboot.app.service.EmpleadoServiceImp;

@RestController
@RequestMapping("/empleados")
public class EmpleadoControll {

	@Autowired
	EmpleadoServiceImp imp;
	
	@GetMapping("/findAll")
	public List<Empleado> findAll(){
		return imp.findAll();
	}
	
	@GetMapping()
	public String empleados() {
		return "Empleados";
	}
	
	@PutMapping(path = "/delete{id}")
	public void deleteById(@PathVariable("id") Long id) {
		imp.deleteById(id);
	}
	
	@PutMapping("/new")
	public void create(@RequestBody Empleado empleado) {
		imp.createUpdate(empleado);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Empleado empleado) {
		Optional<Empleado> aux = imp.findById(empleado.getId());
		if(aux != null) {
			imp.createUpdate(empleado);
		}
	}
	
	@GetMapping(path="/findByJob{trabajo}")
	public List<Empleado> findByJob(@PathVariable("trabajo") String trabajo){
		trabajo = trabajo.toUpperCase();
		return imp.findByTrabajo(trabajo);
	}
}
