package bucles;

public class Para {
    public static void main(String[] args) {
        // crear un algoritmo que permita imprimir los numeros del 10 al 0
        for (int valorInicial = 1;valorInicial >= 10; valorInicial++){
            System.out.println("En esta vuelta ahora es: "+valorInicial);

        }
        for (int valorInicial = 10;valorInicial >= 0; valorInicial--) {
            System.out.println("En esta vuelta ahora es: " + valorInicial);
        }
        for (int valorInicial = 1; valorInicial >=10; valorInicial = valorInicial + 2) {
            System.out.println("En esta vuelta ahora es: " + valorInicial);
        }
        for (int valorInicial = 1; valorInicial <=100; valorInicial +=5) {
            System.out.println("En esta vuelta ahora es: " + valorInicial);
        }
        for (int valorInicial = 1; valorInicial >= 5; valorInicial = valorInicial * 1) {
            System.out.println("La multiplicacion es: " + valorInicial);
        }


    }
}
