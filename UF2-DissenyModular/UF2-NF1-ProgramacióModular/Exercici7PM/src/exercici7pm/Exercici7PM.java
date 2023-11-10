/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici7pm;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici7PM {

    /**
     * @param args the command line arguments
     * Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y 
     * su perímetro. Implementa y utiliza las funciones:
     * double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
     * double areaRectangulo(double ancho, double alto) // Devuelve el área
     */
    public static void main(String[] args) {
        System.out.println("Area y perimetro rectangulo");
       double ancho, alto;
        System.out.println("Pon un ancho: ");
        ancho = pedirDatoEnteroPositivo();
        System.out.println("Pon un alto:");
        alto = pedirDatoEnteroPositivo();
        double perimetro = perimetroRectangulo(ancho, alto);
        double area = areaRectangulo(ancho, alto);
        mostrarResultado(area,perimetro);
        
       
    }
    public static double perimetroRectangulo(double ancho, double alto){
        double calculo_perimetro;
        calculo_perimetro = 2*ancho + 2*alto;
        
        return calculo_perimetro;
    }
    public static double areaRectangulo(double ancho, double alto){
     double calculo_area;
     calculo_area = ancho*alto;
     return calculo_area;
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

    private static void mostrarResultado(double area, double perimetro) {
      System.out.println("El area del rectangulo es... " + area);
      System.out.println("El perimetro del rectangulo es... " + perimetro);
    }
    
    
}
