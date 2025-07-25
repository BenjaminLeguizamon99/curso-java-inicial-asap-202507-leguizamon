package org.example.encuentro3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // se ingresan los numeros y se cargan al array
        int numero = 0;
        while(numero < 5) {
            numero += 1;
            System.out.println("Ingrese un numero: ");
            numeros.add(scanner.nextInt());
        }
        System.out.println("los numeros agregados son: " + numeros);

        // Creo un nuevo array pero con los datos de atras para adelante
        ArrayList<Integer> numerosAlReves = new ArrayList<>();
        for(int i = numeros.size() - 1; i >= 0; i--) {
            numerosAlReves.add(numeros.get(i));
        }

        System.out.println("La lista de numeros de atras hacia adelante es: " + numerosAlReves);

        // Comparamos los dos arrays
        boolean esCapicua = true;
        for(int j = 0; j < numeros.size(); j++) {
            if(numeros.get(j) != numerosAlReves.get(j)){
                System.out.println("El array NO es capicua");
                esCapicua = false;
                break;
            }
        }
        if(esCapicua){
            System.out.println("El array SI es capicua");
        }
    }

}
