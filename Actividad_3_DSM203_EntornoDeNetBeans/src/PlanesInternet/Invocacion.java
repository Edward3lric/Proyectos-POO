/* Realiza un programa con el nombre "PlanesInternet" para una compañia de
 * internet, que cuenta con tres planes, el usuario tendra las siguientes
 * opciones:
 * "Basico $50"
 * "Medio $75"
 * "Completo $100"
 * El usuario ingresa el numero del plan y el programa le mostrara el nombre del
 * plan que eligio, su total + iva y el costo de su plan por año.
 */
package PlanesInternet;
/**
 * Fecha 24/01/2023
 * Ultima modificación: 24/01/2023
 * @author Melchor Ruiz Gonzalez
 */
public class Invocacion {
    public static void main(String[] args) {
        
        // Se crea instancia de la clase donde estan los metodos void,
        // para poder hacer uso de ellos
        Metodos metodos = new Metodos();
        
        // Invocar el metodo llamado EscribirPlanes
        metodos.EscribirPlanes();
        
        // Invocar el metodo llamado ElegirPlan
        metodos.ElegirPlan();
        
        // Invocar el metodo llamado CalcularCostos
        metodos.CalcularCostos();
        
        // Invocar el metodo llamado MostrarResultados
        metodos.MostrarResultados();
        
    }
}
