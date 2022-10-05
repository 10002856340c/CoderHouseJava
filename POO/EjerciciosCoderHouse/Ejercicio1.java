
package OpenBootcamp.CoderHouse.EjerciciosCoderHouse;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] Arreglo = { 2, 5, 9, 4, 8, 3, 10, 1, 7, 6 };

        // 1) Iteramos nuestro array para verlo de forma original
        /*
         * // Arreglo original
         * for (int i : Arreglo) {
         * System.out.print(i + ",");
         * }
         */

        // 2) Lo organizamos con el metodo sort() nuestro array desorganizado y volvemos
        // a iterarlo

        // Arreglo de forma ordenada Ascendente
        /*
         * Arrays.sort(Arreglo);
         * for (int i = 0; i < Arreglo.length; i++) {
         * System.out.print(Arreglo[i] + ",");
         * }
         */

        // 3)para hacerlo de forma descendente le restamos 1 a la longitud de nuestro
        // arreglo i envez de incrementarlo vamos desicrementandolo, es decir de la
        // forma inversa
        // Arreglo de forma Descendente
        /*
         * Arrays.sort(Arreglo);
         * for (int i = Arreglo.length - 1; i >= 0; i--) {
         * System.out.print(Arreglo[i] + ",");
         * }
         */
    }

}
