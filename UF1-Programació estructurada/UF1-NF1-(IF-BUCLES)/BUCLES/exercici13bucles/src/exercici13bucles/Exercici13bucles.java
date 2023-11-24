/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13bucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici13bucles {

    /**
     * @param args the command line arguments
     * Programa que piensa un numero del 1 al 20
     * y el usuario va introduciendo numeros hasta adivinarlo
     * si no lo adivina debe dar pista "mayor" o menor
     */
    public static void main(String[] args) {
        //primer pas: el programa pensa un nuemero (numero_correcte)
        //segon pas: opcional ens el mostra
        //3 pas: demanar un numero (num_usuari)
        //4 pas:comprovar si el numero del usuari es major (tornar al pas 3)
               //comprovar si el numero usuari es menor (tornar al pas 3)
               //comprovar si es igual (imprimir sortir bucle i acabar)
    
    int num_correcte, min, range;
    
        Random rd = new Random ();
        min = 1;
        range = 21;
        num_correcte = rd.nextInt(range)+min;
        System.out.println("numero generado por random --> "+ num_correcte); 
        
      int num_usuari;
      int cont=0;
      Scanner sc = new Scanner (System.in);
      
      do{
      System.out.println("Dime un numero del 1 al 20:");
      num_usuari = sc.nextInt();
      cont++; //contador de intentos
      if(num_usuari>num_correcte){
          System.out.println("tu numero es mayor");
      }
      else if(num_usuari<num_correcte){
                 System.out.println("tu numero es menor"); 
      }
     /* else{
          System.out.println("Es correcto");
          System.out.println("Numero de intentos "+ cont);
      }*/
      
      }while(num_usuari!=num_correcte && cont<3);
      //negar las condiciones para que acabe }while!(num_usuari == num_correcte || cont>=3);
      
      if(cont>=3){
          System.out.println("Has perdido...");
      }
      else{
          System.out.println("Es correcto has tardado " + cont + " intentos...");
      }
    }
    
}
