package Exceptions;

public class ArithmeticExceptionEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        
        try {
            int c = a / b; // Intentar dividir 10 entre 0
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
    }
}
