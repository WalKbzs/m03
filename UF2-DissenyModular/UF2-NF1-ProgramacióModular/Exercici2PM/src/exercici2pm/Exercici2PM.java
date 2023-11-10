/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2pm;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class Exercici2PM {

    /**
     * @param args the command line arguments
     * Escribe un programa que pida la edad por teclado y muestre por pantalla 
     * si eres mayor de edad o no. Implementa y utiliza la función: 
     * boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
     */
    public static void main(String[] args) {
       
        int age;
        boolean mayor;
        age = pedirDatoEnteroPositivo();//funcionalitat 1 pedir dato positivo
        mayor = esMayorEdad(age);//averiguar si eres mayor de edad
        mostrarConsolaMayorEdad(mayor);//mostrar por consola el resultado
       
    }
    /**
     * mayor de edad o no
     * @param edad
     * @return si a>=18 mayor edad
     */
    public static boolean esMayorEdad(int edad){
      
       if (edad>=18){
           return true;
       }
       else{
           return false;
       }
     
    }
    /**
     * 
     * @return 
     */
     public static int pedirDatoEnteroPositivo(){
           Scanner sc = new Scanner (System.in);
           int num;
           System.out.println("Edad?");
           do{
               System.out.println("Valor debe ser superior a 0");
               num = sc.nextInt(); 
           }while (num<=0);
           return num;
       }
     /**
      * 
      * @param mayor 
      */
     private static void mostrarConsolaMayorEdad(boolean mayor) {
       if (mayor){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }    
    }
}
