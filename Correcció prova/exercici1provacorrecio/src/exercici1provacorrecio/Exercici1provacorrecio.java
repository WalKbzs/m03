/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1provacorrecio;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici1provacorrecio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int dia , mes, any;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon una fecha a partir del 1900:");
        
        System.out.println("Dia:");
        dia = sc.nextInt();
       
        System.out.println("Mes:");
        mes = sc.nextInt();
        
        boolean incorrecto = false;
        
        
        System.out.println("Any:");
        any = sc.nextInt();
        
        if (any<1900){
            System.out.println("Any introduit incorrecte. Ha de ser superior a 1900");
            incorrecto = true;
        }
        if (mes<=0 || mes>12){
            System.out.println("Mes incorrecte sol val 1-12");
            incorrecto = true;
            
        }
        if (dia<1 || dia >30){
            System.out.println("Dia incorrecte sol valid 1-30");
            incorrecto = true;
        }
        if (incorrecto ==false){
            System.out.println("Data correcte.....");
        }
    }
    
}
