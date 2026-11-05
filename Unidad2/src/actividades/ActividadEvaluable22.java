package actividades;

import java.util.Scanner;

public class ActividadEvaluable22 {

    public static void main(String[] args) {
        
    	//Realizar un programa que lea una cadena por teclado y 
    	//convierta las mayúsculas a minúsculas y viceversa.
        // Realizar un programa que lea una cadena por teclado y
        // convierta las mayúsculas a minúsculas y viceversa.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto cualquiera: ");
        String texto = sc.nextLine();

        String resultado = "";
        

            char letra = texto.charAt(i);

            if (Character.isUpperCase(letra)) {
                resultado += Character.toLowerCase(letra);
            } 
            else if (Character.isLowerCase(letra)) {
                resultado += Character.toUpperCase(letra);
   
    }
}
