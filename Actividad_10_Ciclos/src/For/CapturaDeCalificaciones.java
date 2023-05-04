package For;

import javax.swing.JOptionPane;

/**
 * date 27/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class CapturaDeCalificaciones {
    public static void main(String[] args) {
        
        // Declarar variables
        int entrada;
        double califTotal = 0;
        double promedio;
        String estado;
        
        // Solicitar nombre del alumno
        String nombre = JOptionPane.showInputDialog("¿Cual es el nombre del estudiante?");
        
        // Ciclo for para pedir la calificacion de cada parcial
        for(int i=1; i <= 3; i++){
            
            // Ciclo do-while para repetir hasta que si introdusca una opcion valida
            do{
                // Pedir la calificacion de ese parcial
                entrada = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es la calificacion del parcial " + i + "?"));
                
                // Ver si la calificacion introducida es correcta
                if (entrada < 0 || entrada > 10){
                    // Mensaje de error
                    JOptionPane.showMessageDialog(null, "Error 1: Calificación incorrecta");
                } else {
                    // Sumar calificiacion al la calificacion total
                    califTotal += entrada;
                } 
                
            } while (entrada < 0 || entrada > 10); 
            
        }
        
        // Calcular promedio
        promedio = califTotal / 3;
        
        // Calcular si un alumno esta aprobado o reprobado
        if (promedio >= 8){
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
        
        // Imprimir el resultado
        JOptionPane.showMessageDialog(null, "Resultados del alumno: " + nombre
                + "\nPromedio = " + promedio
                + "\nEstado = " + estado);
    }
}
