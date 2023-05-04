package For;

import javax.swing.JOptionPane;

/**
 * date: 27/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        
        // Declara variables
        String resultado = "";
        
        // Solicitar el numero de tabla
        int option = Integer.parseInt(JOptionPane.showInputDialog("Número de tabla a general"));
        
        // Ciclo for
        for(int i = 1; i <= 10; i++){
            // Calcular la multiplicacion
            String valor = option + " x " + i + " = " + (option * i) + "\n";
            // Sumar el resultado
            resultado += valor;
        }
        
        // Imprimir resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}
