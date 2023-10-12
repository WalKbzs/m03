/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clash.royale;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class ClashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar variables
        int carta, copas;
        //escanear por pantalla
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas copas tienes?");
        copas = sc.nextInt();
       
        if (copas>=0 && copas<2000){
          System.out.println("Que carta eliges Mago Electrico (0) o Mega Esbirro (1)?");
          carta = sc.nextInt();
        
          if (carta == 0){
              System.out.println("Has elegido el Mago Electrico");
          }
          else if (carta == 1){
              System.out.println("Has elegido el Mega Esbirro");
          }
        }
        else if (copas>=2000 && copas<3000){
           System.out.println("Que carta eliges Caballero (0) o Bandida(1)?");
          carta = sc.nextInt();
        
          if (carta == 0){
              System.out.println("Has elegido el Caballero");
          }
          else if (carta == 1){
              System.out.println("Has elegido la Bandida");
          } 
        }
        else if (copas>=3000){
          System.out.println("Que carta eliges ejercito esqueletos (0) o Gigante Noble(1)?");
          carta = sc.nextInt();
        
          if (carta == 0){
              System.out.println("Has elegido el ejercito de esqueletos");
          }
          else if (carta == 1){
              System.out.println("Has elegido el Gigante Noble");
          }   
        }
       
       
       
       
    }
    
}
