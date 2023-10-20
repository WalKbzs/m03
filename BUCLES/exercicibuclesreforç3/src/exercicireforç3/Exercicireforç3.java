/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicireforç3;

/**
 *
 * @author adric
 */
public class Exercicireforç3 {

    /**
     * @param args the command line arguments
     * Escriu un programa que mostri per pantalla els 10 múltiples de 7 a partir del 12
     */
    public static void main(String[] args) {
        
        int num = 12;
        int cont = 0;
        
        do{
            if(num % 7 == 0){
                System.out.println(num);
                cont++;
            }
            num++;
        }while(cont<10);     
    }
    
}
