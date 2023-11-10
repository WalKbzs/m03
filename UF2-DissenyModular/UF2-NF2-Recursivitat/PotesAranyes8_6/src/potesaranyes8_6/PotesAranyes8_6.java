/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potesaranyes8_6;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class PotesAranyes8_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Dime el numero de arañas y te dire su numero de patas");
        int num_aranyes = sc.nextInt();
        int patas = potes (num_aranyes);
        System.out.println(num_aranyes + " aranya/s tienen "+patas+ " patas");
    }
    /**
     * calculara el numero de potes total de aranyes amb fora recursiva
     * @param aranyes numero de aranyes que vull calcular
     * @return el numero de potes
     */
    public static int potes (int aranyes){
        if(aranyes == 0){
            return 0;
        }
        else if (aranyes == 1){
            return 8;/*numero de potes*/
        }
        else if(aranyes>1){
            return 8 + potes(aranyes-1);
        }
        return 0;
    }
    private static int potes_radioactives(int num_aranyes){
        if(num_aranyes == 1){/*caso base*/
            return 8;
        }
        else if(num_aranyes%2==0){/*par*/
            return 6+ potes_radioactives(num_aranyes-1);
        }
        else if(num_aranyes%2!=0){/*impar*/
            return 8+potes_radioactives(num_aranyes-1);
        }
        else{
            return 0;
        }
    }
    
}
    

