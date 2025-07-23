package org.example.encuentro1;

import java.util.Scanner;

public class Ejercitacion3 {
    public static void main(String[] args) {
        // Escribir un programa que pida por teclado una calificacion numerica entre 0 y 10 y muestre por panralla su
        // correspondiente calificacion alfabetica
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una calificacion entre 0 y 10");
        int nota = scanner.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Debe estar entre 0 y 10.");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
}
