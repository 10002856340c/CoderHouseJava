package OpenBootcamp.CoderHouse;

public class ejercicio2 {
    public static void main(String[] args) {
        double capital = 30000;
        double interes1 = 10;
        double interes2 = 7.5;
        double interes3 = 5;

        if (capital < 10000) {
            double total = capital * interes1;
            System.out.println("El interes a pagar es :" + total / 100);

        } else if (capital >= 10000 && capital < 25000) {
            double total = capital * interes2;
            System.out.println("El interes a pagar es :" + total / 100);
        } else if (capital >= 25000) {
            double total = capital * interes3;
            System.out.println("El interes a pagar es :" + total / 100);
        }
    }

}
