import java.util.*;
public class Ejercicio1{

	public static void main (String [] args){

		int numero ;
		int aleatorio;
		int par = 0;
		int impar = 0;


		Scanner entrada =  new Scanner (System.in);

		System.out.print ("Ingresa la cantidad de numeros :");
		numero = entrada.nextInt();

		for (int i = 0; i < numero ; i++) {

			aleatorio = (int)(Math.random()*100+1);
			System.out.print ( "\n"+aleatorio);

			if ( aleatorio % 2 == 0 ) {

				par = par+1;
				System.out.println ("-> El numero es par\n");


			} else {

				impar = impar +1 ;
				System.out.println("-> El numero es impar\n");
			}
		}

		System.out.println (" La cantidad de numeros pares son: "+ par+"\n" );
		System.out.println(" La cantidad de numeros impares son: " + impar); 

	}

}

