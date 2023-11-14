/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3.bitllets;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici3Bitllets {

    /**
     * esta bien !!
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime fileres");
        int files = sc.nextInt();
        int num_bitlles = bitlles(files);
        System.out.println("Tens--> " +num_bitlles);
    }
    private static int bitlles(int fileres){
        if(fileres==0){
            return 0;
        }
        else{//posible calculo (fileres) operador(+-*/)
            //crida recursiva apropants al base
            int calculo=fileres+bitlles(fileres-1);
            return calculo;
        }
        
    }
    
}
