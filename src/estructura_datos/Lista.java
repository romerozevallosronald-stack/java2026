package estructura_datos;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        // lista de arreglos - mutables o que puedan ser manipulables al momento de hacer
        /*
        List<TipoDato> nombreLista = new ArrayList<>();

         */
        List<String> ciudades = new ArrayList<>();
        ciudades.add("lima");
        ciudades.add("Arequipa");
        ciudades.add("cuzco");
        ciudades.add("Trujillo");

        System.out.println(ciudades);
    }
}
