package actividades;


import java.util.Scanner;

public class BuclesFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número:");
		int numero = sc.nextInt();
		
		int i = numero;
		
		for (i= 0; i<3; i++) {
			System.out.println("¿Hoy vamos a ver una peli, Vladi?");
			
		}

		sc.close();
	}

}
