/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3confor;

/**
 *
 * @author adca5503
 */
public class Exercici3conFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
       
        System.out.println("For****");
        for (cont = 1; cont<=200 ; cont= cont +1) {
             System.out.println("Contador-->" + cont); 
        }
        //DoWhile
        cont = 1;
        System.out.println("DoWhile****");
        do{
            System.out.println(cont);
            cont = cont +1;
        }while (cont <=200);
    }
    
}
