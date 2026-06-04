package selectivas;

import java.util.Scanner;

public class anidadas {
    public static void main(String[] args) {
        Scanner entradadatos = new Scanner(System.in);
        System.out.println("Ingrese una calificacion: ");
        int calificacion = entradadatos.nextInt();

        //crear un algoritmo que permita evaluar si un estudiante aprobo y obtuna buena calificacion
        if (calificacion >= 13){
            System.out.println("Has aprobado");
            if (calificacion >= 15){
                System.out.println("Obtubiste una buena calificacion");
            }
        }else {
            System.out.println("Has reprobado el curso, sigue estudiante");
        }




        entradadatos.close();
    }
}
