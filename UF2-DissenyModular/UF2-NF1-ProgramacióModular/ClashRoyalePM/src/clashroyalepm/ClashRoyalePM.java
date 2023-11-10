/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyalepm;

import java.util.Scanner;

/**
 *
 * @author adric
 */
public class ClashRoyalePM {

    /**
     * @param args the command line arguments
     * Exercici 1: Les lluites a clash royale, no és res més que atacs repetitius 
     * contra una torre o contra un altre rival, fins que mor el rival/torre o 
     * mort el nostre jugador. El atacant fa un cop amb una nivell de força 
     * determinada que és resta de la vida del que ha atacat.
     */
    public static void main(String[] args) throws InterruptedException {
       int nivel_leñador = dimeNivelLeñador();
       int nivel_torre = dimeNivelTorre();
       int daño_leñador = 0 , vida_torre = 0, golpes;
       //niveles daño leñador
       if (nivel_leñador == 9){
           daño_leñador = 200;
       }
       else if (nivel_leñador == 10){
           daño_leñador = 220;
       }
        else if (nivel_leñador == 11){
           daño_leñador = 242;
       }
        else if (nivel_leñador == 12){
           daño_leñador = 266;
       }
        else if (nivel_leñador == 13){
           daño_leñador = 292;
       }
        else if (nivel_leñador == 14){
           daño_leñador = 320;
       }
        else{
            System.out.println("Error. Nivel 9-14");
        }
       //niveles vida torre
       if(nivel_torre == 1){
           vida_torre = 1400;
       }
       else if(nivel_torre == 2){
           vida_torre = 1512;
       }
       else if(nivel_torre == 3){
           vida_torre = 1624;
       }
       else if(nivel_torre == 4){
           vida_torre = 1750;
       }
       else if(nivel_torre == 5){
           vida_torre = 1890;
       }
       else if(nivel_torre == 6){
           vida_torre = 2030;
       }
       else if(nivel_torre == 7){
           vida_torre = 2184;
       }
       else if(nivel_torre == 8){
           vida_torre = 2352;
       }
       else if(nivel_torre == 9){
           vida_torre = 2534;
       }
       else if(nivel_torre == 10){
           vida_torre = 2786;
       }
       else if(nivel_torre == 11){
           vida_torre = 3052;
       }
       else if(nivel_torre == 12){
           vida_torre = 3346;
       }
       else if(nivel_torre == 13){
           vida_torre = 3668;
       }
       else if(nivel_torre == 14){
           vida_torre = 4032;
       }
       else{
           System.out.println("Error. Nivel 1-14");
       }
       
       
       golpes = golpesLeñador(daño_leñador, vida_torre);
       
       int marcador = marcadorgolpes(golpes);
       
       
    }
    public static int dimeNivelLeñador(){
        int nivel_leñador;
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime nivel leñador: ");
        nivel_leñador = sc.nextInt();
        return nivel_leñador;
    }
    public static int dimeNivelTorre(){
        int nivel_torre;
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime nivel torre: ");
        nivel_torre = sc.nextInt();
        return nivel_torre;
    }
    public static int golpesLeñador (int daño_leñador, int vida_torre) throws InterruptedException{
        int golpes = 0;
        do{
            vida_torre -= daño_leñador;
            System.out.println("Leñador ataca con fuerza de valor--> " + daño_leñador+ " *** La torre le queda de vida--> " + vida_torre);
            Thread.sleep(500);
            golpes ++;
        }while (vida_torre>0);
        return golpes;
    }
    public static int marcadorgolpes(int golpes){
        System.out.println("El leñador necesitó " + golpes + " golpes para eliminar a la torre.");
        return golpes;
    }
}
