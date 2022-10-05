package CoderHouse;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float numero = 25.5f;
        float decimal = numero % 1;

        System.out.println("el numero entero es " + (int) numero);
        System.out.println("El numero decimal es :" + decimal);

    }

}
