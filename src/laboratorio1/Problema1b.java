/*
 * Universidad Nacional de Colombia- Bogotá
 * Curso: Programacion Orientada a objetos 
 * 	Adivinar numero aleatorio 
 *
 *@autor Oscar Granados, Core Pelayo, Jairo Luna
 *@version 2.0 
 *@since 29/08/2016
 *
 */
package laboratorio1;
import java.util.*;

class Problema1b{   
    
	public static void main(String[] args) {
   	 
    	System.out.println("** ADIVINAR NUMERO **");
    	System.out.println("Dispones de 7 intentos");
    	
    
    	String playAgain = "y";
    
    	while(true){
        	if(playAgain.charAt(0) != 'y' ){   	 
            		System.out.println("Gracias por jugar");
            		break;
        	}else{
            		GuessingGame();
            		System.out.println("Jugar de nuevo? (y/n): ");
            		Scanner l = new Scanner(System.in);
            		playAgain = l.nextLine();
        	}
    	}//fin while 
   	 
	}
	public static void GuessingGame(){
    		int answer = (int)Math.floor((Math.random()*100)+1);
    		int guess = 0;
    		int numGuesses = 1;
    		System.out.println("Adivina un numero entre 0 y 100: ");
   	 
    	while(true){
        	if(numGuesses>7 || guess==answer){
            	if(numGuesses>7){
                	System.out.println("PIERDES");
                	break;
            	}else{
                	break;
            	}
        	}else{
           	 
            	Scanner i = new Scanner(System.in);
            	guess = i.nextInt();
            	if(guess<answer){
                	System.out.println("Mas alto");
                	numGuesses = numGuesses+1;
            	}else{
                	if(guess>answer){
                    	System.out.println("Mas bajo");
                    	numGuesses = numGuesses+1;
                	}else{
                    	System.out.println("!! GANADOR ¡¡");
                    	numGuesses = numGuesses+1;
                	}
            	}
        	}
           	 
    	}
	}
    
}
