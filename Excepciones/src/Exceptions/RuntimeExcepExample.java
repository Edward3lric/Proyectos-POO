package Exceptions;

import java.util.Scanner;

public class RuntimeExcepExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, resultado;
        
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();
        
        // Verificar que el segundo número no sea cero
        if (num2 == 0) {
            throw new RuntimeException("El segundo número no puede ser cero.");
        }
        
        resultado = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + resultado);
    }
}
