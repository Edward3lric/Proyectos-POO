/*
 * Nombre : Melchor Ruiz Gonzalez
 * Grupo : DSM102
 * Descripción : Este programa promedia edades
 */
package contadoryacumulador;
import java.util.Scanner;
public class ContadorYAcumulador {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int edad, acumulador, promedio;
        acumulador = 0;
        
        for(int i; i <= 5; i++){
            System.out.println("¿Cuál es tu edad?");
            edad = read.nextInt();
            acumulador = acumulador + edad;
        }
        
        promedio = acumulador / 5;
        System.out.println("El promedio de las edades es: " + promedio);
    }
    
}
