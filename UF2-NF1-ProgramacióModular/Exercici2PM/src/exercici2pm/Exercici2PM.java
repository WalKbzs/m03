/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2pm;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici2PM {

    /**
     * @param args the command line arguments
     * Escribe un programa que pida la edad por teclado y muestre por pantalla 
     * si eres mayor de edad o no. Implementa y utiliza la función: 
     * boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int edad;
        System.out.println("Dime tu edad: ");
        edad = sc.nextInt();
        
        boolean resultado = esMayorEdad(edad);
        
        if (resultado){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }    
    }
    /**
     * mayor de edad o no
     * @param a
     * @return si a>=18 mayor edad
     */
    public static boolean esMayorEdad(int a){
       return a>=18;
    }
}
