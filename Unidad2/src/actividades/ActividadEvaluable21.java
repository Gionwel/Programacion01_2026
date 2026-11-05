package actividades;

import java.util.Scanner;

public class ActividadEvaluable21 {

    public static void main(String[] args) {
    	

		//cuántos dígitos pares tiene y cuánto suman los dígitos pares.
		//Usa long en lugar de int a la hora de pedir el número para admitir
		//números largos.


		//Realizar el ejercicio en Eclipse y pegar el resultado en la caja
		//de texto de esta tarea en Moodle (Ctrl+A para seleccionar todo,
		//Ctrl+C para copiar y Ctrl+V para pegar).
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero positivo:");
        long numero = sc.nextLong();

        int contador = 0;
        int suma = 0;

        while (numero > 0) {
            
            long digito = numero % 10;

            if (digito % 2 == 0) {
                contador++;
                suma += digito;
            }

            numero = numero / 10;
        }

        System.out.println("Cantidad de digitos pares: " + contador);
        System.out.println("Suma de los digitos pares: " + suma);
        
        

        sc.close();
    }
}
