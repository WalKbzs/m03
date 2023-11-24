/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplefifa;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exemplefifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char letra;
        Scanner sc = new Scanner (System.in);
        do{
        System.out.println("****BIENVENIDO A FIFA***");
        System.out.println("*A-Jugar*");
        System.out.println("*B-Entrenar*");
        System.out.println("*C-Jugar partido online*");
        System.out.println("*Ecoge opcion:");
        letra= sc.next().charAt(0);
        if(letra=='A' || letra=='a'){
            System.out.println("Estas jugando");
        }
        if(letra=='B' || letra=='b'){
            System.out.println("Estas entrenando");
        }
        if (letra=='C' || letra=='c'){
            System.out.println("Estas jugando online");
        }    
        }while(letra!= 'D' && letra!='d');
        System.out.println("EXIT");
    }
    
}
