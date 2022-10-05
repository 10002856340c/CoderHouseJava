package OpenBootcamp.CoderHouse;

public class numeroparoimpar {
    public static void main(String[] args) {

        int numero = 6;
        String resultado = "";
        resultado = (numero % 2 == 0 ? "es par" : "es inpar");
        System.out.println(resultado);

    }
}
