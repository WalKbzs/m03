/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciaugmentsou;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exerciciaugmentsou {

    public static void main(String[] args) {
       double sueldo_actual, aumento = 0;
       double sueldo_total;
       
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese su sueldo actual:");
        sueldo_actual = sc.nextDouble();
       //aumento
        if (sueldo_actual < 18000 ){
            aumento = sueldo_actual * 0.12;
        }
        else if (sueldo_actual >= 18000 && sueldo_actual <= 30000){
            aumento = sueldo_actual * 0.10;
        }
        else if (sueldo_actual > 30000 && sueldo_actual < 45000){
            aumento = sueldo_actual * 0.08;
        }
        else if (sueldo_actual >= 45000){
            aumento = sueldo_actual * 0.06;
        }
        //sueldo año siguiente
        sueldo_total = sueldo_actual + aumento;
        
        System.out.println("El aumento de sueldo al final del año es..." + aumento);
        System.out.println("El sueldo que tendrá al año siguiente será..." + sueldo_total );
}
}
    
