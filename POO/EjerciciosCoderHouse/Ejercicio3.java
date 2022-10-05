package OpenBootcamp.CoderHouse.EjerciciosCoderHouse;

import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] Arreglo = new int[10];
        int NumeroMayor;
        int NumeroMenor;

        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = r.nextInt(100);
            System.out.print(Arreglo[i] + " ,");
        }
        NumeroMayor = Arreglo[0];

        for (int i = 0; i < Arreglo.length; i++) {
            if (Arreglo[i] > NumeroMayor) {
                NumeroMayor = Arreglo[i];
            }
        }
        NumeroMenor = Arreglo[0];
        for (int i = 0; i < Arreglo.length; i++) {
            if (Arreglo[i] < NumeroMenor) {
                NumeroMenor = Arreglo[i];
            }
        }
        System.out.println("\n");
        System.out.println("El numero Mayor es :" + NumeroMayor);
        System.out.println("El numero Menor es :" + NumeroMenor);

    }
}