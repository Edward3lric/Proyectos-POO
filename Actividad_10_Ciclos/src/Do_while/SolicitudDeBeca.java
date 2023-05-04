package Do_while;

import javax.swing.JOptionPane;

/**
 * date 27/03/2023
 * @author Melchor Ruiz Gonzlez
 */
public class SolicitudDeBeca {
    public static void main(String[] args) {
        // Declarar variables
        String nombre;
        double calificacion;
        double ingresoMensual;
        
        // Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de becas");
        
        // Solicitar normbre
        nombre = JOptionPane.showInputDialog("Cual es su nombre?");
        
        // Solicitar calificacion
        do {
            calificacion = Double.parseDouble(JOptionPane.showInputDialog("Cual es su calificacion?"));
        } while (calificacion < 0 || calificacion > 10);
        
        // Solicitar ingreso mensual
        ingresoMensual = Double.parseDouble(JOptionPane.showInputDialog("Cual es su ingreso mensual?"));
        
        // Determinar si dar la beca o no
        if(calificacion >= 9 && ingresoMensual < 10000){
            JOptionPane.showMessageDialog(null, "Beca aprovada para " + nombre);
        } else {
            JOptionPane.showMessageDialog(null, "Beca rechazada para " + nombre);
        }
        
    }
}
