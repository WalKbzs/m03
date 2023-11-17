/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package turronsnadal;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class TurronsNadal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon el dia y te dire cuantos trozos llevas comidos");
        int dia = sc.nextInt();
        System.out.println("llevas " + conta_trozos(dia)+ " trozos");
        System.out.println("Calorias--> " + contar_calorias(dia));
    }
    public static int conta_trozos(int dia){
        if(dia==1){/*1minimo pude haber más*/
            return 4;
        }
        //caso recursivo 1 minimo pero puede haber más
        else if (dia%3==0){
            return 1 + conta_trozos(dia-1);
        }
        else{//no multiple de 3
            return 4 + conta_trozos(dia-1);
        }
    }
    public static int contar_calorias(int dia){
         if(dia==0){/*1minimo pude haber más*/
            return 0;
        }
        //caso recursivo 1 minimo pero puede haber más
        else if (dia%3==0){
            return 1*91 + contar_calorias(dia-1);
        }
        else{//no multiple de 3
            return 4*91 + contar_calorias(dia-1);
        }
    }
    
}
