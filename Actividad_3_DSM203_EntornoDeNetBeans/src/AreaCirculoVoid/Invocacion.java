
/* Realiza un programa con el nombre AreaCirculoVoid para calcular el area del
 * circulo empleando al menos 3 metodos void. Utiliza Scanner para ingresar los
 * datos */

package AreaCirculoVoid;
/**
 * Fecha 23/01/2023
 * Ultima modificación: 23/01/2023
 * @author Melchor Ruiz Gonzalez
 */

public class Invocacion {
    public static void main(String[] args) {
        
        // Se crea instancia de la clase donde estan los metodos void,
        // para poder hacer uso de ellos
        MetodoVoid MV = new MetodoVoid();
        
        // Invocar el metodo llamado leer
        MV.Leer();
        
        // Invocar el metodo llamado CalcularArea
        MV.CalcularArea();
       
        // Invocar el metodo llamado Escribir
        MV.Escribir();
    }
}
