/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici7abucles;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici7abucles {

    /**
     * @param args the command line arguments
     * ejercicio que pida numeros hasta que pongas -1
     * al final tiene que mostrar la suma de todos los numeros introducidos.
     */
    public static void main(String[] args) {
        int num; 
        int suma=0;
        Scanner sc = new Scanner (System.in);
        
        do{
        System.out.println("Pon un numero:");
        num = sc.nextInt();
        if (num!=-1){
            suma = suma + num;
        }
        }while(num!=-1);
        
        System.out.println("La suma es..." + suma);
       
        
        
    }
    
}
