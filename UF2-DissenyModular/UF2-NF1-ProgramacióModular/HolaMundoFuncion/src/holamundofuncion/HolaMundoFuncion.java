/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundofuncion;

/**
 *
 * @author adca5503
 */
public class HolaMundoFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // System.out.println("Inicio main");
       //imprimeHolaMundo();
       //System.out.println("Final main");
       /**********************************/ 
       // int num = 5;
       // int calculo = doble(num);
       // System.out.println("El doble de " + num + " es " + calculo);
       /*************************************************************/
     
       int v1=2;
       int v2 = 2;
       int calculo = multiplica(v1,v2);
       System.out.println("La multiplicacio de "+v1+ " i " + v2+ " es " + calculo);
        
    }
    
    //funcions fora del main
    
    /**
     * función que muestra por consola hello world
     */
    public static void imprimeHolaMundo(){
        System.out.println("Hello World");
    }
    
    /**
     * funcion que devuleve el doble
     * @param valor el valor del cual calcularemos el doble
     * @return valor doble del entrado
     */
    public static int doble(int valor){
        int resultado = valor * 2;
        
        return resultado;
    }
    
    /**
     * multiplica
     * recibe dos parametros y los multiplica entre ellos
     * @param v1 primer parametro
     * @param v2 segundo parametro
     * @return resultado de la multiplicacion entera
     */
    public static int multiplica(int v1, int v2){
        int resultado = v1*v2;
        return resultado;
    }
    
}
