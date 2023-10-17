/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicibuclesreforç4;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercicibuclesreforç4 {

    /**
     * @param args the command line arguments
     * Dibuja un ordinograma que pida introducir Pin hasta 3 veces: Simularemos 
     * la entrada de un portal de un banco donde te pide un pin 
     * (el pin sera 1234), te ha de pedir el pin hasta que adivinar el pin, o 
     * al tercer golpe tiene terminar diciendo que se ha sobrepasado el número 
     * máximo de intentos.
     */
    public static void main(String[] args) {
        int pin_introducido;
        int pin_ok = 1234;
        int intentos = 0;
        Scanner sc = new Scanner (System.in);
     
        
        do{
            System.out.println("Introduce el pin (4 digitos): ");
            pin_introducido = sc.nextInt();
            intentos = intentos +1;
            if(pin_introducido == pin_ok){
                System.out.println("Correcto");    
            }
            else{
                System.out.println("Incorrecto");
            }
            
        }while(pin_introducido!= pin_ok && intentos<3);
        if (intentos>3){
            System.out.println("Has sobrepasado el límite");
        }
        System.out.println("Has hecho " + intentos+ " intentos");
    }
    
}
