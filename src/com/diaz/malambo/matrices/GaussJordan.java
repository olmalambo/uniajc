package com.diaz.malambo.matrices;

public class GaussJordan {
	public String muestramatriz(float matriz[][], int var,String mylog) {
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < var ; y++) {
            	mylog+=" " + matriz[x][y] + " |";
                System.out.print(" " + matriz[x][y] + " |");
            }
            mylog+="<br>";
            System.out.println("");
        }
        return mylog;

    }

    public float pivote(float matriz[][], int piv, int var) {
        float temp = 0;
        temp = matriz[piv][piv];
        
        for (int y = 0; y < var; y++) {

            matriz[piv][y] = matriz[piv][y] / temp;
        }
        return temp;
    }

    public double hacerceros(float matriz[][], int piv, int var) {
    	double f=0;
        for (int x = 0; x < var; x++) {
            if (x != piv) {
                float c = matriz[x][piv];
                for (int z = 0; z < var ; z++) {
                	
                    matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
                     f= ((-1 * c) * matriz[piv][z]);
                }
            }
        }
        
        return f;
    }

}
