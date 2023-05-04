/*
 * Nombre : Melchor Ruiz Gonzalez
 * Grupo : DSM102
 * Descripción : Este programa cuenta los numero divisibles entre 20 del 0 al 10000
 */
package javaapplications;
public class combinarEstructuras {
    public static void main(String[] args) {
        int contador = 0;
        
        for (int i = 0; i <= 10000; i++){
            if (i % 20 == 0){
                contador++;
            }
        }
        
        System.out.println("El número de números divisibles entre el cero y el 10000 son: " + contador);
    }
}
