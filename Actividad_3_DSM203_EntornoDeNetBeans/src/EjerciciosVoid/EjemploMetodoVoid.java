
/* Programa realizado para mostrar el ejemplo del uso del metodo void 
 * hecho en Java */

package EjerciciosVoid;

/**
 * Fecha 23/01/2023
 * Ultima modificación: 23/01/2023
 * @author Melchor Ruiz Gonzalez
 */

// Importar la libreria JOptionPane
import javax.swing.JOptionPane;

public class EjemploMetodoVoid {
    
    // Se declaan variables tipo String
    String entrada;
    String saludo;
    
    // Metodo creado para recibir datos desde el teclado
    void Entrada(){
        entrada = JOptionPane.showInputDialog("Escribe tu nombre");
    }
    
    // Metodo creado para el proceso de los datos
    void Proceso(){
        saludo = "Hola: " + entrada;
    }
    
    // Metodo creado para mostrar los resultados de los datos
    void Salida(String mensaje){
        JOptionPane.showMessageDialog(null, saludo + mensaje);
    }
}
