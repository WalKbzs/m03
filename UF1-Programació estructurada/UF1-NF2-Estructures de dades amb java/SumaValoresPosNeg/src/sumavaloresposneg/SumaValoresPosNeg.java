/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumavaloresposneg;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class SumaValoresPosNeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numeros[]= new int [10];
        pedir_numeros(numeros);
        mostrarArray(numeros);
        suma_resta(numeros);
    }
    public static void pedir_numeros(int[] numeros){
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el valor del numero");
            numeros[i]=sc.nextInt();
        }
    }
     public static void suma_resta(int[] numeros){
        int positivos=0, negativos=0, contNeg=0, contPos=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]<0){
                negativos=negativos+numeros[i];
                contNeg++;
            }
            else{
                positivos=positivos+numeros[i];
                contPos++;
            }
        }
          System.out.println("La suma de los positivos es--> "+ positivos);
          System.out.println("La resta de los negativos es--> "+ negativos);
          System.out.println("Hay " + contPos+ " positivos " + contNeg + " negativos ");
    }
     public static void mostrarArray(int[] numeros){
       
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero "+i+" es-> "+ numeros[i]);
        }
    }
   
    
}

