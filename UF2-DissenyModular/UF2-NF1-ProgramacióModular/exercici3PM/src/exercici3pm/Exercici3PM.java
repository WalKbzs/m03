/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3pm;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici3PM {

    /**
     * @param args the command line arguments
     * Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
     * mínimo. Implementa y utiliza la función:
     * int minimo(int a, int b) // Devuelve el menor entre a y b
     */
    public static void main(String[] args) {
       
        int num1, num2;
        System.out.println("Pon valor 1");
        num1 = pedirDatoEnteroPositivo();
        System.out.println("Pon valor 2");
        num2 = pedirDatoEnteroPositivo();
        
        int mostrarMinimo = minimo(num1,num2);
        System.out.println("El más pequeño es " + mostrarMinimo);
        
    }
    /**
     * Devuelve el menor entre a y b
     * @param a
     * @param b
     * @return 
     */
    public static int minimo(int a, int b){
        int minimo = 0;
        if (a>b){
            minimo=b;
        }
        else{
            minimo = a;
        }
        return minimo;
    }
     /**
     * 
     * @return 
     */
     public static int pedirDatoEnteroPositivo(){
           Scanner sc = new Scanner (System.in);
           int num;
           do{
               System.out.print("Valor debe ser superior a 0: ");
               num = sc.nextInt(); 
           }while (num<=0);
           return num;
       }
}
