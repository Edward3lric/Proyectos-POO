/*
 * Nombre : Melchor Ruiz Gonzalez
 * Grupo : DSM102
 * Descripción : Este programa contiene tres programas
 */
package javaapplications;
import java.util.Scanner;
public class examen {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int programa;
        System.out.println("[1] para tablas de multiplicar");
        System.out.println("[2] para pedir un número hasta que sea negativo");
        System.out.println("[3] para pedir un número e indicar si es positivo o negativo hasta que sea 0");
        programa = read.nextInt();
        
        switch (programa){
            case 1:{
                int tabla;
        
                System.out.println("¿Cual tabla de multiplicar quieres?");
                tabla = read.nextInt();
        
                for (int i = 1; i <= 10; i++){
                System.out.println(tabla + " x " + i + " = " + (tabla * i));
                }
                break;
            }
            case 2:{
                int numIn;
                numIn = 0;
                
                while (numIn >= 0){
                    System.out.println("¿Puedes decire un número");
                    numIn = read.nextInt();
                }
                System.out.println("El número ingresado es nagativo");
                break;
            }
            case 3:{
                int num;
                
                do{
                    System.out.println("¿Puedes decirme un número");
                    num = read.nextInt();
                    if (num > 0){
                        System.out.println("El núemro es positivo");
                    }
                    if (num < 0){
                        System.out.println("El númeor es negativo");
                    }
                }
                while (num != 0);
                System.out.println("El número es 0");
                break;
            }
            default:{
                System.out.println("Este programa aún no esta disponible");
            }
        }  
    }
}