/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1confor;

/**
 *
 * @author adca5503
 */
public class Exercici1conFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cont;
       //For
        System.out.println("For****");
        for (cont = 1; cont<=20 ; cont++) {
             System.out.println("Contador-->" + cont); 
        }
        //While
        System.out.println("While****");
        cont =1;
        while(cont<=20){
              System.out.println("Contador-> " + cont );
            cont = cont +1;
        }
        //DoWhile
        System.out.println("DoWhile*****");
        cont=1;
         do{
             System.out.println(cont);
             cont= cont +1;
         }while (cont<=20);     
    }
    
}
