/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyalecharactersforma2;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class ClashRoyaleCharactersforma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int copas;
         char carta;
        //escanear por pantalla
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas copas tienes?");
        copas = sc.nextInt();
        System.out.println("Escoge carta...");
        
        if(copas<2000){
            System.out.println("Escoge entre el mago (m) o mega esbirro (e)");
        }
        else if (copas>=2000 && copas<3000){
            System.out.println("Entre bandida (b) o caballero (c)");
        }
        else if (copas>=3000){
            System.out.println("Entre esqueletos (s) o gigante (g)");
        }
        System.out.println("opcion?");
        carta = sc.next().charAt(0);//recollir character
        System.out.println("eleccio-<"+carta);
        
        /*if (carta == 's' || carta == 'S'){
            System.out.println("has escogido esqueletos");
        }
        else if (carta == 'g'|| carta == 'G'){
            System.out.println("has escogido gigante");
        }
        else if (carta == 'b' || carta == 'B'){
            System.out.println("has esocgido bandida");        
        }
        else if (carta == 'c' || carta == 'C'){
            System.out.println("has esocgido caballero");        
        }
        else if (carta == 'm' || carta == 'M'){
            System.out.println("has esocgido mago");        
        }
        else if (carta == 'e' || carta == 'E'){
            System.out.println("has esocgido esbirro");        
        }
        else{
            System.out.println("opcion no valida");
        }*/
        switch (carta) {
            case 's':
            case 'S':
                System.out.println("has escogido esqueletos");
                break;
            case 'g':
            case 'G':
                System.out.println("has escogido gigante");
                break;
            case 'b':
            case 'B':
                System.out.println("has esocgido bandida");
                break;
            case 'c':
            case 'C':
                System.out.println("has esocgido caballero");
                break;
            case 'm':
            case 'M':
                System.out.println("has esocgido mago");
                break;
            case 'e':
            case 'E':
                System.out.println("has esocgido esbirro");
                break;
            default:
                System.out.println("opcion no valida");
                break;
        }
    }
}
