/*34 HACER UN PROGRAMA QUE LEA LAS CALIFICACIONES DE UN ALUMNO EN 10 ASIGNATURAS LAS ALMACENE EN UN 
  UN VECTOR Y CALCULE E IMPRIMA SU MEDIA*/

package ej_34_h3;

import java.util.Scanner;

public class ej_34_h3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner teclado = new Scanner(System.in);
			int notas[] = new int[10];// declaración de un vector 
			int indice;
			double suma, media, conta;
			suma = 0;
			
			conta=0;
			
			for( indice = 0; indice <10; indice ++){
			/*	
				notas[indice] = (int)Math.floor(Math.random() * 21 -10);
				suma = suma + v[indice];// CALCULAMOS LA SUMA 
			
			*/
			System.out.print("nota:");
			notas[indice] = teclado.nextInt();
			conta++;
			suma = suma +notas[indice];
			}
			
			for( indice = 0; indice < 10; indice ++){
				System.out.print(notas[indice] + ", ");// print (QUEREMOS QUE NO NOS SALTE DE LÍNEA, PORQUE ES UN VECTOR), concatenamos la "," para que separe
			}
			
			
			System.out.println("\nLa media es: " + suma/conta); // \n es para dar enter. 

		
	}

}
