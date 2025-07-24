package org.example.encuentro2;

import java.util.Scanner;

public class Ejercitacion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        do {
            System.out.println("Ingrese un numero entero positivo");
            numero = scanner.nextInt();
        } while(numero <= 0);

        String numeroString = Integer.toString(numero);
        int sumaDigitos = 0;
        for(int i = 0; i < numeroString.length(); i++){
            int digito = Character.getNumericValue(numeroString.charAt(i));
            sumaDigitos += digito;
        }

        System.out.println("La suma de los digitos de " + numero + " es de: " + sumaDigitos);
    }
}
