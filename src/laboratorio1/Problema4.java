package laboratorio1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Universidad Nacional de Colombia
 * Programacion Orientada a objetos
 * Traductor
 *
 * @author Oscar Granados, Core Pelayo, Jairo Luna
 * @since 01/09/2016
 * @version 1
 */

public class Problema4{
    
     static Scanner in = new Scanner(System.in);
    
   static ArrayList<String> palabra_español = new ArrayList<>();
   static ArrayList<String> palabra_ingles = new ArrayList<>();
   static ArrayList<String> palabra_frances = new ArrayList<>();
   static ArrayList<String> palabra_italiano = new ArrayList<>();
        
    public static void main(String[] args) {
        

   palabra_español.add("Jugar");
   palabra_ingles.add("Play");
   palabra_frances.add("Jouer");
   palabra_italiano.add("Giocare");
   
   palabra_español.add("Saltar");
   palabra_ingles.add("Jump");
   palabra_frances.add("Sauter");
   palabra_italiano.add("Salatre");
   
   palabra_español.add("Amor");
   palabra_ingles.add("Love");
   palabra_frances.add("Amour");
   palabra_italiano.add("Amore");
   
   palabra_español.add("Comer");
   palabra_ingles.add("Eat");
   palabra_frances.add("Manger");
   palabra_italiano.add("Mangiare");
   inicio();
   
        
}
     static private void inicio(){
        String opcion1 ;
        System.out.println("Seleccion la opción que desea realizar \n 1)Traducir palabra 2)Traducir frase" );
        opcion1 = in.next();
  
        if(opcion1.equals("1")){
            
            Traducir_palabra();
        }
        if(opcion1.equals("2")){
            Traducir_frase();
        }
     }
     static private void Traducir_palabra(){
 
       System.out.println("Seleccione el idioma de la palabra que desea traducir \n 1.Español 2.Ingles 3.Frances 4.Italiano");
        
         String idioma_origen=in.next();
         
         int index=0;
        
        System.out.println("Ingrese la palabra que desea traducir");
        
         String palabra_origen=in.next();
        
        if(idioma_origen.equals("1")){
            
            if (palabra_español.contains(palabra_origen)){}
            else {System.out.println("La palabra no existe en diccionario");
            inicio();}
            
        System.out.println("Seleccione el idioma al que quiere traducir la palabra \n 1.Ingles 2.Frances 3.Italiano");
        
         String idioma_destino=in.next();
         
         index=palabra_español.indexOf(palabra_origen);
         
         if(idioma_destino.equals("1")){
             System.out.println("La traduccion al ingles es: "+ palabra_ingles.get(index));
             inicio();
        }
       
        if (idioma_destino.equals("2")){
           System.out.println("La traduccion al frances es: "+ palabra_frances.get(index));
           inicio();
            
        }
       
        if (idioma_destino.equals("3")){
            System.out.println("La traduccion al italiano es: "+ palabra_italiano.get(index));
            inicio();
        }
        }
         
        
        else{ 
    
        if(idioma_origen.equals("2")){
           if (palabra_ingles.contains(palabra_origen)){
               index=palabra_ingles.indexOf(palabra_origen);
           }
           else {System.out.println("La palabra no existe en diccionario");
           inicio();}
        }
       
        if (idioma_origen.equals("3")){
           if (palabra_frances.contains(palabra_origen)){
               index=palabra_frances.indexOf(palabra_origen);
           }
           else {System.out.println("La palabra no existe en diccionario");
           inicio();}
        }
       
        if (idioma_origen.equals("4")){
           if (palabra_italiano.contains(palabra_origen)){
               index=palabra_italiano.indexOf(palabra_origen);
           }  
           else {System.out.println("La palabra no existe en diccionario");
           inicio();}
        }
            System.out.println("La traduccion al español es: "+ palabra_español.get(index));
            inicio();
            
}    
     }   
     
     static private void Traducir_frase(){
     
       int frase;

        System.out.println("Ingrese la frase que desea traducir" );
        frase = Integer.parseInt(in.next());
     
        
        
        
     }
      
}
