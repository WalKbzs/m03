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
        Scanner sc = new Scanner (System.in);
        int num1, num2;
        System.out.println("Dime dos numeros: ");
        System.out.println("Num1:");
        num1 = sc.nextInt();
        System.out.println("Num2:");
        num2 = sc.nextInt();
        
        int resultado = minimo(num1,num2);
        
        if (resultado == num1){
            System.out.println("Es menor " + num2);
        }
        else{
            System.out.println("Es menor " + num1);
        }
    }
    /**
     * Devuelve el menor entre a y b
     * @param a
     * @param b
     * @return 
     */
    public static int minimo(int a, int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
