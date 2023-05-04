package PagoBus;
/**
 * date 22/02/2023
 * @author Melchor Ruiz
 */
import javax.swing.JOptionPane;
public class PruebaPagoBus {
    public static void main(String[] args) {
        
        // Crear variables
        double saldo;
        double TARIFA = -5;
  
        // Crae instancias
        PagoBus miTarjeta = new PagoBus("Melchor", "Ruiz", 
                1);
        
        // Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido " + 
                miTarjeta.getNombre() + " " + miTarjeta.getApellido());
        
        do {
            // Crear menu
            String option = JOptionPane.showInputDialog(
                    "Menu Principal\n[1] Depositar\n[2] Pagar");
            
            switch (option) {
                case "1" ->{
                    // Ejecutar el metodo depositar
                    miTarjeta.depositar();
                    break;
                }
                case "2" ->{
                    // Ejecutar el metodo pagar
                    miTarjeta.pagar(TARIFA);
                    break;
                }
                default ->{
                    // Mensaje de error en caso de ingresar una opcion incorrecta
                    JOptionPane.showMessageDialog(null, 
                            "Error 1: Opción incorrecta");
                    break;
                }
            }
            // obtener la variable saldo con el metodo get
            saldo = miTarjeta.getSaldo();
        }
        
        // Comprobar el saldo para seguir repitiendo el programa
        while(saldo > 0);
        
        // Mensaje de salida
        JOptionPane.showMessageDialog(null, 
                "Te has quedado sin saldo.\nFinalizando Programa");
    }
}
