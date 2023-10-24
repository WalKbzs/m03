/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4pm;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici4PM {

    /**
     * @param args the command line arguments
     * Escribe un programa que pida un número entero por teclado y muestre por pantalla si es 
     * positivo, negativo o cero. Implementa y utiliza la función:
     * int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime un numero");
        int num = sc.nextInt();
        
        int resultado = dimeSigno(num);
        
        if (resultado == -1){
            System.out.println("El numero es negativo --> " + num);
        }
        else if(resultado == 0){
            System.out.println("El numero es 0");
        }
        else{
            System.out.println("El numero es positivo--> "+ num);
        }      
    }
    /**
     * saber si es positivo, negativo o 0
     * @param a
     * @return -1 negativo, 0 es 0 y 1 positivo
     */
    public static int dimeSigno(int a){
       if (a<0){
           return -1;
       }
       else if (a == 0){
           return 0;
       }
       else{
           return 1;
       }
    } 
}
