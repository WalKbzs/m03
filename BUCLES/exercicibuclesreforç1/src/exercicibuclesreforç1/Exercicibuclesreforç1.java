/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicibuclesreforç1;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercicibuclesreforç1 {

    /**
     * @param args the command line arguments
     * Llegir un nombre i indicar si és positiu o negatiu. El procés es repetirà fins que s'intodueixi un 0. 
     * Següent apartat: contador de num introduits i sumar.
     */
    public static void main(String[] args) {
        int num; 
        int cont=0;
        int suma = 0;
        Scanner sc = new Scanner (System.in);
         
        do{
        System.out.println("Dime un numero: ");
        num = sc.nextInt();
        if(num !=0){
            cont++;
        }
        
        suma = suma + num;
        //
         if(num<0){
            System.out.println("Negatiu");
        }
        else{
            System.out.println("Positiu");
        }
        }while(num!=0);
        
        System.out.println("Programa finalizado, "+cont+" numeros introducidos");
        System.out.println("La suma es..." + suma);
    }
    
}
