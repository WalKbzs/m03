/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicireforç6;

import java.util.Scanner;

/**
 *
 * @author adric
 * Escribe un programa que pida al usuario una letra y el número de veces que debe mostrar. 
 * Después se deberá mostrar la letra tantas veces como se haya indicado.
 */
public class Exercicireforç6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra;
        int num;
        int cont=0;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escribe una letra y el número de veces que debe mostrarse");
        System.out.println("Letra:");
        letra = sc.next().charAt(0);
        System.out.println("Num veces debe mostrarse:");
        num = sc.nextInt();
        System.out.println("*********");
        do{
            System.out.println(letra);
            cont++;
        }while(num!=cont);
    }
    
}
