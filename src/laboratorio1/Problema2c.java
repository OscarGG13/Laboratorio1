package laboratorio1;

/**
 *Universidad Nacional de Colombia
 * Programacion Orientada a objetos
 * PIG GAME
 *
 * @author Oscar Granados, Core Pelayo, Jairo Luna
 * @since 01/09/2016
 * @version 1
 */

import java.util.Scanner;
import java.util.Random;


public class Problema2c{
    
    public static void main(String[] args) {
            System.out.println("**PIG GAME**");
            pig_game();
    }
        
    public static void pig_game(){
        int puntajejug=0,puntajetotalj=0;
        int puntajecomp=0,puntajetotalcomp=0;
        int dadojugador,dadocomp,dadojugador1,dadocomp1,totaldadosj,totaldadosc,numa=0;
        Random rand = new Random();
        String d;
        char opcion = 'p';
        char opcion1 = 'P';
        
        System.out.print("Tu nombre: ");
        Scanner n = new Scanner(System.in);
        String nombre = n.nextLine();
        
        while(puntajetotalj <= 100 && puntajetotalcomp <= 100){
            do{
                dadojugador = rand.nextInt(6)+1; 
                dadojugador1 = rand.nextInt(6)+1;
                System.out.println("### Turno " + nombre + " ###");
                System.out.println("Tu turno: " + dadojugador + " y " + dadojugador1);
                totaldadosj=dadojugador+dadojugador1;
                System.out.println("Total tiro: " + totaldadosj);
                if(dadojugador == 1 || dadojugador1 == 1 ){
                    System.out.println("Pierdes turno");
                    totaldadosj=0;
                    puntajetotalj += totaldadosj;
                    System.out.println("El total es: " + puntajetotalj);
                    break;
                }else if(dadojugador == 1 && dadojugador1 == 1){
                    puntajetotalj=0;
                    System.out.println("Pierdes turno y acumulado");
                    break;
                }else{
                    puntajejug = puntajejug + totaldadosj;
                    puntajetotalj = puntajetotalj + totaldadosj;
                    System.out.println("Tu turno: " + puntajetotalj);
                    if(puntajetotalj >= 100){
                        break;
                    }else{
                        System.out.print("Tirar los dados de nuevo presiona 't' si no 'p' para pasar: ");
                        Scanner t = new Scanner(System.in);
                        d = t.nextLine();
                        opcion = d.charAt(0);
                        opcion1 = d.charAt(0);
                        if(opcion == 'p' || opcion1 == 'P'){
                            break;
                        }
                    }
                }
                
            }
            
            while(dadojugador != 1 || dadojugador1 != 1 && opcion !='p' || opcion1 !='P');
            
                if(puntajejug >= 100){
                    break;
                }else{
                    do{
                        dadocomp = rand.nextInt(6)+1; 
                        dadocomp1 = rand.nextInt(6)+1;
                        System.out.println("### Turno computadora ###");
                        System.out.println("Puntaje computador: " + dadocomp + " y " + dadocomp1);
                        totaldadosc=dadocomp+dadocomp1;
                        System.out.println("Turno computador: " + totaldadosc);
                        if(dadocomp == 1 || dadocomp1 == 1){
                            System.out.println("Computador pierde turno");
                            totaldadosc = 0;
                            puntajetotalcomp += totaldadosc; 
                            System.out.println("Total computador: " + puntajetotalcomp);
                            break;
                        }else if(dadocomp == 1 && dadocomp1 == 1){
                            puntajetotalcomp=0;
                            System.out.println("Computador pierde turno y acumulado");
                            break;
                        }else{
                            puntajecomp = puntajecomp + totaldadosc;
                            puntajetotalcomp = puntajetotalcomp + totaldadosc;
                            System.out.println("Puntaje computador: " + puntajetotalcomp);
                            if(puntajetotalcomp >= 100){
                                break;
                            }else{
                                System.out.println("Computador continua/pasa?: ");
                                numa = rand.nextInt(2)+1;
                                if(numa == 1){
                                    System.out.println("Continua");
                                }else{
                                    System.out.println("Pasa");
                                    break;
                                }
                            }
                        }
                    }while(dadocomp !=1 || dadocomp1 !=1);
                }
            
        }while (puntajetotalj >= 100){
            System.out.println(nombre + " !GANADOR!");
            break;
            
        }while (puntajetotalcomp >= 100){
            System.out.println("!COMPUTADOR GANA¡!");
            break;
        }
        
        
    }
}    
    
    
