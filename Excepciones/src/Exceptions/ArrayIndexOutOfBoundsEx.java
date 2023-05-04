package Exceptions;

public class ArrayIndexOutOfBoundsEx {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        
        try {
            // Intentar acceder al elemento con índice 5, que está fuera de los límites del array
            System.out.println(numeros[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del array.");
        }
    }
}
