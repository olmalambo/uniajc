package com.diaz.malambo.matrices;

import java.util.Scanner;

public class prueba2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner leer = new Scanner(System.in);
		  GaussJordan j=new GaussJordan();
	        int var = 0, piv = 0;
	        float matriz[][];
	        System.out.println("\t ** Este programa nos muestra la solución de un sistema de ecuaciones \n\t\tlineales a través del método Gauss_Jordan **");
	        System.out.println("\n¿Cuantas variables tiene tu sistema?");
	        var = leer.nextInt();
	        matriz = new float[var][var + 1];
	        for (int x = 0; x < var; x++) {
	            for (int y = 0; y < (var + 1); y++) {
	                System.out.println("Ingresa la constante de la posicion: A[" + (x + 1) + "][" + (y + 1) + "]");
	                matriz[x][y] = leer.nextFloat();
	            }

	        }

	        for (int a = 0; a < var; a++) {
	            j.pivote(matriz, piv, var);

	            System.out.println("\tRenglon " + (a + 1) + " entre el pivote");
	            j.muestramatriz(matriz, var,"");

	            System.out.println("");

	            System.out.println("\tHaciendo ceros");
	            j.hacerceros(matriz, piv, var);

	            j.muestramatriz(matriz, var,"");
	            System.out.println("");
	            piv++;
	        }
	        for (int x = 0; x < var; x++) {
	            System.out.println("La variable X" + (x + 1) + " es: " + matriz[x][var]);
	        }

	    }
	}


