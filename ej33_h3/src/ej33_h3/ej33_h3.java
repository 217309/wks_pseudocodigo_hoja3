import java.util.Scanner;



public class ej33_h3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		String vecMuchosNombres[] = {"Ana", "Jose", "Pepe", "Juan" , "Diego", "Manolo", "Agustin", "Pepe", "Manuel", "Federico", "Esteban", "Carmen" , "Tocino" , "Cara Panocha", "Lele",
				"Manu", "Olai" , "Tete" , "Concha"};

	String arrayNombres [] = new String [20];
	
	int indice, indiceAzar;


	for (indice = 0; indice <20; indice ++){
		
		indiceAzar = (int)Math.floor(Math.random()*21);
		
		arrayNombres[indice] = vecMuchosNombres[indiceAzar];
		
	}
	
	for( indice = 0; indice <20 ; indice ++){
		
		System.out.println(arrayNombres[indice]);
	}
		
	}

}
