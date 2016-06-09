package com.diaz.malambo.Listas;

public class Paciente {

	private int cedula;
	private String nombre;
	
	public int getCedula() {
		return cedula;
	}
	
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/*
	 * Constructor de paciente
	 */
	public Paciente(){
		
		
	}
	public Paciente(int iden, String nombre){
		this.cedula = iden;
		this.nombre = nombre;
	}

	
}