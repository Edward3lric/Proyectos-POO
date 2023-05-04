/*
 * Nombre : Melchor Ruiz Gonzalez
 * Grupo : DSM102
 * Descripción : Este programa utiliza el ciclo do-while
 */
package javaapplications;
public class Do_While {
    public static void main(String[] args) {
        int número = 4557888;
        int dígitos = 12;
        do {
            número /=10;
            dígitos++;
        }
        while ( número > 0 );
        System.out.println(dígitos);
    }
}
