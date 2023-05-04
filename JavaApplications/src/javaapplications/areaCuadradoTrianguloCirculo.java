/*
 * Nombre : Melchor Ruiz Gonzalez
 * Grupo : DSM102
 * Descripción : Este programa calcula el área de un cuadrado, un triángulo o un círculo
 */
package javaapplications;
import java.util.Scanner;
public class areaCuadradoTrianguloCirculo {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int eleccion;
        double num1, num2, result;
        double pi = 3.141592653589793238462643383;
        
        System.out.println("¿De cual figura quieres calcular su área?");
        System.out.println("[1] cuadrado, [2] triángulo, [3] círculo");
        eleccion = read.nextInt();
        
        switch (eleccion) {
            case 1: {
                System.out.println("Seleccionaste un cuadrado");
                System.out.println("¿Cuál es la medida de uno de los lados?");
                num1 = read.nextDouble();
                result = num1 * num1;
                System.out.println("El área de la figura es: " + result);
                break;
            }
            case 2: {
                System.out.println("Seleccionaste un triángulo");
                System.out.println("¿Cuál es la medida de la base?");
                num1 = read.nextDouble();
                System.out.println("¿Cuál es la medida de la altura?");
                num2 = read.nextDouble();
                result = (num1 * num2) / 2;
                System.out.println("El área de la figura es: " + result);
                break;
            }
            case 3: {
                System.out.println("Seleccionaste un círculo");
                System.out.println("¿Cuál es la medida del radio?");
                num1 = read.nextDouble();
                result = (pi * (num1 * num1));
                System.out.println("El área de la figura es: " + result);
                break;
            }
            default: {
                System.out.println("No seleccionaste ninguna figura");
            }
        }
    }
    
}
