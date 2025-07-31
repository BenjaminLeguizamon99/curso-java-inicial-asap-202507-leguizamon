package org.example.encuentro4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero y vamos a verificar si es primo o no: ");
        int numero = scanner.nextInt();
        verificarNumeroPrimo(numero);
    }

    public static void verificarNumeroPrimo(int num) {
        int cantidadDivisores = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0) {
                cantidadDivisores += 1;
            }
        }
        if(cantidadDivisores > 2) {
            System.out.println("El numero NO es primo");
        } else {
            System.out.println("El numero es primo");
        }
    }
}
