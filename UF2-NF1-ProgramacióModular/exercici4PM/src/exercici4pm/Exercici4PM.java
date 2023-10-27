/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4pm;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici4PM {

    /**
     * @param args the command line arguments
     * Escribe un programa que pida un número entero por teclado y muestre por pantalla si es 
     * positivo, negativo o cero. Implementa y utiliza la función:
     * int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
     */
    public static void main(String[] args) {
       
        int a;
        a = pedirDatoEntero();
        int signo = dimeSigno(a);
        mostrarSalida(signo);
       
        
    }
    /**
     * saber si es positivo, negativo o 0
     * @param a
     * @return -1 negativo, 0 es 0 y 1 positivo
     */
    public static int dimeSigno(int a){
       int resultado=0;
       if (a<0){
           resultado = -1;
       }
       else if (a == 0){
          resultado = 0 ;
       }
       else{
           resultado = 1;
       }
       return resultado;
    } 
    /**
     * 
     * @return 
     */
     public static int pedirDatoEntero(){
           Scanner sc = new Scanner (System.in);
           System.out.println("Pon un valor entero");
           int num;
           num = sc.nextInt(); 
           return num;
       }
    /**
     * 
     * @param signo 
     */
    private static void mostrarSalida(int signo) {
        if (signo == -1){
            System.out.println("Negativo");
        }
        else if(signo == 0){
            System.out.println("El numero es 0");
        }
        else{
            System.out.println("Positivo");
        }
    }
}
