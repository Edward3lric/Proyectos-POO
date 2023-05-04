package controller;

import javax.swing.JOptionPane;
import model.Modelo;
import view.Vista;

/**
 *
 * @author h4lof
 */
public class Controlador {
    private Modelo model;
    private Vista view;

    public Controlador(Modelo model, Vista view) {
        this.model = model;
        this.view = view;
    }
    
    public void sumar(){
        String num1String = view.getNum1();
        String num2String = view.getNum2();
        try{
            int num1 = Integer.parseInt(num1String);
            int num2 = Integer.parseInt(num2String);
            model.setNum1(num1);
            model.setNum2(num2);
            int resultado = model.sumar();
            view.mostrarMensaje("El resultado de la suma es " + resultado);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
    }
}
