package com.diaz.malambo.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "student")
public class Matriz {
	
	 @XmlAttribute(name = "columnas")
	 private int columnas;
	 
	 @XmlAttribute(name = "filas")
	 private int filas;
	 
	 @XmlAttribute(name = "x")
	 private String x;
	 
	
	 
	 public void setVar(String variable){
		 
		 this.x=variable;
	 }
	 public String getVar(){
		 return this.x;
	 }
	
	 public void setColumnas(int columna){
		 
		 this.columnas=columna;
	 }
	 public int getColumnas(){
		 
		 return this.columnas;
	 }
	 
	 public void setFilas(int fila){
		 this.filas=fila;
	 }
	 
	 public int getFilas(){
		 return this.filas;
	 }
}
