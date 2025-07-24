package org.example.encuentro2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercitacion1 {
    public static void main(String[] args) {
        // Escribir un programa que muestre los N primeros numeros de la serie de Fibonacci. El valor de N se lee por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros de la serie de Fibonacci que quiere ver: ");
        int cantidad = scanner.nextInt();

        if(cantidad <= 0) {
            System.out.println("El numero ingresado debe ser mayor a cero");
        }

        int a = 1;
        int b = 1;

        // Mostrar los primeros dos números si la cantidad lo permite
        if (cantidad >= 1) System.out.println(a);
        if (cantidad >= 2) System.out.println(b);

        for(int i = 0; i < cantidad; i++) {
            int nsig = a + b;
            System.out.println(nsig);
            a = b;
            b = nsig;
        }

    }
}

