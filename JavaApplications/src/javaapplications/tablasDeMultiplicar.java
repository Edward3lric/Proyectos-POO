/*
 * Nombre : Melchor Ruiz Gonzalez
 * Grupo : DSM102
 * Descripción : Este programa solicita un numero del 1 al 10 y crea su tabla de multiplicar
 */
package javaapplications;
import java.util.Scanner;
public class tablasDeMultiplicar {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int num1, result;
        
        System.out.println("Puedes decirme un número del 1 al 10");
        num1 = read.nextInt();
        
        System.out.println("La tabla del " + num1 + " es:");
        for (int i = 1; i <= 10; i++){
            result = num1 * i;
            System.out.println(num1 + " x " + i + " = " + result);
        }
    }
}