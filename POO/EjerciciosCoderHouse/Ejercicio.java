package OpenBootcamp.CoderHouse.EjerciciosCoderHouse;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeroslista = new ArrayList<Integer>();

        int numeroMayor = 0;
        int numeroMenor = 0;
        int[] Arreglo = new int[10];

        for (int i = 0; i < Arreglo.length; i++) {
            System.out.println("Ingrese los valores del arreglo :");
            Arreglo[i] = sc.nextInt();
            numeroslista.add(Arreglo[i]);
        }

        numeroMayor = Arreglo[0];
        for (int i = 0; i < Arreglo.length; i++) {
            if (Arreglo[i] > numeroMayor) {
                numeroMayor = Arreglo[i];

            }
        }
        numeroMenor = Arreglo[0];
        for (int i = 0; i < Arreglo.length; i++) {
            if (Arreglo[i] < numeroMenor) {
                numeroMenor = Arreglo[i];

            }
        }

        System.out.println("la lista ingresa de numeros por el usuario fueron ---> " + numeroslista);
        System.out.println("El numero Mayor es   ---> " + numeroMayor);
        System.out.println("El numero Menor es ---> " + numeroMenor);

    }

}
