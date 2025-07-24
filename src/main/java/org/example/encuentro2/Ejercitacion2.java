package org.example.encuentro2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercitacion2 {
    public static void main(String[] args) {
        System.out.println("------Ejercicio que comprueba si dos numeros son amigos------");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        // sumamos todos los divisores del numero 1
        int sumaDivisoresNum1 = 0;
        for(int i = 1; i < num1; i++){
            if(num1 % i == 0){
                sumaDivisoresNum1 += i;
            }
        }

        // sumamos todos los divisores del numero 2
        int sumaDivisoresNum2 = 0;
        for(int i = 1; i < num2; i++) {
            if(num2 % i == 0) {
                sumaDivisoresNum2 += i;
            }
        }

        // chequemos si son numeros amigos
        if(sumaDivisoresNum1 == num2 && sumaDivisoresNum2 == num1) {
            System.out.println(num1 + " y " + num2 + " son numeros amigos");
        } else {
            System.out.println(num1 + " y " + num2 + " NO son numeros amigos");
        }
    }
}
