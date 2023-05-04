/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.C_Calculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author h4lof
 */
public class V_Calculadora {
    public static void main(String[] args) {
        C_Calculadora cal = new C_Calculadora();
        String[] opciones = {"suma", "resta", "multiplicacion", "division", "salir"};
        int x = 0;
        cal.mostrar();
        do{
            x = JOptionPane.showOptionDialog(null, 
                    "Presiona la opcion que quieres utilizar", 
                    "calculadora", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.PLAIN_MESSAGE, 
                    null, 
                    opciones, opciones[0]);
            switch(x){
                case 0:
                    cal.hacer_suma();
                    break;
                case 1:
                    cal.hacer_resta();
                    break;
                case 2:
                    cal.hacer_multiplicacion();
                    break;
                case 3:
                    cal.hacer_division();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Cerrando Programa");
                    break;
            }
        }while(x < 4);
    }
}
