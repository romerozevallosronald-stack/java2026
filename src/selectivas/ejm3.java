package selectivas;

import java.util.Scanner;

public class ejm3 {
    public static void main(String[] args) {
        // se pide hallar un algoritmo para una tienda que quiere aplicar descuentos a sus clientes
        //si la compra es igual o mayor a 500 y el cliente tiene una membresia tiene el 20% de descuento
        //si no tiene la membresia tiene 10%  sino no tiene ningun descuento
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra: ");
        Double Montocompra = entradaDatos.nextDouble();

        System.out.println("¿Tienes una membresia? (si/no): ");
        String membresia = entradaDatos.nextLine(). toLowerCase();

        if (Montocompra >= 500) {
            if (membresia.equalsIgnoreCase("si")) {
                double descuento = Montocompra * 1.20;
                descuento = Montocompra-descuento;
                System.out.println("Tu descuento es el 20% "+descuento);
            } else {
                double descuento = Montocompra * 1.10;
                descuento = Montocompra-descuento;
                System.out.println("Tu descuento es el 10% "+descuento);
            }
        }else {
            System.out.println("No tienes un descuento");
        }
            entradaDatos.close();

    }
}
