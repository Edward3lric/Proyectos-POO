/*
 * Nombre : Melchor Ruiz Gonzalez
 * Grupo : DSM102
 * Descripción : Este programa pide un numero hasta que el numero negativo y me dice cuantos numeros fueron introducidos
 */
package javaapplications;
import java.util.Scanner;
public class cuantosPositivos {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int num;
        int contador = 0;
        do{
            System.out.println("¿Puedes decirme un número?");
            num = read.nextInt();
            contador++;
        }
        while (num >= 0);
        System.out.println("Introduciste " + contador + " números");
    }
}
