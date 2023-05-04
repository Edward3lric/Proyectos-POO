/*
 * Nombre : Melchor Ruiz Gonzalez
 * Grupo : DSM102
 * Descripción : Este programa pide un numero hasta que el numero sea 0 y me dice si es positivo o negativo
 */
package javaapplications;
import java.util.Scanner;
public class diferenteDeCero {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int num;
        
        do{
            System.out.println("Puedes decirme un número");
            num = read.nextInt();
            if (num > 0){
                System.out.println("El número es positivo");
            }
            else{
                if (num < 0){
                    System.out.println("El número es negativo");
                }
            }
        }
        while (num != 0);
        System.out.println("El número es un cero");
    }
}
