package org.example.encuentro4;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numerosGenerados = generarArrayDeAleatorios();
        int[] numerosOrdenados = ordenarArray(numerosGenerados);
        System.out.println(Arrays.toString(numerosOrdenados));
    }

    public static int[] generarArrayDeAleatorios() {
        int[] numeros = new int[8];
        int min = 1;
        int max = 10;
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * (max - min + 1)) + min;
        }
        return numeros;
    }

    public static int[] ordenarArray(int[] numeros) {
        int n = numeros.length;
        boolean cambio;
        for(int i = 0; i < n - 1; i++) {
            cambio = false;
            for(int j = 0; j < n - i - 1; j++) {
                if(numeros[j] > numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                    cambio = true;
                }
            }

            if(!cambio){
                break;
            }
        }
        return numeros;
    }
}
