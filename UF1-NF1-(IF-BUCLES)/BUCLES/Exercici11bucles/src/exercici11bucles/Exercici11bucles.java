/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici11bucles;

/**
 *
 * @author adric
 */
public class Exercici11bucles {

    /**
     * @param args the command line arguments
     * Realiza un programa que sume independientemente los pares y los 
     * impares de los números comprendidos entre 100 y 200, y luego muestra 
     * por pantalla ambas sumas.

     */
    public static void main(String[] args) {
        
        int pares=0, impares=0, cont;
        
        for (cont=100; cont <=200; cont++){
            
            if (cont%2 ==0){//pares
                pares=pares+cont;
            }
            else{//impares
                impares=impares+cont;
            }
        }
        System.out.println("Suma pares: "+pares);
        System.out.println("Suma impares: "+impares);
    }
    
}
