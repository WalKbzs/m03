/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averiguarmaxmin;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class AveriguarMaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[]= new int [10];
        pedir_numeros(numeros);
        mostrarArray(numeros);
        max_min(numeros);
    }
    public static void pedir_numeros(int[] numeros){
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el valor del numero");
            numeros[i]=sc.nextInt();
        }
    }
     public static void max_min(int[] numeros){
        int max, min;
        max=numeros[0];
        min=numeros[0];
         for (int i = 0; i < numeros.length; i++) {
             if(numeros[i]>max){
                 max=numeros[i];
             }
             else if(numeros[i]<min){
                 min=numeros[i];
             }
         }
         System.out.println("Valores máximo--> " + max);
         System.out.println("Valores mínimo-->" + min);
    }
     public static void mostrarArray(int[] numeros){
       
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero "+i+"es->"+ numeros[i]);
        }
    }
   
    
}
