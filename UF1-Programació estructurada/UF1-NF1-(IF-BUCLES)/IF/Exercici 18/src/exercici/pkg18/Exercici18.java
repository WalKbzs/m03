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
        //impuesto
        int salario_sin_impuestos = 500;
        double salario_impuesto;
        double impuestos = 0, impuestos_25;
        //tope impuestos
        double salario_tope_impuestos = 900;
                
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
         System.out.println("Tu salario bruto es... " + salario);
         //tope impuestos
         if (salario>salario_tope_impuestos){//he superado el tope y tengo que aplicar 45%
             salario_tope_impuestos = salario - salario_tope_impuestos;
             impuestos = salario_tope_impuestos * 0.45; //impuesto de lo que pasa del tope
             salario_impuesto = salario_tope_impuestos - salario_sin_impuestos;
             impuestos_25 = salario_impuesto * 0.25;
             impuestos = impuestos + impuestos_25;
         }
        //impuestos
         else if (salario>salario_sin_impuestos && salario < salario_tope_impuestos){
             salario_impuesto = salario - salario_sin_impuestos;
             impuestos = (salario_impuesto * 25)/100;
             salario = salario - impuestos;  
             System.out.println("Impuestos... " + impuestos);
         }
         else{//no hay impuestos; podria borrar el else porque no hace falta
             impuestos = 0;
         }
         System.out.println("Tu salario NETO es... " + salario);
    }
    
}
