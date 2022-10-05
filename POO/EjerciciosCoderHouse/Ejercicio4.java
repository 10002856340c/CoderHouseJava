package OpenBootcamp.CoderHouse.EjerciciosCoderHouse;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[] Arreglo = new int[10];
        ArrayList<Integer> listaimpares = new ArrayList<Integer>();
        ArrayList<Integer> listapares = new ArrayList<Integer>();
        Random r = new Random();

        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = r.nextInt(100);
            System.out.print(Arreglo[i] + "\n");

            if (Arreglo[i] % 2 == 0) {
                listapares.add(Arreglo[i]);

            } else if (Arreglo[i] % 2 != 0) {

                listaimpares.add(Arreglo[i]);
            }

        }
        System.out.println("los numeros impares son" + listaimpares);
        System.out.println("los numeros pares son" + listapares);
    }
}
