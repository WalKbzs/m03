/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma_pars_recursivitat;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Suma_pars_recursivitat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Dime un numero");
        int x = sc.nextInt();
        int solucio = parells(x);
        System.out.println("Surt--> " +solucio);
    }
    public static int parells(int num){
    if(num%2!=0){
        return -1;
    }
    else if(num==0){
        return num;
    }
    else{
       int calculo=num+parells(num-2);
       return calculo;
    }
}
    
    
}
