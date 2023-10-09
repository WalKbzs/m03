/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg15;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici15 {

    /**
     * @param args the command line arguments
     * lea tres números distintos y nos diga cuál es el mayor.
     */
    public static void main(String[] args) {
        //declarar variables
        int num1,num2,num3;
         /*establecer valor a la variable radio 
        por consola con System.in
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor numero 1:");
        num1 = sc.nextInt();
        
        System.out.println("Valor numero 2:");
        num2 = sc.nextInt();
        System.out.println("Valor numero 3:");
        num3 = sc.nextInt();
        //condición
        if (num1>=num2 && num1>=num3){//mostrar true
        System.out.println(num1 + " es el mayor");
    }
        else if (num2>=num1 && num2>=num3){/*False*/
        System.out.println(num2 + " es el mayor");        
                }
        else{//num2,num1<num3
        System.out.println(num3 + " es el mayor");   
        }
    }
    
}
