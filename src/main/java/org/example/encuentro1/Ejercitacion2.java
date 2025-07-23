package org.example.encuentro1;

import java.util.Scanner;

public class Ejercitacion2 {
    public static void main(String[] args) {
        // Ejercicio 2 --> Escribir un programa que pida por teclado la fecha de nacimiento de una persona y calcule su
        // numero de la suerte.
        // El numero de la suerte se calcula sumando el dia, mes y anio de la fecha de nacimiento y a continuacion sumando
        // las cifras obtenidas en la suma.
        // Por ejemplo si la fecha es 12/7/1980 -> 12 + 7 + 1980 -> 1999 --> 1 + 9 + 9 + 9 --> 28 Lucky number

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese su dia de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.println("Por favor ingrese su mes de nacimiento: ");
        int mes = scanner.nextInt();
        //if(mes > 12 || mes < 1) {
        //   System.out.println("Mes no valido, por favor ingrese su mes de nacimiento correcto");
        //}

        System.out.println("Ingrese su anio de nacimiento: ");
        int anio = scanner.nextInt();


        int suma_fechas = dia + mes + anio;

        System.out.println("la suma de las fechas ingresadas es: " + suma_fechas);

        int suma_digitos = 0;
        String suma_fechas_texto = Integer.toString(suma_fechas);

        for(int i = 0; i < suma_fechas_texto.length(); i++){
            int digito = Character.getNumericValue(suma_fechas_texto.charAt(i));
            suma_digitos += digito;
        }

        System.out.println("Lucky number -->" + suma_digitos);


    }
}
