/*
 * Nombre : Melchor Ruiz Gonzalez
 * Grupo : DSM102
 * Descripción : Este programa calcula el área de un cuadrado o un triangulo
 */
package javaapplications;
import java.util.Scanner;
public class areasCuadradoTriangulo {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in); 
        float num1, num2, result;
        System.out.println("Bienvenido");
        
        System.out.println("Puedes introducir la altura de una figura");
        num1 = read.nextFloat();
        System.out.println("Puedes introducir la base de la figura");
        num2 = read.nextFloat();
        
        if (num1 == num2) {
            result = num1 * num2;
            System.out.println("El área del cuadrado es: " + result);
        }
        else {
            result = (num1 * num2) / 2;
            System.out.println("El área del triángulo es: " + result);
        }
    }
    
}
