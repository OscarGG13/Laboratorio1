package laboratorio1;

/**
 *Universidad Nacional de Colombia
 * Programacion Orientada a objetos
 * Juego numeros aleatorios
 *
 * @author Oscar Granados, Core Pelayo, Jairo Luna
 * @since 01/09/2016
 * @version 2
 */

import java.util.Arrays;
import java.util.Scanner;


public class Problema2a{
    
	public static void main(String[] args) {
    	Lotery();
	}
    
    
	public static void Lotery(){
    	int[] random = new int[3];
    		random[0] = (int)Math.floor((Math.random()*10));
    		random[1] = (int)Math.floor((Math.random()*10));
    		random[2] = (int)Math.floor((Math.random()*10));
   	 
    	System.out.println("** JUEGO LOTERIA **");
    	System.out.println("Escribe tus numeros en orden");
    	int[] guess = new int[3];
    	System.out.print("Digita el primer numero: ");
    	Scanner l = new Scanner(System.in);
    	guess[0] = l.nextInt();
    	System.out.print("Digita el segundo numero: ");
    	guess[1] = l.nextInt();
    	System.out.print("Digita el tercer numero: ");
    	guess[2] = l.nextInt();
   	 
    	System.out.println("Los numeros a participar son: " + Arrays.toString(guess));
    	System.out.println("Los numeros ganadores son:" + Arrays.toString(random));	 
   	 
    	int match=0;
    	if(guess[0] == random[0] || guess[0] == random[1] || guess[0] == random[2]){
        	match=match+1;
    	}
   	 
    	int match1=0;
    	if(guess[1] == random[0] || guess[1] == random[1] || guess[1] == random[2]){
        	match1=match1+1;
    	}
   	 
    	int match2=0;
    	if(guess[2] == random[0] || guess[2] == random[1] || guess[2] == random[2]){
        	match2=match2+1;
    	}
   	 
    	int matchcount=match+match1+match2;
    	int reward;
    	if(matchcount==1){
        	reward=10;
        	System.out.println("Has Acertado un numero");
        	System.out.println("Ganaste: " + reward);
    	}else if(matchcount==2){
        	reward=100;
        	System.out.println("Has Acertado dos numeros");
        	System.out.println("Ganaste: " + reward);
    	}else if(matchcount==3){
        	if(guess[0]==random[0] && guess[1]==random[1] && guess[2]==random[2]){
            	reward=1000000;
            	System.out.println("Has Acertado todos los numeros en orden exacto");
            	System.out.println("Ganaste: " + reward);
        	}else{
            	reward=1000;
            	System.out.println("Has Acertado tres numeros");
            	System.out.println("Ganaste: " + reward);
        	}
    	}else{
        	reward=0;
        	System.out.println("Ningun acierto");
        	System.out.println("PIERDES");
    	}
   	 
   	 
	}
}






