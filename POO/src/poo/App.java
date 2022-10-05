/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author USUARIO
 */
public class App {

    public static void main(String[] args) {
    
        Vaca vaca = new Vaca("blaca y negra","muuu");
        Loro loro=new Loro("perico", "pio pio");
        gato Gato=new gato("siames","miauu");
  
        System.out.println("El animal gato es de raza "+Gato.getRaza()+" y tiene un sonido "+ Gato.getSonido());
        System.out.println("El animal vaca es de raza "+vaca.getRaza()+" y tiene un sonido "+ vaca.getSonido());
        System.out.println("El animal loro es de raza "+loro.getRaza()+" y tiene un sonido "+ loro.getSonido());
 
   
     
     

 
  
    
  
  
      
    }
    
}
