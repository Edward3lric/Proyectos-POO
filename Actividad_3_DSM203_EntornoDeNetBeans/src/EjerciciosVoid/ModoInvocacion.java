


package EjerciciosVoid;

/**
 * Fecha 23/01/2023
 * Ultima modificación: 23/01/2023
 * @author Melchor Ruiz Gonzalez
 */
public class ModoInvocacion {
    public static void main(String[] args) {
        
        // Se crea instancia de la clase donde estan los metodos void,
        // para poder hacer uso de ellos
        EjemploMetodoVoid EMV = new EjemploMetodoVoid();
        
        // Se manda llamar la Entrada donde se capturan los datos
        EMV.Entrada();
        
        // Se manda llamar el metodo void con el nombre Proceso
        EMV.Proceso();
        
        // Se manda llamar el metodo void con el nombre Salida
        EMV.Salida(" como estas?");
    }
}
