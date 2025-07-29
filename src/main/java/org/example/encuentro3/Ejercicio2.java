package org.example.encuentro3;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
/*        // Escribir un programa que pida 6 numeros por teclado, los almacene en un array y que luego muestre el maximo
        // valor, el minimo y las posiciones que ocupan en el array
        Scanner scanner = new Scanner(System.in);

        int numero = 1;
        ArrayList<Integer> numeros = new ArrayList<>();
        while (numero <= 6) {
            numero += 1;
            System.out.println("Ingrese un numero: ");
            numeros.add(scanner.nextInt());
        }
        System.out.println("Los numeros ingresados son: " + numeros);

        // Calculo del minimo y su posicion en el array
        int menorNumero = numeros.get(0);
        int posicionMenorNumero = 0;

        for(int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) < menorNumero) {
                menorNumero = numeros.get(i);
                posicionMenorNumero = i + 1;
            }
        }

        System.out.println("El menor numero es: " + menorNumero + " y ocupa la posicion: " + posicionMenorNumero);

        int mayorNumero = numeros.get(0);
        int posicionMayorNumero = 0;

        for(int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) > mayorNumero){
                mayorNumero = numeros.get(i);
                posicionMayorNumero = i + 1;
            }
        }
        System.out.println("El mayor numero es: " + mayorNumero + " y ocupa la posicion: " + posicionMayorNumero);*/


        // Mismo ejercicio sin usar arraylist
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        // Cargamos los numeros al array
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = scanner.nextInt();
        }

        // Buscamos el maximo valor
        int maximoValor = numeros[0];
        int minimoValor = numeros[0];
        int posMaxValor = 0;
        int posMinValor = 0;

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maximoValor) {
                maximoValor = numeros[i];
                posMaxValor = i + 1;
            }
        }

        System.out.println("El maximo valor es de: " + maximoValor + " y se encuentra en la posicion: " + posMaxValor);

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] < minimoValor) {
                minimoValor = numeros[i];
                posMinValor = i + 1;
            }
        }

        System.out.println("El maximo valor es de: " + minimoValor + " y se encuentra en la posicion: " + posMinValor);
    }
}
