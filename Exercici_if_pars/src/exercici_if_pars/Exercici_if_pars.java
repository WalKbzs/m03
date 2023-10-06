/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici_if_pars;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici_if_pars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1;
        int num2;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Inserte el valor 1: ");
        num1 = sc.nextInt();
        System.out.println("Inserte el valor 2: ");
        num2 = sc.nextInt();
        
        if(num1%2 == 0 && num2%2 == 0){
            System.out.println("Los dos numeros son pares");
        }
        if(num1%2 != 0 && num2%2 == 0){
            System.out.println("El " +num1+" no es par");
        }
        if(num1%2 == 0 && num2%2 != 0){
            System.out.println("El " +num2+" no es par");
        }
        if (num1%2 != 0 && num2%2 != 0){
            System.out.println("El "+num1+" no es par");
            System.out.println("El "+ num2+ "no es par");
        }
    }
    
}
