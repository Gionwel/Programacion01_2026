package actividades;

import java.util.Scanner;

public class BuclesFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número:");
		int numero = sc.nextInt();

		int i = numero;

		for (i = 1; i <=numero; i++) {
			System.out.println(i);

		}

		sc.close();

	}

}
