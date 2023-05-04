package view;

import javax.swing.JOptionPane;

/**
 *
 * @author h4lof
 */
public class Vista {
    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public String getNum1(){
        return JOptionPane.showInputDialog("Ingresa el primer numero");
    }
    public String getNum2(){
        return JOptionPane.showInputDialog("Ingresa el segundo numero");
    }
    
}
