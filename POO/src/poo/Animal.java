
package poo;


public class Animal {


   //Atributos
   String raza;
  String sonido;

//constructores

    public Animal(String raza, String sonido) {
        this.raza = raza;
        this.sonido = sonido;
    }
   public Animal(){
}

//metodos getters and setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }


   



}  
