package OpenBootcamp.CoderHouse.EjerciciosCoderHouse;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para hacer la sucesion de fibonnaci :");
        int a = 0;
        int b = 1;
        int c;
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;

        }
    }
}
