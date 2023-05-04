/*
 * Nombre : Melchor Ruiz Gonzalez
 * Grupo : DSM102
 * Descripción : Este programa calcula el costo de una llamada segun su zona geográfica
 */
package javaapplications;
import java.util.Scanner;
public class llamadasTelefonicas {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int clave;
        float minutos, result;
        System.out.println("Bienvenido");
        
        System.out.println("¿Cuál es la clave telefónica de la llamada?");
        System.out.println("[12] América del Norte, [15] América Central, [18] América del Sur, [19] Europa");
        clave = read.nextInt();
        System.out.println("¿Cuantos minutos duro la llamada?");
        minutos = read.nextFloat();
        
        switch (clave) {
            case 12:{
                System.out.println("La zona es: América del Norte");
                result = minutos * 2;
                System.out.println("El costo de la llamada es de: $" + result);
                break;
            }
            case 15: {
                System.out.println("La zona es: América Central");
                result = (float) (minutos * 2.2);
                System.out.println("El costo de la llamada es de: $" + result);
                break;
            }
            case 18: {
                System.out.println("La zona es: América del Sur");
                result = (float) (minutos * 4.5);
                System.out.println("El costo de la llamada es de: $" + result);
                break;
            }
            case 19: {
                System.out.println("La zona es: Europa");
                result = (float) (minutos * 3.5);
                System.out.println("El costo de la llamada es de: $" + result);
                break;
            }
            default: {
                System.out.println("La clave corresponde a una zona que desconozco");
            }
        }
    }
    
}
