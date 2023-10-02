/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyaleforma2;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class ClashRoyaleforma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int carta, copas;
        //escanear por pantalla
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas copas tienes?");
        copas = sc.nextInt();
        System.out.println("Escoge carta...");
        
        if(copas<2000){
            System.out.println("Escoge entre el mago (0) o mega esbirro (1)");
        }
        else if (copas>=2000 && copas<3000){
            System.out.println("Entre bandida (0) o caballero (1)");
        }
        else if (copas>=3000){
            System.out.println("Entre esqueletos (0) o gigante (1)");
        }
        System.out.println("opcion?");
        carta = sc.nextInt();
        
        if(carta == 0){
            if (copas<2000){
                System.out.println("has escogido mago");
            }
            else if(copas>=2000 && copas<3000){
                System.out.println("has escogido bandida");
            }
            else{
                System.out.println("esqueletos");
            }
        }
        else if (carta == 1){
            if (copas<2000){
                System.out.println("has escogido esbirro");
            }
            else if(copas>=2000 && copas<3000){
                System.out.println("has escogido caballero");
            }
            else{
                System.out.println("gigante");
            }
        }
        else{
            System.out.println("opcion no valida");
        }
    }
    
}
