/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomvariablespositivosnegativos;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class RandomVariablesPositivosNegativos {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) { Scanner sc = new Scanner (System.in);
        int max = 201;
        int min = 1;
        int range = max - min +1;
        int num_correcte, num_cambiado_pos_neg;
        int mayor=100;
        System.out.println("Valores aleatorios del -100 al 100");
        for(int i = 0; i < 10; i++){
           num_correcte = (int)(Math.random()*range) + min;
           num_cambiado_pos_neg = num_correcte - (mayor+1);
            System.out.println(num_correcte+" <----> " + num_cambiado_pos_neg);
        }
    }
    
}
