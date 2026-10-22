package actividades;

import java.util.Scanner;

public class Diapositiva9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;

		double promedio = 0.0;
		double sumatorio = 0.0;
		
		
		
		
		while (cont < 10) {
			System.out.printf("Introduce un número %d: \n", cont+1);
			double numero = sc.nextDouble();
			
			sumatorio = sumatorio + numero;
			
			
			cont =+ 1;
		}
		
		
		
		
		
		
	}

}
