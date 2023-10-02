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
