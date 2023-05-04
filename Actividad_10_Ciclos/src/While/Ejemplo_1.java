package While;

import javax.swing.JOptionPane;

/**
 * date 27/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class Ejemplo_1 {
    public static void main(String[] args) {
        
        // Declarar variable para recibir el valor
        double input = 0;

        // Ciclo while que se repretira hasta que el numero introducido sea mayor a 500
        while(input <= 500){
            // Solicitar un numero
            input = Double.parseDouble(JOptionPane.showInputDialog("Dime un numero"));
        }
    }
}
