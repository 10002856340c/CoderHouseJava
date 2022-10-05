
package Desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
  
        
        Persona persona1=new Persona("Cristian","Galeano");
        Persona persona2=new Persona("Daniel","Forero");
        Persona persona3=new Persona("Fabian","Pulido");
        Persona persona4=new Persona("Camilo","Lopez");
        Persona persona5=new Persona("Santiago","Gutierrez");

       List<Persona>ListaPersonas=new ArrayList<>();
      
       ListaPersonas.add(persona1);
       ListaPersonas.add(persona2);
       ListaPersonas.add(persona3);
       ListaPersonas.add(persona4);
       ListaPersonas.add(persona5);
    
        
      

        do {     
  System.out.println("--------------------------------------------------------------------"+"\n");
        System.out.println("Elige una opcion a Elegir"+"\n"
 +                 "[1]- Ordenar Alfabeticamente por Nombre"+"\n"
  +                "[2]- Ordenar Alfabeticamente por Apellido"+"\n"
  +                "[3]- Ordenar inversamente por Apellido" );
      Scanner sc=new Scanner(System.in);
          
      int opcion=sc.nextInt();

           switch(opcion){
       
          case 1:
              Collections.sort(ListaPersonas, Comparator.comparing(Persona::getNombre));
              ListaPersonas.forEach(System.out::println);
              break;
          case 2:
             Collections.sort(ListaPersonas, Comparator.comparing(Persona::getApellido));
              ListaPersonas.forEach(System.out::println);
             break;
          
           case 3:
            Collections.sort(ListaPersonas,persona1.ordenarApellido);
            ListaPersonas.forEach(System.out::println);
        }
               
            
        } while (true);
  
     
     //Collections.sort(ListaPersonas, Comparator.comparing(Persona::getNombre));
      //Collections.sort(ListaPersonas, Comparator.comparing(Persona::getApellido));

       //ListaPersonas.forEach(System.out::println);

       

    }

    
   
    
}
