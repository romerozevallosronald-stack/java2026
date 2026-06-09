package bucles;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Ingrese el monto de su compra: ");
        double montoCompra = entradaDatos.nextDouble();
        entradaDatos.nextLine();

        System.out.println("Tienes una membresia? si o no: ");
        String membresia = entradaDatos.nextLine().toLowerCase();

        if (montoCompra >= 500){
            if (membresia.equalsIgnoreCase("si")) {
                double descuento = montoCompra * 1.20;
                descuento = montoCompra - descuento;
                System.out.println("Tu descuento es del 20% " + descuento);
            }else {
                double descuento = montoCompra * 1.10;
                descuento = montoCompra - descuento;
                System.out.println("Tu descuento es del 10% " + descuento);
            }
        }else {
            System.out.println("No tienes un descuento");
        }
        entradaDatos.close();

    }
}
