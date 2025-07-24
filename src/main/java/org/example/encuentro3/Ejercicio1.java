package org.example.encuentro3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Escribir un programa que lea la altura de N personas y calcule:
        // 1 - la altura media


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de valores que quiere cargar: ");
        int cant = scanner.nextInt();

        ArrayList<Float> alturas = new ArrayList<>();

        for(int i = 0; i < cant; i++) {
            System.out.println("Ingrese el valor numero " + i + ":");
            alturas.add(scanner.nextFloat());
        }
        System.out.println(alturas);

        // calculamos la altura media
        int contador = 0;
        float acum = 0;
        for(int i = 0; i < alturas.size(); i++) {
            contador += 1;
            acum += alturas.get(i);
        }

        float media = 0;
        if(contador > 0) {
            media = acum/contador;
        }
        float redondeado = Math.round(media * 100) / 100f;
        System.out.println("El promedio de alturas es de:" + redondeado);

        // 2 - cuantas personas tienen una altura superior a la media

        int cantMayorMedia = 0;
        for(int i = 0; i < alturas.size(); i++) {
            if(alturas.get(i) > redondeado) {
                cantMayorMedia += 1;
            }
        }

        System.out.println("La cantidad de personas con altura mayor a la altura media es de: " + cantMayorMedia);

        // 3 - cuantas tienen una altura inferior a la media
        int cantMenorMedia = 0;
        for(int i = 0; i < alturas.size(); i++) {
            if(alturas.get(i) < redondeado) {
                cantMenorMedia += 1;
            }
        }

        System.out.println("La cantidad de personas con altura menor a la altura media es de: " + cantMenorMedia);

    }
}
