package com.diaz.malambo.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "student")
public class Packages {
	
	
	private static final long serialVersionUID = 1L;
	  
    @XmlAttribute(name = "id")
    private int id;
  
    @XmlElement(name = "datos")
    private String datos;
  
    @XmlElement(name = "infoPlan")
    private String infoPlan;
    
    @XmlElement(name = "fecha_vencimiento")
    private String fecha_vencimiento;
    
    @XmlElement(name = "duracion")
    private String duracion;
    
    @XmlElement(name = "precio")
    private String precio;
    public Packages(){
    	
    	
    }
    
    public int getId(){
    	
    	return this.id;
    	
    }
    
    public void setId(int number) {
    	
    	this.id=number;
    }
    
    public void setDatos(String packag){
    	
    	this.datos=packag;
    }
    
    public String getDatos(){
    	
    	return this.datos;
    }
    public void setInfoPlan(String informacion){
    	this.infoPlan=informacion;
    	
    }
    public String getInfoPlan(){
    	
    	return this.infoPlan;
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
    
    public String getPrecio(){
    	
    	return this.precio;
    }
    public void setPrecio(String precio){
    	
    	this.precio=precio;
    }
}
