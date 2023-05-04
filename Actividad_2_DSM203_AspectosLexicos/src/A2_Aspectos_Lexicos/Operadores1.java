/* Declara 2 variables numéricas (con el valor que desees), he indica cual es
 * mayor de los dos. Si son iguales indicarlo también. Ves cambiando los
 * valores para comprobar que funciona. */

package A2_Aspectos_Lexicos;
/**
 * Fecha 18/01/2023
 * Ultima modificación: 18/01/2023
 * @author Melchor Ruiz Gonzalez
 */

public class Operadores1 {
    public static void main(String[] args) {
        
        // Declarar dos variables numericas
        double num1 = 45;
        double num2 = 89;
        
        // Detectar si el num1 es mayor que num2
        if (num1 > num2) {
            // Escribir el numero mayor
            System.out.println("El numero mayor es num1 = : " + num1);
        } else {
            // Detectar si el num2 es mayor que num1
            if (num1 < num2) {
                // Escribir el numero mayor
                System.out.println("El número mayor es: num2 = " + num2);
            } else {
                // Escribir los numeros son iguales
                System.out.println("Ambos numeros son iguales");
            }
        }
        
    }
}
