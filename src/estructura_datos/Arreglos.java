package estructura_datos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
        // creando mi arreglo de numeros

        /*
        int[]nombreDelArreglo = new int[cantidad de elementos];

         */
        int[]numeros = new int[6];
        numeros[0] = 10;
        numeros[1] =  8;
        numeros[2] = 15;
        numeros[3] =  0;
        numeros[4] = 20;
        numeros[5] = 12;

        System.out.println(Arrays.toString(numeros));
        // Arreglo con inializacion
        int[] notas = {10,18,13,15,20,16,18,14,15};
        /*

        System.out.println(Arrays.toString(notas));
        // sesion de estructura de datos y arreglos
        String[] ciudades ={"lima,arequipa,cusco,trujillo"};


        System.out.println(Arrays.toString(ciudades));
        */

        for (int iterador = 0;iterador <= notas.length; iterador++){
            System.out.println(notas[iterador]);

        }


    }
}
