/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2confor;

/**
 *
 * @author adca5503
 */
public class Exercici2conFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
       
        System.out.println("For****");
        for (cont = 1; cont<=200 ; cont= cont +2) {
             System.out.println("Contador-->" + cont); 
        }
        //DoWhile
        cont = 2;
        System.out.println("DoWhile****");
        do{
            System.out.println(cont);
            cont = cont + 2;
        }while (cont <=200);
        
        //While
        System.out.println("While***");
        cont = 2;
        while (cont<=200){
            System.out.println(cont);
            cont = cont + 2;
        }
        //proposat!
        System.out.println("1 al 200 el contador va de uno en uno pero solo quiere");
        for (cont = 0; cont  <= 200; cont = cont) {
            
        }
    }
    
}
