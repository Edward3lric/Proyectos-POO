package Exceptions;

public class NullPointerExceptionEx {
    public static void main(String[] args) {
        String str = null;
        
        try {
            // Intentar obtener la longitud de una cadena nula
            int length = str.length(); 
            System.out.println(length);
        } catch (NullPointerException e) {
            System.out.println("Error: La cadena es nula.");
        }
    }
}
