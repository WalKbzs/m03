/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9pm;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici9PM {

    /**
     * @param args the command line arguments
     * Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
     * elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
     * tres) y nos devuelva el máximo de los dos valores.
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        
        System.out.println("Dime tres valores: ");
        System.out.println("Num1: ");
        num1 = pedirDatoEntero();
        System.out.println("Num2: ");
        num2 = pedirDatoEntero();
        System.out.println("Num3: ");
        num3 = pedirDatoEntero();
        
       int max1 = valorMáximo(num1, num2);
       int max2 = valorMáximo(max1, num3);
       
        System.out.println("El valor maximo es " + max2);
    }
      public static int pedirDatoEntero(){
           Scanner sc = new Scanner (System.in);
           System.out.println("Pon un valor entero");
           int num;
           num = sc.nextInt(); 
           return num;
       }
      public static int valorMáximo(int a, int b){
          if (a>b){
              return a;
          }
          else{
              return b;
          }
      }
}
