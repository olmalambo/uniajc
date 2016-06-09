package com.diaz.malambo.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "student")
public class Empleados {
	private static final long serialVersionUID = 1L;
	  
    @XmlAttribute(name = "cedula")
    private int cedula;
  
    @XmlElement(name = "nombre")
    private String nombre;
  
 
    
    public Empleados(){
    	
    	
    }
    
    public int getCedula(){
    	
    	return this.cedula;
    	
    }
    
    public void setCedula(int number) {
    	
    	this.cedula=number;
    }
    
    public void setNombre(String Nombre){
    	
    	this.nombre=Nombre;
    }
    
    public String getNombre(){
    	return this.nombre;
    }
   
    
    
}