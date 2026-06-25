package bucles;

import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) {
        int suma = 0;
        for (int valorInicial = 1;valorInicial<= 100;valorInicial++) {
            suma = suma + valorInicial;
            System.out.println("La suma de los numeros del 1 al 100 es: " + suma);
        }

        int total = 0;

        for (int numero = 1; numero <=100; numero++){
            total = numero+ total;

            System.out.println(numero);
            System.out.println("El total es: "+total);
        }


    }
}
