package com.pacoteck.springboot.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pacoteck.springboot.app.dao.EmpleadoDAO;
import com.pacoteck.springboot.app.dto.Empleado;

@Service
public class EmpleadoServiceImp implements IEmpleadoService{

	@Autowired
	EmpleadoDAO dao;

	@Override
	public void deleteById(Long id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Empleado> findAll() {
		return dao.findAll();
	}

	@Override
	public void createUpdate(Empleado empleado) {
		dao.save(empleado);
		
	}

	@Override
	public List<Empleado> findByTrabajo(String trabajo) {
		List<Empleado> aux = dao.findAll();
		List<Empleado> send = new ArrayList();
		for (Empleado empleado : aux) {
			if(empleado.getTrabajo().equals(trabajo)) {
				send.add(empleado);
			}
		}
		return send;
	}

	@Override
	public Optional<Empleado> findById(Long id) {
		return dao.findById(id);
	}
	
}

