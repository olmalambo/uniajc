package com.diaz.malambo.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.diaz.malambo.object.DataObject;
import com.diaz.malambo.object.Empleados;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*ListaPacientes pa=new ListaPacientes();
Paciente pacienteAdd=new Paciente(8,"AA");

pa.insertarOrdenado(pacienteAdd);


Paciente pacienteAdd1=new Paciente(9,"BBB");


pa.insertarOrdenado(pacienteAdd1);

Paciente pacienteAdd2=new Paciente(10,"EEEAD");


pa.insertarOrdenado(pacienteAdd2);

Paciente pacienteAdd3=new Paciente(11,"fff");


pa.insertarOrdenado(pacienteAdd3);

/*pa.mostrarAdelante();
pa.mostrarAtras();*/

/*Paciente b=pa.Buscar(8);
System.out.println("datos "+b.getCedula()+" "+b.getNombre());*/
/*pa.eliminaValor(9);

List<Paciente>pac=pa.mostrarAtras();

for(Paciente paciente:pac ){
	
	System.out.println(paciente.getNombre());
}
*/
String paci="{'tabla': '1=hello; 2=bye;', 'remove': '1'}";

ArrayList array=new ArrayList();
String[] numerosComoArray = paci.split(",");
for (int i = 0; i < numerosComoArray.length; i++) {

	
    String[] datos=numerosComoArray[0].split("=");
	
  //  System.out.println(numerosComoArray[0]);
    for(int j=0;j<datos.length;j++){
    	String[] data=datos[j].split(";");
    	    	   	
    	for(int k=0;k<data.length;k++){
    		System.out.println(data[k]);
    	//	System.out.println(data[k]+" "+k);
    		array.add(data[k]);
    	}
   
    }
    //Paciente pas=new Paciente(Integer.parseInt(datos[0]),datos[1]);
    
    
 }
 
for(int i = 0;i<array.size();i++){
	//System.out.println(array.get(i)+" "+i);
	
	String[] data=array.get(i).toString().split("tabla");
	 
   
    
    for(int j=0;j<data.length;j++){
    	
    	// System.out.println(data[j]+"  J "+j);
    }
  
}

/*String[] numerosComoArray = paci.split(";");
for (int i = 0; i < numerosComoArray.length; i++) {
      String[] datos=numerosComoArray[i].split("=");
      System.out.println("Cedula "+Integer.parseInt(datos[0].trim())+"  NOMBRE  "+datos[1]);
      //Paciente pas=new Paciente(Integer.parseInt(datos[0]),datos[1]);
      
      
   }*/
	}

}
