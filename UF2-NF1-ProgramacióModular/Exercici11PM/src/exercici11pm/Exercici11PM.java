/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici11pm;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici11PM {

    /**
     * @param args the command line arguments
     * Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
     * Para ello implementa una función que reciba como parámetro un número entero y muestre por
     * pantalla la tabla de multiplicar de dicho número.

     */
    public static void main(String[] args) {
        int num, resultado;
        System.out.println("Dime un numero");
        num= pedirDatoEnteroPositivo();
        int calculo_tabla;
        calculo_tabla = tablaMultiplicar(numm);
        System.out.println(calculo_tabla);
    }
     public static int pedirDatoEnteroPositivo(){
           Scanner sc = new Scanner (System.in);
           int num;
           do{
               System.out.print("Valor debe ser superior a 0: ");
               num = sc.nextInt(); 
           }while (num<=0);
           return num;
       }
    public static void tablaMultiplicar(int num2)
    {
        int resultado;
        
        for (int num1 = 0; num1 < 11; num1++) {
            resultado = num1*num2;
            System.out.println(num1+ "*"+ num2+"="+resultado);
        }
        
    }
    
}
