/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9bucles;

/**
 *
 * @author adca5503
 */
public class Exercici9bucles {

    /**
     * @param args the command line arguments
     * Realiza un programa que calcule y escriba la suma y el producto de los
     * 10 primeros números naturales
     */
    public static void main(String[] args) throws InterruptedException {
        int num;
 
        int suma = 0, producto=1;
         for (num = 1; num<=10;num++){
              System.out.println(num);
             suma = suma + num;
             System.out.println("num= " + num);
             producto = producto * num;
             System.out.println("producto= "+producto);
             Thread.sleep(200);
         }
         
        System.out.println("La suma es... " + suma);
         System.out.println("El producto es... " + producto);
        
    }
    
}
