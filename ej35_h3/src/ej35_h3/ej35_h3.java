/*35 USANDO EL EJRCICIO 34, HACER UN PROGRAMA QUE BUSQUE UNA NOTA EN EL VECTOR */


package ej35_h3;

import java.util.Scanner;

public class ej35_h3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
				Scanner teclado = new Scanner(System.in);
				int notas[] = new int[10];// declaración de un vector 
				int indice;
				double suma, media, conta;
				suma = 0;
				int notabuscada;
				boolean encontrada=false;
				
				conta=0;
				
				for( indice = 0; indice <10; indice ++){
				/*	
					notas[indice] = (int)Math.floor(Math.random() * 21 -10);
					suma = suma + v[indice];// CALCULAMOS LA SUMA 
				
				*/
				System.out.print("nota: \t");
				notas[indice] = teclado.nextInt();
				conta++;
				suma = suma +notas[indice];
				}
				
				for( indice= 0; indice < 10; indice ++){
					System.out.print(notas[indice] + ", ");// print (QUEREMOS QUE NO NOS SALTE DE LÍNEA, PORQUE ES UN VECTOR), concatenamos la "," para que separe
				}
				System.out.println("\nLa media es: " + suma/conta); // \n es para dar enter. 

				System.out.println("Introduce la nota que quieras buscar");
				
				notabuscada = teclado.nextInt();
				
				for( indice = 0; indice < 10 && encontrada == false; indice ++){// mientras no se encuentre la nota (encontrada==false), cuando la encuentre (encontrada==true) y salimos del bucle
																				
					if(notas[indice]==notabuscada){
						
					System.out.println("La nota: \t"+notabuscada+"está en la posición \t"+(indice + 1));
					encontrada=true;
							
					}
			}//for	
					// El if(encontrada==false) va fuera del paréntesis porque sino cada vez que hace el for y no encuentra la nota, nos imprime "La nota buscada no se encuentra")
					if(encontrada==false){
						
						System.out.println("La nota buscada" + notabuscada + "no se encuentra");
					}

		}

	}

