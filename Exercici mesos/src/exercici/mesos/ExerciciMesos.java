/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.mesos;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class ExerciciMesos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char mes;
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime un mes con su inicial puede ser mayusculua o minuscula (Enero hasta Abril)");
        mes = sc.next().charAt(0);
        
        switch (mes){
            case 'e':
            case 'E':
                System.out.println("Enero");
                break;
            case 'f':
            case 'F':
                System.out.println("Febrero");
                break;
            case 'm':
            case 'M':
                System.out.println("Marzo");
                break;
            case 'A':
            case 'a':
                System.out.println("Abril");
                break;
            default:
                System.out.println("letra no valida");
                break;
        }
    }
    
}
