/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyalecharacters;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class ClashRoyaleCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //declarar variables
        int copas;
        char carta;
        //escanear por pantalla
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas copas tienes?");
        copas = sc.nextInt();
       
        if (copas>=0 && copas<2000){
          System.out.println("Que carta eliges Mago Electrico (M or m) o Mega Esbirro (E or m)?");
          carta = sc.next().charAt(0);
        
          if (carta == 'm' || carta == 'M'){
              System.out.println("Has elegido el Mago Electrico");
          }
          else if (carta == 'e' || carta == 'E'){
              System.out.println("Has elegido el Mega Esbirro");
          }
          else{
            System.out.println("Carta incorrecta");
          }
        }
        else if (copas>=2000 && copas<3000){
           System.out.println("Que carta eliges Caballero (C or c) o Bandida(B or b)?");
          carta = sc.next().charAt(0);
        
          if (carta == 'c' || carta == 'C'){
              System.out.println("Has elegido el Caballero");
          }
          else if (carta == 'b' || carta == 'B'){
              System.out.println("Has elegido la Bandida");
          } 
          else{
            System.out.println("Carta incorrecta");
          }
        }
        else if (copas>=3000){
          System.out.println("Que carta eliges ejercito esqueletos (E or e) o Gigante Noble(G or g)?");
          carta = sc.next().charAt(0);
        
          if (carta == 'e' || carta == 'E'){
              System.out.println("Has elegido el ejercito de esqueletos");
          }
          else if (carta == 'g'|| carta == 'G'){
              System.out.println("Has elegido el Gigante Noble");
          }  
           else{
            System.out.println("Carta incorrecta");
          }
        }  
    }
}
