/* En una nueva clase modifica la aplicación anterior, para que nos pida 
 * el nombre que queremos introducir (recuerda usar JOptionPane). */

package A2_Aspectos_Lexicos;
/**
 * Fecha 18/01/2023
 * Ultima modificación: 18/01/2023
 * @author Melchor Ruiz Gonzalez
 */

// Importar la libreria scanner para leer datos por consola
import java.util.Scanner;

public class Cadena2 {
    public static void main(String[] args) {
        
        // Inicializar el scanner para leer datos por consola
        Scanner read = new Scanner (System.in);
        
        // Declarar la variable name de tipo string que contiene el nombre
        String name;
        
        // Preguntar el nombre del usuario
        System.out.println("Hola, ¿como te llamas?");
        
        // Leer el nombre del usuario y guardarlo en la variable name
        name = read.nextLine();
        
        // Saludar por pantalla
        System.out.println("Bienvenido " + name);
    }
}
