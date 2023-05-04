/*
 * Nombre : Melchor Ruiz Gonzalez
 * Grupo : DSM102
 * Descripción : Este programa calcula el proedio de 5 calificaciones
 */
package javaapplications;
import java.util.Scanner;
public class promedioCalificaciones {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int numCalificaciones = 5;
        int i = 1;
        int suma = 0;
        int calif;
        
        while (i <= numCalificaciones){
            System.out.println("Puedes decirme la calificación #" + i);
            calif = read.nextInt();
            suma = suma + calif;
            i++;
        }
        
        System.out.println("El promedio de las " + numCalificaciones + " calificaciones es: " + (suma / numCalificaciones));
    }
}
