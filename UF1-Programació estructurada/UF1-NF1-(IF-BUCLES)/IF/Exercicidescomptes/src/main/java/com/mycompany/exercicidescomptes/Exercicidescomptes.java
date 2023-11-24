/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicidescomptes;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercicidescomptes {

    public static void main(String[] args) {
        double precio, descuento = 0;
        double precio_total;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese su importe gastado:");
        precio = sc.nextDouble();
        
        if (precio < 800){
            descuento = (precio * 0 / 100);
        }
        else if (precio >= 800 && precio <= 1500){
            descuento = (precio * 6/100);
        }
        else if (precio > 1500 && precio <= 3000){
            descuento = (precio * 8/100);
        }
        else if (precio > 3000){
            descuento = (precio * 10/100);
        }
        
        //pago final
        precio_total = precio - descuento;
        
        System.out.println("Pagaras " + precio_total+ " por tu compra");
    }
}
