/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg16;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici16 {

    /**
     * @param args the command line arguments
     * lea una calificación numérica entre 0 y 10 y la transforma en 
     * calificación alfabética, escribiendo el resultado.
     */
    public static void main(String[] args) {
        // declarar variable
        double nota;
        /*establecer valor a la variable radio 
        por consola con System.in
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota que has sacado:");
        nota = sc.nextDouble();
        //condición
        if (nota<0 || nota>10){
            System.out.println("Nota no valida");
        }
        else{//notas válidas
           if (nota>=0 && nota<3){
            System.out.println("Nota muy deficiente");
        }
        else if (nota>=3 && nota<5){
            System.out.println("Nota insuficiente"); 
        }
        else if (nota>=5 && nota<6){
            System.out.println("Nota bien");
        }
        else if (nota>=6 && nota<9){
            System.out.println("Nota notable");
        }
        else if (nota>=9 && nota<=10){
            System.out.println("Nota excelente");
        }  
        }
    }
           
}
