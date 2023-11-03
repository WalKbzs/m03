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
     * Si la respuesta de entrada es igual a s y el dinero es positivo, la función decide que es cierto que puede seguir jugando. Si algun caso no se cumple, no puede.
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
    /**
     * Calcula las ganancias, de la apuesta 1) Si el numero apostado es entre 1 y 36 sera el dinero apostado multiplicado por 35, 2) si el numero es 37 o 38 sera el doble del dinero_apostado.
     * @param dinero_apostado
     * @param num_apostado
     * @return 
     */
    public static int ganancias(int dinero_apostado, int num_apostado)
    {
        if(num_apostado>=1 && num_apostado<=36){
            return dinero_apostado*35;
        }
        else if(num_apostado>=37 && num_apostado<=38){
            return dinero_apostado*2;
        }
        else{
            return 0;
        }
    }
    /**
     * Dentro se pedira el dinero que quiere apostar, y devolvera el dinero siempre que sea valido positivo y no superior al dinero de la cartera.
     * @param dinero_disponible
     * @return 
     */
    public static int pedirDineroApuesta(int dinero_disponible)
    {
        Scanner sc = new Scanner (System.in);
        int dinero_apuesta;
        do{
            System.out.println("*** Dinero que quiere apostar: *** ");
            dinero_apuesta = sc.nextInt();
        }while(dinero_apuesta<0 || dinero_apuesta>dinero_disponible);
        return dinero_apuesta;
    }
    /**
     * comprueba si has ganado tu apuesta ... Ganas si bola es igual a num_apostado Tambien ganas si num_apostado es 37 y la bola es impar Tambien ganas si num_apostado es 38 y la bola es un numero par
     * @param bola
     * @param num_apostado
     * @return 
     */
    public static boolean eresGanador(int bola, int num_apostado)
    {
        if(num_apostado == bola){
            return true;
        }
        else if(num_apostado == 37 && bola%2!=0){
            return true;
        }
        else if(num_apostado == 38 && bola%2==0){
            return true;
        }
        else{
            return false;
        }
    }
     /**
     *  Dentro preguntara "Quieres seguir jugando(S/N) Devolvera la respuesta siempre que sea valida, valido solo es si pone s , n en mayusculas o minusculas Si no pone respuesta valida debe seguir preguntando
     * @return 
     */
     public static char seguirJugando()
     {
        Scanner sc = new Scanner(System.in);
        char seguir_jugando;
        do
        {
           System.out.println("*** Quieres seguir jugando? SI (s/S) o No (n/N) ***");
           seguir_jugando = sc.next().charAt(0);
           if (seguir_jugando=='S' || seguir_jugando=='s' || seguir_jugando=='N' || seguir_jugando=='n')
           {
               return seguir_jugando;
           }
        }while (seguir_jugando!='S' && seguir_jugando!='s' && seguir_jugando!='N' && seguir_jugando!='n');
        return seguir_jugando;
    }
    /** funcion que pinta tantos asteriscos en una linea como el valor num, al acabar los asterisco, pinta un - y el valor del num
     * 
     */
}