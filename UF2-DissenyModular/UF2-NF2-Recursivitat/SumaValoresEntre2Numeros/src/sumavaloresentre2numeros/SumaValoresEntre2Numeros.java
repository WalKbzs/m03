/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumavaloresentre2numeros;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class SumaValoresEntre2Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("Num1: ");
        int numero1= sc.nextInt();
        System.out.println("Num2: ");
        int numero2 = sc.nextInt();
        System.out.println("El resultat es " +suma_nums(numero1, numero2));
    }
    public static int suma_nums(int max, int min){
        if(max==min){
            return min;
        }
        else if(min<max){
            return min + suma_nums(max, min+1);
        }
        else if(max<min){
            return max+suma_nums(max+1, min);
        }
        return 0;
    }
    
}
