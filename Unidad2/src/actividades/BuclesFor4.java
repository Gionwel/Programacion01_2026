package actividades;

import java.util.Scanner;

public class BuclesFor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double media = 0.0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Dime 10 números para realizar la media:");
			int numero = sc.nextInt();

			media = media + numero;
		}
		
		media = media / 10;
		
		System.out.println("La media es: " + media);
		
		sc.close();

	}

}
