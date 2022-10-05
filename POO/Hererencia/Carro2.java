package POO.Hererencia;

import POO.Clases.MotorBMW;

public class Carro2 extends MotorBMW {

    // Atributos
    protected int npuertas;
    protected String color;
    protected String modeloRuedas;

    // Constructores
    public Carro2() {

    }

    public Carro2(int npuertas, String color, String modeloRuedas) {
        this.npuertas = npuertas;
        this.color = color;
        this.modeloRuedas = modeloRuedas;
    }

    public Carro2(String fabricante, String modelo, double cc, int year, double velocidad, int npuertas, String color,
            String modeloRuedas) {
        super(fabricante, modelo, cc, year, velocidad);
        this.npuertas = npuertas;
        this.color = color;
        this.modeloRuedas = modeloRuedas;
    }
    // getters and setters

    public int getNpuertas() {
        return npuertas;
    }

    public void setNpuertas(int npuertas) {
        this.npuertas = npuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModeloRuedas() {
        return modeloRuedas;
    }

    public void setModeloRuedas(String modeloRuedas) {
        this.modeloRuedas = modeloRuedas;
    }

}
