/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3provacorreccio;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici3provacorreccio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int premium, local, mercadillo;
       final int p_premium, p_local, p_mercadillo, compra;
       Scanner sc = new Scanner (System.in);
        System.out.println("Nombre de productes premium que tens a la cistella de la compra:");
        premium = sc.nextInt();
        
        System.out.println("Nombre de productes locals que tens a la cistella de al compra:");
        local= sc.nextInt();
        System.out.println("Nombre de productes mercadillo que tens a la cistella de al compra:");
        mercadillo = sc.nextInt();
        
        int nombretotal;
        
        nombretotal = premium + local + mercadillo;
        
        p_premium = 20;
        p_local = 15;
        p_mercadillo = 7;
        compra = (p_premium * premium)+ (p_local*local)+(p_mercadillo*mercadillo);
        
        double descompte;
        if (nombretotal<5){
            System.out.println(compra);
        }
        else{
            descompte = compra * 0.15;
            System.out.println(descompte);
        }
        

        if (compra>200)
    }
    //NO SALE MIRAR!
}
