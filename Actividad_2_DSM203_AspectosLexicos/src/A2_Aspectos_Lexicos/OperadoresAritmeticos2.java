/* Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
 * Si no lo es, también debemos indicarlo. */

package A2_Aspectos_Lexicos;
/**
 * Fecha 18/01/2023
 * Ultima modificación: 18/01/2023
 * @author Melchor Ruiz Gonzalez
 */

// Importar la libreria scanner para poder leer datos
import java.util.Scanner;
public class OperadoresAritmeticos2 {
    public static void main(String[] args) {
        
        // Inciar el scanner 
        Scanner read = new Scanner (System.in);
        
        // Crear la variable para almacenar un numero
        int num1;
        
        // Preguntar un numero
        System.out.println("¿Puedes decirme un numero?");
        
        // Leer un numero entero por consola
        num1 = read.nextInt();
        
        // Revisar si el numero es divisible entre dos
        if ((num1 % 2) == 0){
            // Escribir si el numero es divisible entre dos
            System.out.println("El numero: " + num1 + " es divisible entre 2");
        } else {
            // Escribir si el numero no es divisible entre dos
            System.out.println("El numero: " + num1 + " no es divisible entre 2");
        }
        
    }
}
