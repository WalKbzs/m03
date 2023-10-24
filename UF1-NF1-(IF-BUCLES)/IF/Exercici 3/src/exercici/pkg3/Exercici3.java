/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg3;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     * Calcular el área del cuadrado cuyo lado se introduce por teclado
     */
    public static void main(String[] args) {
        //declarar variables
        int lado;
        int area;
        //establecer valor a la variable por consola con System.in
        Scanner pantalla = new Scanner (System.in);
        
        System.out.println("Valor del lado para calcular el area de un cuadrado: ");
        lado = pantalla.nextInt();
        //calcular area
        area = lado * lado;
        //mostrar resultado por pantalla
        System.out.println("El area es... " + area); 
    }
    
}
