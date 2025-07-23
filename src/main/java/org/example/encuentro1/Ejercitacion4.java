package org.example.encuentro1;

import java.util.Scanner;

public class Ejercitacion4 {
    public static void main(String[] args) {
        // Escribir un programa que compruebe si un anio es bisiesto. Un anio es bisiesto si es divisible por 4 y
        // no lo es por 100 o si es divisible por 400.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un anio para comprobar si es bisiesto o no: ");
        int anio = scanner.nextInt();

        if((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println("El anio es bisiesto");
        } else {
            System.out.println("El anio no es bisiesto");
        }
    }
}
