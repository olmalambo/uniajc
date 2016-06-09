package com.diaz.malambo.Listas;

import java.util.LinkedList;
import java.util.List;



public class ListaPacientes {
	CSNodo first,last; 
	public void insertar(Paciente a) 
	 { 
	 //if no hay datos 
		if(first==null) 
		{ 
			first=new CSNodo(a); 
			last=first; 
		} 
	 //si por lo menos hay un dato 
		else 
		{ 
	 //crea un nuevo nodo temp 
			CSNodo temp=new CSNodo(a); 
			last.siguiente=temp; 
			temp.anterior=last; 
			last=temp; 
		} 
	 } 
	public void mostrarAdelante() 
	 { 
		CSNodo aux=first; 
		while(aux!=null) 
		{ 
			System.out.println(aux.paciente.getNombre()); 
			aux=aux.siguiente; 
		} 
	 } 
	public List<Paciente> mostrarAtras() 
	 { 
		
		 List<Paciente> pacientes = new LinkedList<Paciente>();
		CSNodo aux=last; 
		while(aux!=null) 
		{ 
			Paciente pa=new Paciente(aux.paciente.getCedula(),aux.paciente.getNombre());
			
			System.out.print("se muestra hacia atras "+aux.paciente.getNombre()); 
			aux=aux.anterior; 
			pacientes.add(pa);
		} 
		
		return pacientes;
	 } 
	
	public Paciente Buscar(int cedula) 
	 { 
		Paciente pa = null;
		CSNodo aux=last; 
		while(aux!=null) 
		{ 
			if(aux.paciente.getCedula()==cedula){
				
				pa=aux.paciente;
			
			}
			aux=aux.anterior; 
		} 
		
		return pa;
	 } 
	public void insertarOrdenado(Paciente a) 
	 { 
	 //si no hay nodos 
		if(first==null) 
		{ 
			first=new CSNodo(a); 
			last=first; 
	 } 
	 
	 else 
	 { 
	 //creamos un nuevo nodo 
		 CSNodo temp=new CSNodo(a); 
	 //si el nodo a insertar es menor que el primer dato 
		 if(temp.paciente.getCedula()<first.paciente.getCedula()) 
		 { 
			 temp.siguiente=first; 
			 first.anterior=temp; 
			 first=temp; 
		 } 
	 
	 else 
	 { 
		CSNodo aux=first.siguiente; 
	 
		 CSNodo antes=first; 
		 while(aux!=null && temp.paciente.getCedula()>aux.paciente.getCedula()) 
		 { 
			 aux=aux.siguiente; 
			 antes=antes.siguiente; 
		 } 
		 antes.siguiente=temp; 
		 temp.anterior=antes; 
		 if(aux!=null) 
		 { 
			 temp.siguiente=aux; 
			 aux.anterior=temp; 
		 } 
	 else 
		 last=temp; 
	 	} 
	 	} 
	 }
	
	
	
	public boolean eliminaValor(Integer valor){
        if (first != null){
        	CSNodo aux = first;
        	CSNodo ant = null;
                   while (aux != null){
                               if (aux.paciente.getCedula() == valor ){
                                           if (ant == null){
                                        	   first = first.siguiente;
                                                       aux.siguiente=null;
                                                       aux= first;
                                          
                                           }else {
                                        	   System.out.println(aux.paciente.getCedula());
                                                       
                                        	   ant.siguiente=aux.siguiente;
                                                       CSNodo temporal;
                                                       temporal=aux.siguiente;
                                                       temporal.anterior=ant;
                                                       return true;
                                           }                                             
                                           }else{
                                                       ant = aux;
                                                       aux = aux.siguiente;
                                           }
                               }
                   
                  
                   }
        return false;
                  
        }
}
