/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici8pm;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici8PM {

    /**
     * @param args the command line arguments
     * Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
     * productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
     * int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
     * int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
     * double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
     */
    public static void main(String[] args) {
        int valor; 
        
        valor= pedirDatoEnteroPositivo();
        
    }
     public static int pedirDatoEnteroPositivo(){
           Scanner sc = new Scanner (System.in);
           int num;
           do{
               System.out.print("Valor debe ser superior a 0... ");
               num = sc.nextInt(); 
           }while (num<=0);
           return num;
       }
    //int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
     public static int suma1aN(int n){
         int acum_suma=0;
         for (int i = 1; i < n; i++) {
             acum_suma = acum_suma + i;
         }
         return acum_suma;
     }
     //double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
      public static double intermedio1aN(int n){
          double mitad = (n+1)/2;
          return mitad;
      }
}
