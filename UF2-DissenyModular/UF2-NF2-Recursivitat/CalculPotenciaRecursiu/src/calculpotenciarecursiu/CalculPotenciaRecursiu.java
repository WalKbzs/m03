/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculpotenciarecursiu;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class CalculPotenciaRecursiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon la base ");
        int base = sc.nextInt();
        System.out.println("Pon exponente");
        int exponente= sc.nextInt();
        System.out.println("Potencia " + potencia(base, exponente));
    }
    public static int potencia (int base, int exp){
        //caso base exp sigui 0
        if (exp==1){
            return base;
        }
        else if (exp==0){
            return 1;
        }
        //caso recursiu 3.3.3.3 base*base*base
        //3^5=3*3^4
        //3^4= 3*3^3    
        //3^3=3*3^2
        else{
            return base*potencia(base, exp-1);
        }
    }
    
}
