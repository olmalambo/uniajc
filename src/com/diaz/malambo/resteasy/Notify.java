package com.diaz.malambo.resteasy;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.Form;

import com.diaz.malambo.Listas.ListaPacientes;
import com.diaz.malambo.Listas.Paciente;
import com.diaz.malambo.matrices.GaussJordan;
import com.diaz.malambo.object.Derivar;
import com.diaz.malambo.object.Empleados;
import com.diaz.malambo.object.Matriz;
import com.diaz.malambo.object.Packages;
import com.diaz.malambo.object.Student;
import com.diaz.malambo.object.Usuario;
import com.diaz.malambo.object.retornado;
import com.google.gson.Gson;







@Path("Notify")
public class Notify {
	
	ListaPacientes pa= new ListaPacientes() ;
	
String my_log = "";
	
	
	@POST
	@Path("/getDataPaciente")
	@Consumes("application/json")
    public Response getDataPaciente(@DefaultValue("Empleados") String paci) {
		
		/*
		 * Codigo Juan Carlos
		 * 
		 */
		System.out.println(paci);
		String[] numerosComoArray = paci.split(";");
		for (int i = 0; i < numerosComoArray.length; i++) {
		      String[] datos=numerosComoArray[i].split("=");
		    
		      Paciente pas=new Paciente(Integer.parseInt(datos[0].trim()),datos[1]);
		      
		      pa.insertarOrdenado(pas);
		   }
		List<Empleados> emp=new LinkedList<Empleados>();
		//pa.mostrarAdelante();
		List<Paciente>pac=pa.mostrarAtras();
		System.out.println(pac);
		for(Paciente paciente:pac ){
			Empleados emp1=new Empleados();
			emp1.setCedula(paciente.getCedula());
			emp1.setNombre(paciente.getNombre());
			emp.add(emp1);
			System.out.println(paciente.getNombre());
		}
		
		Gson gson = new Gson(); 
		
		
		
				
				
				
			
			
		String  formatoJson	=	gson.toJson(emp);
        
        //DAO code goes here. Database interactions happen here.
        return Response.status(201).entity(formatoJson).build();
    }
	
	@POST
	@Path("/CreatePaciente")
	@Consumes("application/json")
    public Response CreatePaciente(@DefaultValue("Empleados") String paci) {
		
		/*
		 * Codigo Juan Carlos
		 * 
		 */
		System.out.println(paci);
		Gson gson = new Gson(); 
		Empleados u = gson.fromJson(paci,Empleados.class);

		Paciente pa1=new Paciente(u.getCedula(),u.getNombre());
		pa.insertarOrdenado(pa1);
		
		
		
		
				
				
				
			
			
		
        //DAO code goes here. Database interactions happen here.
        return Response.status(201).entity("Registro Ingresado").build();
    }
	
	
	@POST
	@Path("/deletePaciente")
	@Consumes("application/json")
    public Response deletePaciente(@DefaultValue("Empleados") String paci) {
		
		/*
		 * Codigo Juan Carlos
		 * 
		 */
		System.out.println(paci);
		/*String[] numerosComoArray = paci.split(";");
		for (int i = 0; i < numerosComoArray.length; i++) {
		      String[] datos=numerosComoArray[i].split("=");
		    
		      Paciente pas=new Paciente(Integer.parseInt(datos[0].trim()),datos[1]);
		      
		      pa.insertarOrdenado(pas);
		   }
		
		
		Gson gson = new Gson(); 
		
		
		pa.eliminaValor(1);*/
		Gson gson = new Gson(); 
		String  formatoJson	=	gson.toJson("El registro se ha eliminado");
        
        //DAO code goes here. Database interactions happen here.
        return Response.status(201).entity(formatoJson).build();
    }
	
	
	@POST
	@Path("/getDerivate")
	@Consumes("application/json")
    public Response Derivate(@DefaultValue("operacion") String paci) {
		
		Derivar dev=new Derivar();
		String respues=dev.hallar_derivada("(24x-x^2(4+3.1416))/8");
		//String respuesta=dev.hallar_derivada(respues);
		
		String res=dev.calcular(respues);
		
		return Response.status(201).entity(respues).build();
		
	}
	@POST
	@Path("/createMatriz")
	@Consumes("application/json")
    public Response createMatriz(@DefaultValue("Matriz") String paci) {
		
		
	
		ArrayList arr=new ArrayList();
		Gson gson = new Gson(); 
		Matriz u = gson.fromJson(paci,Matriz.class);
		GaussJordan gaus=new GaussJordan();
		String[] valor=u.getVar().split(",");
		int piv=0;
		int colum = u.getColumnas();
		int filas= u.getFilas();
		float matriz[][]=new float[filas][colum];
		
			System.out.println(valor.length);/***********************/my_log += "\n"+valor.length;
			
			
				
				//for(int k=0;k<valor.length;k++){
					
				//	matriz[j][k] = Integer.parseInt(valor[k]);
					//System.out.println(" "+valor[k]);
				//}
				
			int contador = 0;
			for(int i=0;i<filas;i++)
			{
				
				for(int j=0;j<colum;j++)
				{
					matriz[i][j]= Integer.parseInt(valor[contador]);
					contador++;
				}
			}
						
			System.out.println("Longitud Matriz: "+matriz.length);/***********************/my_log += "\n"+"Longitud Matriz"+matriz.length+"\n  <br>";
			 for (int x = 0; x < u.getFilas(); x++) {
		            for (int y = 0; y < u.getColumnas(); y++) {
		                System.out.print(" " + matriz[x][y] + " |");
		                /***********************/my_log += ""+" " + matriz[x][y] + " |";
		            }
		            System.out.println("");
		            /***********************/my_log += "\n"+"<br>";
		        }
			
			 	System.out.println("");
	            System.out.println("");
			for (int a = 0; a < u.getFilas(); a++) {
				my_log+="se divide por "+(gaus.pivote(matriz, piv, u.getFilas()));

	            System.out.println("\tRenglon " + (a + 1) + " entre el pivote <br>");
	            /***********************/my_log += "\n <br>"+"Renglon " + (a + 1) + " entre el pivote";
	            my_log+=  gaus.muestramatriz(matriz, u.getFilas(),"");

	            System.out.println("");

	            System.out.println("\tHaciendo ceros");
	            /***********************/my_log += " "+"haciendo ceros <br>";
	            double h= gaus.hacerceros(matriz, piv, u.getFilas());
	            		if(h != 0){
	            			my_log+="se multiplica"+h ;
	            			
	            		}
	            

	            		 my_log+= gaus.muestramatriz(matriz, u.getFilas(),"");
	            System.out.println("");
	            /***********************/my_log += "\n"+" <br>";
	            piv++;
	        }
			String resultado="";
	        for (int x = 0; x < u.getFilas(); x++) {
	        	resultado+=Math.round( matriz[x][(u.getFilas()-1)] ) +",";
	            System.out.println("La variable X" +x + " es: " +  Math.round( matriz[x][(u.getFilas()-1)] ) );

	            /***********************/my_log += "\n <br>"+"La variable X" + x + " es: " +  Math.round( matriz[x][(u.getFilas()-1)] ) ;
	        }
		
		
		 
		
		
	        Gson gson1 = new Gson(); 
			
			String  formatoJson2	=	gson1.toJson(arr);
		
		
			System.out.println(formatoJson2);
				
			retornado retorn =new retornado();
			retorn.setProceso(my_log);
			retorn.setInfore(resultado);
			String  formatoJson	=	gson1.toJson(retorn);
			System.out.println("***************************************************************");
			System.out.println(my_log);/*Hasta aca voy solo lo almaceno aun no lo devuelvo ni nada*/

        return Response.status(201).entity(formatoJson).build();
    }
}
