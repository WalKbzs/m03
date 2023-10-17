/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicibuclesreforç5;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercicibuclesreforç5 {

    /**
     * @param args the command line arguments
     * Escribe un programa que pida la edad y el año en que nos encontramos y 
     * muestre la edad que tenia el usuario en cada año hasta su nacimiento.
     */
    public static void main(String[] args) {
        int edad;
        int año;
        
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime tu edad:");
        edad = sc.nextInt();
        System.out.println("Dime el año actual:");
        año = sc.nextInt();
            
        while (edad>=0){
            System.out.println(edad+" - "+año);
            edad= edad -1;
            año = año-1;
        }
    } 
}
