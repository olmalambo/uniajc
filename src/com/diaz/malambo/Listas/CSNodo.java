package com.diaz.malambo.Listas;



public class CSNodo {
	
	public Paciente paciente;
	public CSNodo anterior;
	public CSNodo siguiente;
	
	
	
	public CSNodo(Paciente paciente){
		this.paciente = paciente;
		siguiente=anterior=null; 
	}

	
}
