package bucles;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        double gastos = 0, totalgastos = 0;
        System.out.println("Ingrese su gasto,si no tiene ingrese 0");
        gastos = entradaDatos.nextDouble();
        if (gastos == 0 ) {
            System.out.println("No tienes ningun gasto");
        }else{
        while (gastos != 0){
                totalgastos = totalgastos + gastos;
                System.out.println("Mis gastos son: "+ totalgastos);
                System.out.println("Ingrese su gasto ");
                gastos = entradaDatos.nextDouble();
            }
            entradaDatos.close();
        }

    }}


