/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg4;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     * que lea dos números, calcule y muestre el valor de sus suma, resta, 
     * producto y división.
     */
    public static void main(String[] args) {
        //declarar variables
        int num1, num2;
        int suma, resta, producto, division;
        /*establecer valor a las variables num 1 y num 2
        por consola con System.in
        */
        Scanner pantalla = new Scanner (System.in);
        
        System.out.println("Valor num 1: ");
        num1 = pantalla.nextInt();
        
        System.out.println("Valor num 2: ");
        num2 = pantalla.nextInt();
        //calcular suma, resta, producto y división
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        division= num1 / num2;
        //mostrar resultado por pantalla
         System.out.println("La suma es... " + suma);
         System.out.println("La resta es... " + resta);
         System.out.println("El producto es... " + producto);
         System.out.println("La division es... " + division);       
    }
    
}
