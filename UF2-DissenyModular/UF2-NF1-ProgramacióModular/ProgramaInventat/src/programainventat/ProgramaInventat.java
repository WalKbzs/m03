/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programainventat;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class ProgramaInventat {

    /**
     * @param args the command line arguments
     * Juego de francotiradores
     */
    public static void main(String[] args) {
     
        int eleccion_usuario = accionUsuario();
        System.out.print("El usuario elige --> ");
        int dañoUsuario = impAccion(eleccion_usuario);
        int eleccion_francotirador = accionFrancotirador();
        System.out.print("El francotirador elige --> ");
        int dañoFrancotirador = impAccion(eleccion_francotirador);
        int vida_usuario = vidaOponentes(eleccion_usuario);
        int vida_francotirador = vidaOponentes(eleccion_francotirador);
        Disputa(dañoUsuario, vida_usuario, dañoFrancotirador, vida_francotirador);   
    }
    /**
     * Pide la accion del usario
     * @return 
     */
    public static int accionUsuario() {
        Scanner sc = new Scanner(System.in);
        int accion;
        do {
            System.out.println("Que accion quieres hacer? (0 avanzar, 1 disparar): ");
            accion = sc.nextInt();
        } while (accion != 0 && accion != 1 && accion !=2);
        return accion;
    }
    /**
     * Accion aleatoria del francotirador de la máquina
     * @return 
     */
    public static int accionFrancotirador() {
        System.out.println("Accion francotirador:");
        int max = 1;
        int min = 0;
        int range = max - min + 1;
        int aleatorio = (int) (Math.random() * range) + min;
        return aleatorio;
    }
    /**
     * Vida tras empezar a jugar, 1 vida
     * @param jugada
     * @return 
     */
    public static int vidaOponentes(int accion) {
        int vida = 0;
        if (accion == 0 || accion == 1) { 
            vida = 1;
        }
        return vida;
    }
    /**
     * Imprime la acción
     * @param choose
     * @return 
     */
    public static int impAccion(int choose) {
        int daño = 0;
        if (choose == 0) {
            System.out.println("Avanzar");
            daño = 0;
        } else if (choose == 1) { // Disparo
            System.out.println("Disparo");
            daño = 1;
        }
        else {
            System.out.println("Opción no válida");
        }
        return daño;
    }
    /**
     * Realiza la disputa
     * @param dañoUsuario
     * @param vidaUsuario
     * @param dañoFrancotirador
     * @param vidaFrancotirador 
     */
    public static void Disputa(int dañoUsuario, int vidaUsuario, int dañoFrancotirador, int vidaFrancotirador) {
        vidaUsuario -= dañoFrancotirador;
        vidaFrancotirador -= dañoUsuario;
        if (vidaUsuario < 0) {
            vidaUsuario = 0;
        }
        if (vidaFrancotirador < 0) {
            vidaFrancotirador = 0;
        }
        System.out.println("Vida usuario --> " + vidaUsuario + " Vida francotirador --> " + vidaFrancotirador);
        Ganador(vidaUsuario, vidaFrancotirador);
    }
    /**
     * Muestra el ganador o si hay empate
     * @param vidaUsuario
     * @param vidaFrancotirador 
     */
    public static void Ganador(int vidaUsuario, int vidaFrancotirador) {
        if (vidaFrancotirador > vidaUsuario) {
            System.out.println("Gana francotirador");
        } else if (vidaFrancotirador == vidaUsuario) {
            System.out.println("Empate");
        } else {
            System.out.println("Gana usuario");
        }
    }
}
