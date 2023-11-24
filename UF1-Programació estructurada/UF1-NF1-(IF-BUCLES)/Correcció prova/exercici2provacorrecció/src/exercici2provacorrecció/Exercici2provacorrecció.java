/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2provacorrecció;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici2provacorrecció {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         char letra;
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime una letra vocal:");
        letra = sc.next().charAt(0);
        
        if (letra == 'a' || letra == 'e' || letra =='i' || letra=='o'|| letra=='u'){
            System.out.println("Letra vocal minuscula"); 
        }
        else{
            if(letra == 'A' || letra=='E' || letra =='I' || letra == 'O' || letra =='U'){
            System.out.println("Letra vocal mayuscula");
            }
            else{
            System.out.println("Es una consonante");
            }
        }
        
    }
    
}
