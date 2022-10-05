
package Desafio;

import java.util.Comparator;

public class Persona {

    private String Nombre;
    private String Apellido;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "[ Nombre =" + Nombre + ", Apellido=" + Apellido + "]";
    }

    Comparator<Persona> ordenarApellido = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {

            return p2.getApellido().compareTo(p1.getApellido());
        }

    };
}
