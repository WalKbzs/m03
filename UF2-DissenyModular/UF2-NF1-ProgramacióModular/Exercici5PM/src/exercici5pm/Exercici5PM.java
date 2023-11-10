/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5pm;

import java.util.Scanner;

/**
 *
 * @author adca5503
 * Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
 * Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
 * double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
 */
public class Exercici5PM {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Pon millas y te las convierte a kilometros");
        int millas = pedirDatoEnteroPositivo();
        
        double kilometros = millas_a_kilometros (millas);
        System.out.println(millas+" a kilometros es... " + kilometros);
    }
   
    public static final double conversor_millas = 1.60934;
    public static double millas_a_kilometros(int millas){
        double calculo;
        
        calculo = millas*conversor_millas;
        
        return calculo;
        
    }
    public static int pedirDatoEnteroPositivo(){
        Scanner sc = new Scanner (System.in);
        int num;
        do{
            System.out.print("Valor debe ser superior a 0: ");
             num = sc.nextInt(); 
        }while (num<=0);
        return num;
       }
    
}
