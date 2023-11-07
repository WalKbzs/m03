/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provesstring_pm;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class ProvesString_PM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra; 
        String frase = "hola";
        String frase2;
        Scanner sc = new Scanner (System.in);
        letra = frase.charAt(2);
        System.out.println(letra+ " - "+frase);
        System.out.println("Pon una frase y la repetire");
        frase = sc.nextLine();
        System.out.println("Dime una posicion y te mostrare la letra en esa posicion");
        int pos = sc.nextInt();
        letra = frase.charAt(pos);
        System.out.println(letra+" - "+ frase);
        System.out.println("Pon una segunda frase y la comparo");
        //limpio buffer
        sc.nextLine();
        frase2 = sc.nextLine();
        
        if(frase.equals(frase2)){
            System.out.println("iguales");
        }
        else{
            System.out.println("Diferentes");
        }
    }
    
}
