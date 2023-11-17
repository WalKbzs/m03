/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propagaciovirus;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class PropagacioVirus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon el dia y te dire cuantos virus hay");
        int dia = sc.nextInt();
        System.out.println("llevas " + contar_virus(dia)+ " virus");
    }
    public static int contar_virus(int dia){
        if(dia==1){/*1minimo pude haber más*/
            return 1;
        }
        //caso recursivo 1 minimo pero puede haber más
        else{
            return contar_virus(dia-1)*3;
        }
    }
    
}
