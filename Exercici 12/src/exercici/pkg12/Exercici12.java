/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg12;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar variables
        int num1;
          /*establecer valor a la variable radio 
        por consola con System.in
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor del numero 1:");
        num1 = sc.nextInt();
        //condición
        if (num1>=0){//mostrar true
            System.out.println("Positivo");
        }
        else {//mostar false
            System.out.println("Negativo");
        }
        
    }
    
}
