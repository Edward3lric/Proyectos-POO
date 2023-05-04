/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.M_Calculadora;

/**
 *
 * @author h4lof
 */
public class C_Calculadora {
    M_Calculadora m_cal = new M_Calculadora();
    public void mostrar(){
        m_cal.mostrar();
    }
    public void hacer_suma(){
        m_cal.suma();
    }
    public void hacer_resta(){
        m_cal.resta();
    }
    public void hacer_multiplicacion(){
        m_cal.multiplicacion();
    }
    public void hacer_division(){
        m_cal.division();
    }
}
