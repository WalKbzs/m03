/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici21pm;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici21PM {

    /**
     * @param args the command line arguments
     * Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
     * En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
     * oportuno. Implementa las funciones:
     * int menu() // Muestra el menú y devuelve el número elegido
     * double pideRadio() // Pide que se introduzca el radio y lo devuelve
     * double circunferencia(double r) // Calcula la circunferencia y la devuelve
     * double area(double r) // Calcula el área y la devuelve

     */
    public static void main(String[] args) {
        
        int opcion = menu();
        double longitud, radio,area;
        System.out.println("opcion escogida " + opcion);
        radio= pideRadio();
        if(opcion ==1){
            longitud = circunferenciaLongitud(radio);
            System.out.println("Longitud circunferencia --> " + longitud);
        }
        else if(opcion == 2){
            area = area(radio);
            System.out.println("Area circunferencia --> " + area);
        }
    }
    public static int menu(){
        Scanner sc = new Scanner (System.in);
        System.out.println("1. Longitud circunferencia");
        System.out.println("2. Area circunferencia");
        int opcion;
        do{
            System.out.println("Elige opción (1/2): ");
            opcion = sc.nextInt();
            if(opcion <= 0 || opcion >2){
                System.out.println("Solo valido 1 o 2");
            }
        }while (opcion<=0 || opcion>2);
        return opcion;
    }
    public static double pideRadio(){
           Scanner sc = new Scanner (System.in);
           double radio;
           System.out.print("Dime longitud del radio: ");
           do{
               System.out.print("Valor debe ser superior a 0: ");
               radio = sc.nextInt(); 
           }while (radio<=0);
           return radio;
       }
    
    public static double circunferenciaLongitud (double radio){
       final double pi = 3.14;
       double longitud= pi*radio*2;
       return longitud;
   }
    
   public static double area (double r){
       double area = 0;
       final double pi = 3.14;
       area = r*r*pi;
       return area;
   }
   
}
