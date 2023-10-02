/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstprogramvariables;

import java.util.Scanner;
//Llibreria de java

/**
 *
 * @author adca5503
 */
public class FirstProgramVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        edad = 18;
        System.out.println("Tu edad es " + edad);
        /*
        Para poner numeros enteros ponemos "int".
        Haciendo ctrl+space encontramos las variables 
        por la letra que ponemos.
        */
        int notaM03, notaM02, notaM04;
        //un objecte que escaneja dades de entrada
        //System.in indico que sigui per consola
        Scanner pantalla = new Scanner(System.in);
        /*
        Informar valor por el usuario
        */
        System.out.println("Que nota crees que sacaras en M03?");
        notaM03 = pantalla.nextInt();
        System.out.println("Que nota crees que sacaras en M02?");
        notaM02 = pantalla.nextInt();
        System.out.println("Que nota crees que sacaras en M04?");
        notaM04 = pantalla.nextInt();
                
        //notaM03 = 8;
        //notaM02 = 6;
        //notaM04 = 8;
       
        System.out.println("Nota de M03 un... " + notaM03);
        System.out.println("Nota de M02 un... " + notaM02);
        System.out.println("Nota de M04 un... " + notaM04);
                
    }
    
}
