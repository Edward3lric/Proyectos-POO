/*
 * Nombre : Melchor Ruiz Gonzalez
 * Grupo : DSM102
 * Descripción : Este programa suma los numeros del 1 al 20
 */
package javaapplications;
public class sumando {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 20; i++){
            System.out.println(suma+"+"+i);
            suma = suma + i;
        }
        System.out.println("El resulta de sumar los numeros del 1 al 20 es: " + suma);
    }
}
