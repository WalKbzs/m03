/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg18;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int hora;
        double T_NORMAL = 20;
        int HORAS_NORMAL = 35;
        double salario;
        int h_extra;
        double salario_extra;
        double salario_normal;
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon las horas que trabajas semanalmente:");
        hora = sc.nextInt();
        
        if (hora > HORAS_NORMAL){
            h_extra = hora - HORAS_NORMAL;
            salario_extra = h_extra * T_NORMAL * 1.5;
            salario_normal = HORAS_NORMAL * T_NORMAL;
            salario = salario_extra + salario_normal;
        }
        else{
            salario = hora * T_NORMAL;
        }
         System.out.println("Tu salario es... " + salario);
    }
    
}
