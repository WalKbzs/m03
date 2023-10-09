/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg5;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici5 {

    /**
     * @param args the command line arguments
     * como dato de entrada un número que corresponde a la longitud de un radio 
     * y nos escribe la longitud de la circunferencia(Pi * diametro), el área 
     * del círculo(buscalo en google).
     */
    public static void main(String[] args) {
        //declarar variables
        double radio; 
        double diametro;
        double longitud;
        double area;
        /*establecer valor a la variable radio 
        por consola con System.in
        */
        Scanner pantalla = new Scanner (System.in);
        
        System.out.println("Valor del radio: ");
        radio = pantalla.nextInt();
        //calcular diametro para saber longitud
        diametro = radio * 2;
        //calcular longitud y area de circunferencia
        longitud = Math.PI * diametro;
        area = Math.PI * radio * radio;
        //mostrar resultado por pantalla
        System.out.println("La longitud de la circunferencia es... " + longitud);
        System.out.println("El area de la circunferencia es... " + area);
    }
    
}
