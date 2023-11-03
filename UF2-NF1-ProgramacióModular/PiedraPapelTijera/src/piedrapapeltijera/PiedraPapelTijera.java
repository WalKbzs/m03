/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijera;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class PiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** Juego piedra, papel o tijera ***");
        int usuari = jugadaUsuari();
        int jugada_usuari = impJugada(usuari);
        int ordinador = jugadaOrdenador();
        int jugada_ordinador = impJugada(ordinador);
        int resultado = ganador(usuari, ordinador);
        impGanador(resultado);
    }
    /**
     * pide al usuario una tirada al jugador
     * @return 
     */
    public static int jugadaUsuari(){
        int gesto;
        Scanner sc = new Scanner (System.in);
        System.out.println("Jugada Usuari:");
        do{
              System.out.println("Que sacas? (0 piedra, 1 papel, 2 tijera)");
        gesto = sc.nextInt();
        
        }while(gesto<0 || gesto>2);
        return gesto;
    }
    /**
     * proporciona un valor aleatoria entre 0 y 2 incluido
     * @return 
     */
    public static int jugadaOrdenador(){
        System.out.println("Jugada Ordinador:");
        int max = 2;
        int min = 0;
        int range = max - min + 1;
        int aleatorio = (int) (Math.random()*range) + min;
        return aleatorio;
    }
    /**
     * imprime por pantalla la frase "Piedra", "papel" o "tijera" en función del parametro de entrada (0 piedra, 1 papel, 2 tijera)
     * @param choose
     * @return 
     */
    public static int impJugada (int choose){
        if(choose == 0){//piedra
            System.out.println("Piedra");
        }
        else if(choose == 1){//papel
            System.out.println("Papel");
        }
        else{//tijera
            System.out.println("Tijera");
        }    
        return choose;
    }
    /**
     * imprime el ganador de la tirada siguiendo esta regla,  si ganador vale 0 imprimir "hay empate", si es un 1 imprimir "has ganado", si es 2 debe imprimi que ha ganado el ordenador 
     * @param ganador
     * @return 
     */
    public static int impGanador(int ganador){
        if(ganador == 0){
            System.out.println("Hay empate");
        }
        else if(ganador == 1){
            System.out.println("Has ganado");
        }
        else{
            System.out.println("Ha ganado el ordenador");
        }
        return ganador;
    }
    /**
     * Imprime la puntuación de cada jugador por pantalla 
     */
    public static void marcador(int point_player1, int point_player2){
        System.out.println("Puntuacio usuari: " + point_player1);
        System.out.println("Puntuacio ordinador: " + point_player2);
    }
    /**
     * retorna el valor de entrada aumentado en uno
     * @param score
     * @return 
     */
    public static int aumentar_punto (int score){
        return score + 1;
    }
    /**
     *  retorna 0 si hay empate, 1 si gana el jugador 1 y 2 si gana el ordenador
     * @param choose_player1
     * @param choose_player2
     * @return 
     */
    public static int ganador(int choose_player1, int choose_player2){
        if(choose_player1 == choose_player2){//empat
            return 0;
        }
        else if((choose_player1 == 0 && choose_player2 == 2)||(choose_player1 == 1 && choose_player2 == 0)||(choose_player1 == 2 && choose_player2 == 1 )){//usuari
            return 1;
        }
        else{//ordinador
            return 2;
        }
    }
    
    
    
    
    
    
}
