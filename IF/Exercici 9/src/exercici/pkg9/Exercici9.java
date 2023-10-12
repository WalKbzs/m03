/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg9;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici9 {

    /**
     * @param args the command line arguments
     * pide la edad por teclado y nos muestra el mensaje de ?eres mayor de edad?
     * o el mensaje de ?eres menor de edad?.
     */
    public static void main(String[] args) {
        //declarar variables
        int edad;
        /*establecer valor a la variable radio 
        por consola con System.in
         */
        Scanner pantalla = new Scanner(System.in);

        System.out.println("Edad que tienes: ");
        edad = pantalla.nextInt();
        //condición
        if (edad>=18)//NO VA MAI AMB ;
                {//mostrar por pantalla true
            System.out.println("Eres mayor de edad");
        }
        else{//mostrar false
            System.out.println("Eres menor de edad");
        }
    }
    
}
