package actividades;

import java.util.Scanner;

public class BuclesFor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Los multiplos de 7 menores que 100 son:");
	

		for (int i = 0; i <= 100; i+=7) {
			System.out.println(i);

		}

		sc.close();

	}

}
