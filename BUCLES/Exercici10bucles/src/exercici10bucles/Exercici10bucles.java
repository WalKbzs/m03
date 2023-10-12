/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici10bucles;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici10bucles {

    /**
     * @param args the command line arguments
     * . Realiza un programa que lea una secuencia de notas (con valores que 
     * van de 0 a 10) que termina con el valor -1 y nos dice si hubo o no 
     * alguna nota con valor 10.
     */
    public static void main(String[] args) {
        
         int nota, cont=0;
         
         Scanner sc = new Scanner (System.in);
         
         do{
             System.out.println("Pon valores del 1 al 10 (para terminar pon -1):");
             nota = sc.nextInt();
            
             if (nota==10){
                 cont++;
             }
             
         }while (nota != -1);
         
         if(cont == 0){
             System.out.println("No hubo nota con valor 10");
         }
         else{
              System.out.println("Hubo nota con valor 10");
         }
         
         
         } 
    }
    

