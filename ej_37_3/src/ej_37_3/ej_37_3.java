/*37.-Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1 y 100, y hacer su matriz transpuesta.*/	



package ej_37_3;

public class ej_37_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz [][]= new int [4][5];
		int  matrizT[][] = new int [5][4];
		int i,j;
		
		// Recorremos la matriz. Fijamos la fila y vamos recorriendo las columnas hasta que j=5 q entonces salimos del segundo for y volvemos al 1er for (pasando a la fila 1)
		 
		for (i = 0; i <4; i++) {
			  for (j = 0; j <5; j++) {	 	

			  matriz[i][j] = (int)Math.floor(Math.random()* 101);
			
			  }
		  
		 }
		
		
	    System.out.println("valores introducidos:");
	    for (i = 0; i < 4; i++) { 
	        for (j = 0; j < 5; j++) {
	            System.out.printf("%5d",matriz[i][j]); // VAMOS IMPRIMIENDO CADA FILA. %d (formato de número entero) el 5 indica que utiliza 5 posiciones. 
	        }
	    }// Vuelve al inciio del for
	    
	    
	    System.out.println("MATRIZ TRASPUESTA");
	    for (i= 0; i < 5; i++) {
	    	  for (j = 0; j < 4; j++) {
	   	    matrizT[j][i] = matriz[i][j];     
	    	  }
	   System.out.printf("%5d",matrizT[j][i]);	 
	   
	    }
	    
	
	
	}

}
