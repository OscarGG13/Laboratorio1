
package laboratorio1;

/**
 * Universidad Nacional de Colombia- Bogotá
 * Programacion orientada a objetos
 * 
 * Ejercicio Funciones
 * 
 * @autor Oscar Granados, Core Pelayo, Jairo Luna
 * @version 3.0
 * @since 01/09/2016
 */
public class Problema1a {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Primera funcion en Main");
    	Problema1a p = new Problema1a();
    	p.func1();
    	p.func2();
    	System.out.println("Se termina Main");
    }
    
    void func1(){
        	System.out.println("Segunda funcion");
	}
    
    void func2(){
        	System.out.println("Tercera funcion");
	}
}
