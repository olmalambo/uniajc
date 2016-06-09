package com.diaz.malambo.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "student")
public class Usuario {
	private static final long serialVersionUID = 1L;
	  
    @XmlAttribute(name = "id")
    private int Numero;
  
    @XmlElement(name = "paquete")
    private String paquete;
  
    @XmlElement(name = "fecha_vencimiento")
    private String fecha_vencimiento;
    
    @XmlElement(name = "duracion")
    private String duracion;
    
    public Usuario(){
    	
    	
    }
    
    public int getNumero(){
    	
    	return this.Numero;
    	
    }
    
    public void setNumero(int number) {
    	
    	this.Numero=number;
    }
    
    public void setPaquete(String packag){
    	
    	this.paquete=packag;
    }
    
    public String getPaquete(){
    	
    	return this.paquete;
    }
    
    public void  setFecha(String fecha){
    	this.fecha_vencimiento=fecha;
    	
    }
    public String getFecha(){
    	
    	return this.fecha_vencimiento;
    }
    
    public void SetDuracion(String duracion){
    	
    	this.duracion=duracion;
    	
    	
    }
    
    public String getDuracion(){
    	
    	return this.duracion;
    }
}
