/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialrecursiu;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class FactorialRecursiu {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Pon un numero y te calculare su factorial");
        valor = sc.nextInt();
        int total_factorial = factorial(valor);
        System.out.println(valor + "! = " + total_factorial);
    }
   
    public static int factorial(int numero) throws InterruptedException
    {
        //caso base (1 o mas)
       
        /*
        if(numero<=1)
        {
        return 1;
        }
        */
       
        if(numero==1)
        {
            System.out.println("Caso base --> " + numero + " retorno 1");
            return 1;
        }
        else if(numero==0)
        {
            System.out.println("Caso base --> " + numero + " retorno 1");
            return 1;
        }
       
        /*
        caso recursiu (1 o mes), quan torno a cridar la mateixa funcio
        la/les variables son les mateixes pero el valor ha canviat
        apropant-se al cas recursiu
        */
       
        else if(numero>1)
        {
            System.out.println("Caso recursivo --> " + numero);
            Thread.sleep(1000);
            int calculo = numero * factorial(numero-1);
            System.out.println("He hecho el calculo para " + numero + " y devuelve " + calculo);
            Thread.sleep(1000);
            return calculo;
        }
        return 0;
    }
}
