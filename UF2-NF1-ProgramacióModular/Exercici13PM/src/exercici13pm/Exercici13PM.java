/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13pm;

import java.util.Scanner;

/**
 *
 * @author adca5503
 * Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
 * Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
 * crear una función a la que le pasemos ambos valores y nos devuelva el descuento.
 */
public class Exercici13PM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precioReal, precioPagado;
        System.out.println("Pon precio real");
        precioReal = pedirDatoDoublePositivo();
        System.out.println("Pon precio pagado... ");
        precioPagado = pedirDatoDoublePositivo();
        
        double descuento = calcularDescuento(precioReal, precioPagado);
        System.out.println("Tu descuento es... " + descuento);
        
    }
    public static double calcularDescuento(double precioSinDescuento, double precioConDescuento){
        double descuento = 100 - (precioConDescuento*100)/precioSinDescuento;
        return descuento;
    }
    public static double pedirDatoDoublePositivo(){
           Scanner sc = new Scanner (System.in);
           double num;
           do{
               System.out.print("Valor debe ser superior a 0: ");
               num = sc.nextDouble(); 
           }while (num<=0);
           return num;
       }
}
