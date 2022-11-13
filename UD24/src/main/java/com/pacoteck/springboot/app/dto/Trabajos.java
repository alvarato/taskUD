package com.pacoteck.springboot.app.dto;

public enum Trabajos {
	
	JEFE,SENIOR,JUNIOR;
	
	
	public static int salarios(String trabajo) {
		trabajo.toUpperCase();
		if(JEFE.equals(trabajo)) return 50000;
		else if(SENIOR.equals(trabajo)) return 35000;
		return 20000;
	}
}
