/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4bucles;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici4bucles {

    /**
     * @param args the command line arguments
     * Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá
     por teclado.
     */
    public static void main(String[] args) {
        int N, cont;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe un numero:");
        N = sc.nextInt();
        //Amb for
        System.out.println("****For****");
        for (cont = 1; cont<= N; cont = cont+1) {
             System.out.println("Contador-->" + cont); 
        }
        //Amb DoWhile
        cont=1;
        System.out.println("****DoWhile****");
        do{
            System.out.println("Contador--> "+ cont);
            cont = cont +1;
        }while (cont<=N);
        //Amb While
        cont=1;
        System.out.println("****While****");
        while(cont<=N){
            System.out.println("Contador--> " + cont);
            cont = cont +1;
        }
    }
}
