/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplecajasnormalesrarasepicas;

import java.util.Scanner;

/**
 *abrir 
 * @author adca5503
 */
public class Exemplecajasnormalesrarasepicas {

    /**
     * abrir cajas que el 60% son normales
     * 30% raras
     * 10% epicas
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num_usuari,intentos = 0;
        int max = 100;
        int min = 1;
        int range = max - min +1;
        int num_correcte;
        
        int cont;
        int normal=0,rara=0,epica=0;
        
        for(cont = 1; cont<=100; cont++){
        num_correcte = (int)(Math.random()*range) + min;
        if(num_correcte>= 1 && num_correcte<=60){
            System.out.println("Caja normal");
            normal++;
        }
        else if (num_correcte>60 && num_correcte<=90){
            System.out.println("Caja rara");
            rara++;
        }
        else{
            System.out.println("Caja epica");
            epica++;
        }
        
        }
        System.out.println("epicas= "+epica);
        System.out.println("raras= "+ rara);
        System.out.println("normales= " + normal);
    }
    
}
