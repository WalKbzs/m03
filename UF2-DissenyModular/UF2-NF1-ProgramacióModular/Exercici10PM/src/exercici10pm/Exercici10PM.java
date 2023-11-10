/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici10pm;

import java.util.Scanner;

/**
 *
 * @author adca5503
 */
public class Exercici10PM {

    /**
     * @param args the command line arguments
     * Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
     * si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear una
     * función donde le pasemos los datos y devuelva si es correcta o no.
     */
    public static void main(String[] args) {
        int dia, mes, any;
        System.out.println("Dia: ");
        dia = pedirDatoEnteroPositivo();
        System.out.println("Mes: ");
        mes = pedirDatoEnteroPositivo();
        System.out.println("Any: ");
        any = pedirDatoEnteroPositivo();
        
        boolean valida_dia, valida_mes, valida_any;
        
        valida_dia = validaDia(dia);
        valida_mes = validaMes(mes);
        valida_any = validaAny (any);
        
        //if (valida_dia == true && valida_mes == true && valida_any == true)
        if(valida_dia && valida_mes && valida_any){
            System.out.println("Fecha correcta");
        }
        else{
            System.out.println("Fecha incorrecta");
        }
    }
    public static int pedirDatoEnteroPositivo(){
           Scanner sc = new Scanner (System.in);
           int num;
           do{
               System.out.print("Valor debe ser superior a 0: ");
               num = sc.nextInt(); 
           }while (num<=0);
           return num;
       }
    
    public static boolean validaDia(int dia){
        
        if (dia>=1 && dia<=30){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean validaMes (int mes){
      
        if (mes >=1 && mes<=12 ){
            return true;
        }
        else{
            return false;
        }
    }
      public static boolean validaAny (int any){
        
        if (any >=1900){
            return true;
        }
        else{
           return false;
        }
       
    }
    
}
