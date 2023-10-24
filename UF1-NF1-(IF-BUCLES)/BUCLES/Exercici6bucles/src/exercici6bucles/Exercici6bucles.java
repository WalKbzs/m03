/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6bucles;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici6bucles {

    /**
     * @param args the command line arguments
     * Realiza un programam que lea 10 números no nulos y luego muestre un 
     * mensaje de si ha leído algún número negativo o no.
     */
    public static void main(String[] args) {
        int num; //guardar numero introduit
        int cont; //conta vegades introducció
        boolean negativo = false; //no hem posat cap negatiu encara false
        
        Scanner sc = new Scanner (System.in);
        
        for (cont = 0; cont<=10;cont++){
            System.out.println("Pon numero");
            num = sc.nextInt ();
            if (num<0){
                negativo = true;
               // System.out.println("negativo");
            }
        }
        if (negativo==true){
            System.out.println("Has introducido algun negativo");
        }
        else{
            System.out.println("No has introducido ningun negativo");
        }
            
            
               
               
       
        
        
        
    }
    
}
