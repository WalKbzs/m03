/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg13;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar variables
        int num1, num2;
         /*establecer valor a la variable radio 
        por consola con System.in
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor numero 1:");
        num1 = sc.nextInt();
        
         System.out.println("Valor numero 2:");
        num2 = sc.nextInt();
        //condición
        if (num1==num2){//mostar true
            System.out.println("Son iguales los valores");
        }
        else if (num1>num2){/*False*/
            System.out.println(num2 + " y despues " + num1);
        }
        else{//num1<num2
            System.out.println(num1 + " y despues " + num2);
        }
    }
    
}
