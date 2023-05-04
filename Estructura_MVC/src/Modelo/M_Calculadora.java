/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Mel
 */
public class M_Calculadora {
    private int a = 0;
    private int b = 0;
    public void mostrar(){
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer numero: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del segundo numero: "));
    }
    public void suma(){
        double suma = a + b;
        JOptionPane.showMessageDialog(null, a + "+" + b + "=" + suma);
    }
    public void resta(){
        double resta = a - b;
        JOptionPane.showMessageDialog(null, a + "-" + b + "=" + resta);
    }
    public void multiplicacion(){
        double multiplicacion = a * b;
        JOptionPane.showMessageDialog(null, a + "*" + b + "=" + multiplicacion);
    }
    public void division(){
        try{
            double division = a / b;
            JOptionPane.showMessageDialog(null, a + "/" + b + "=" + division);
        }catch (ArithmeticException a){
            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
        }
    }
    
    
}
