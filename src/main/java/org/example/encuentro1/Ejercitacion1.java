package org.example.encuentro1;

import java.util.Scanner;

public class Ejercitacion1 {

    public static void main(String[] args) {
        // Ejercicio 1 --> Escribir un programa que lea 1 numero entero por teclado e indique si es multiplo de 2 o de 3.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese un numero entero: ");
        int numero = scanner.nextInt();

        if(numero%2 == 0){
            System.out.println("El numero es divisible por 2");
        } else {
            if(numero%3==0){
                System.out.println("El numero es divisible por 3");
            } else {
                System.out.println("El numero no es divisible ni por 2 ni por 3");
            }
        }



    }
}
