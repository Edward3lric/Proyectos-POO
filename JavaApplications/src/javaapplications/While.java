/*
 * Nombre : Melchor Ruiz Gonzalez
 * Grupo : DSM102
 * Descripción : Este programa utiliza el ciclo while
 */
package javaapplications;
public class While {
    public static void main(String[] args) {
        int i = 0;
        while ( i <= 3) {
            System.out.println("El valor actual de la cifra es: " + i);
            i++;
            int step = 0;
            while ( step <= 3 ) { 
                System.out.println("El valor intermedio actual está en: " + step);
                step++;
            }
        }
    }
}
