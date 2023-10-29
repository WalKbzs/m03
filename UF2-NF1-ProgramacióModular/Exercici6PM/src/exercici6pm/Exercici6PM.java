/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6pm;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici6PM {

    /**
     * @param args the command line arguments
     * Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
     * uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
     * double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
     */
    public static void main(String[] args) {
       int precio1, precio2, precio3, precio4, precio5;
        
        System.out.println("Dime 5 precios:");
        System.out.println("Precio 1: ");
        precio1 = pedirDatoEnteroPositivo();
        System.out.println("Precio 2: ");
        precio2 = pedirDatoEnteroPositivo();
        System.out.println("Precio 3: ");
        precio3 = pedirDatoEnteroPositivo();
        System.out.println("Precio 4: ");
        precio4 = pedirDatoEnteroPositivo();
        System.out.println("Precio 5: ");
        precio5 = pedirDatoEnteroPositivo();
        
        double precio_con_IVA1 = precioConIVA (precio1);
        double precio_con_IVA2 = precioConIVA (precio2);
        double precio_con_IVA3 = precioConIVA (precio3);
        double precio_con_IVA4 = precioConIVA (precio4);
        double precio_con_IVA5 = precioConIVA (precio5);
        
        mostrarResultado(precio_con_IVA1,precio_con_IVA2, precio_con_IVA3, precio_con_IVA4, precio_con_IVA5); 
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
    public static final double IVA = 21;
    public static double precioConIVA(double precio){
        double calculo_IVA = precio + (precio * IVA/100);
        
        return calculo_IVA;
    }
    public static void mostrarResultado(double precio1, double precio2, double precio3, double precio4, double precio5){
        System.out.println("Precio con IVA 1: " + precio1);
        System.out.println("Precio con IVA 2: " + precio2);
        System.out.println("Precio con IVA 3: " + precio3);
        System.out.println("Precio con IVA 4: " + precio4);
        System.out.println("Precio con IVA 5: " + precio5);        
    }
}
