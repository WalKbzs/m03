/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg11;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar variables
        double num1, num2;
         /*establecer valor a la variable radio 
        por consola con System.in
         */
        Scanner pantalla = new Scanner(System.in);

        System.out.println("Valor del numero 1:");
        num1 = pantalla.nextDouble();
        
         System.out.println("Valor del numero 2:");
        num2 = pantalla.nextDouble();
        //condición
        if (num1==num2)
        {//true
            System.out.println("Son iguales los valores");
        }
        else if(num1>num2) /*false*/
        {//true
            //System.out.println("numero1 es más grande que numero2");
            System.out.println(num1 + " superior a " + num2);
        }
        else //també podria ser else if
        {//num2>num1
            System.out.println(num2 + " es superior a " + num1);
        
        }
        
        
        
    }
    
}
