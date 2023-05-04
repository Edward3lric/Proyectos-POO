package While;

import javax.swing.JOptionPane;

/**
 * date 27/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class Ejemplo_2 {
    public static void main(String[] args) {
        
        // Declara variables
        int input = -1;
        // Asignar un numero aleatorio entre el 0 y el 10
        double numAleatorio = Math.floor(Math.random()*(10-0-1)+0);
        System.out.println(numAleatorio);
        
        // Ciclo while
        while(input != numAleatorio){
            // Preguntar por el numero a adivinar
            input = Integer.parseInt(JOptionPane.showInputDialog("Adivina un numero entre el 0 y el 10"));
        }
        
        // Mensaje de felicitacion
        JOptionPane.showMessageDialog(null, "Felicidades");

    }
}
