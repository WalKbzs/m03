/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegosorpresa;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class JuegoSorpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        num = pedirNumero();
        
        int bola = caidaBola();
        System.out.println("Ha salido --> " + bola);
        
        
       
    }
    /**
     * pedira un numero al usuario que tiene que estar entre 1 y 38 si no, no lo devolvera Mostrara la frase "apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)
     * @return 
     */
    public static int pedirNumero()//hecho
    {
         Scanner sc = new Scanner (System.in);
           int num;
           
           do{
               System.out.println("*** Apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par): ***");
               num = sc.nextInt();
               
           }while (num<1 || num>38);
          System.out.println("Has escogido: " + num);
           return num;      
    }
    /**
     * S Simulara la caida de la bola, sera un valor aleatorio entre 1 y 36
     * @return 
     */
    public static int caidaBola()
    {
        System.out.println("*** Voy a generar un numero aleatorio del 1 al 36 ***");
        int max = 36;
        int min = 1;
        int range = max - min +1;
        int aleatorio = (int) (Math.random()*range) + min;
        return aleatorio;
    }
    /**
     * Si la respuesta de entrada es igual a s y el dinero es positivo, la función decide que es cierto que puede seguir jugando Si algun caso no se cumple, no puede
     * @param respuesta
     * @param dinero
     * @return 
     */
    public static boolean puedesJugar(char respuesta, int dinero)
    {
        
        if(respuesta=='s' && dinero>0){
        return true;
        }else{
            return false;
        }
    }
    
    
}
