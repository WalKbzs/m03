/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notesaleatories;

/**
 *
 * @author adca5503
 */
public class NotesAleatories {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notas_alumnos[]=new int [5];
        int valorInventado = 7;
        //inicialitzar les notes
        introduccioNotas(notas_alumnos);
        Mostrar_array_int(notas_alumnos);
    }
    private static void introduccioNotas(double[]notas_alumnos){
        int max = 10, min=0, range;
        range = max - min +1;
        for(int index = 0; index<notas_alumnos.length; index++){
            notas_alumnos [index]= (int)(Math.random()*range+min);
        }
    }
    private static void Mostrar_array_int (int[] valores){
        for(int index= 0; index<valores.length;index++){
            System.out.println(index+"->" + valores[index]);
        }
    }
    private static double CalcularlMediaNotas(int []notas_alumnos){
        double media;
        int suma = 0;
        System.out.println("Calcular media");
        for (int index=0; index<notas_alumnos.length;index++){
            System.out.println(index+"->"+ notas_alumnos[index]);
            suma=suma+notas_alumnos[index];
        }
        media=(double)suma/notas_alumnos.length;
        return media;
        }
}
