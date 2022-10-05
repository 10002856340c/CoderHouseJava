package POO.Clases;

import POO.Hererencia.Carro1;
import POO.Hererencia.Carro2;

public class App {
    public static void main(String[] args) {

        // 1. Clases y Objetos

        MotorBMW Motorbmw = new MotorBMW("BMW", "234XZW", 1000369875, 2022, 365.0);
        Carro1 carro1 = new Carro1();
        Carro2 carro2 = new Carro2();

        // 2.Herencia

        /*
         * heredamos de atributos de la clase principal y las podemos modificar
         */
        carro1.setFabricante("Chevrolet");
        carro1.setYear(2012);
        carro2.setVelocidad(360);
        carro2.setCc(10256397);

        // 3. poliformismo
        /*
         * podemos invocar varias veces el mismo metodo Acelerar pero cada uno
         * lo hara a su manera
         */

        MotorBMW motor1 = new MotorBMW();
        motor1 = new Carro1();
        motor1.AcelerarBMW(50);
        motor1 = new Carro2();
        motor1.AcelerarBMW(50);

        // Clases abstractas no se pueden instanciares decir no se pueda crear un objeto

    }
}
