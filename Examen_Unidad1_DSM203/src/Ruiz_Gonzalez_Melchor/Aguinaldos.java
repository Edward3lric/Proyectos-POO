/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruiz_Gonzalez_Melchor;

import javax.swing.JOptionPane;
/**
 * date 17/02/2023
 * @author Melchor Ruiz González
 */
public class Aguinaldos {
    
    public void AsignarDias(int opcion){
        switch (opcion){
            case 1 -> {
                // Asignar 15 dias
                CalculaAguinaldo(15);
                break;
            }
            case 2 -> {
                // Asignar 7 dias
                CalculaAguinaldo(7);
                break;
            }
            case 3 -> {
                // Asignar 3 dias
                CalculaAguinaldo(3);
                break;
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Error 002: Opcion incorrecta");
                break;
            }
        }
    }
    public void CalculaAguinaldo(int diasAguinaldo){
        
        // Declaramos variables a utilizar
        String nombre = "";
        String puesto = "";
        double aguinaldoSinImpuestos;
        double impuestos;
        double total;
        double salario = 0;
        double salarioPorDia;
        
        
        int id_empleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su calve de empleado"));
        switch (id_empleado) {
            case 1 ->{
                // Datos de patricia
                nombre = "Patricia";
                puesto = "Gerente";
                salario = 20000;
                break;
            }
            case 2 ->{
                // Datos de Carlos
                nombre = "Carlos";
                puesto = "Subgerente";
                salario = 18000;
                break;
            }
            case 3 ->{
                // Datos de Alberto
                nombre = "Alberto";
                puesto = "Jefe Inmediato";
                salario = 12000;
                break;
            }
            case 4 ->{
                // Datos de Jose Juan
                nombre = "Jose Juan";
                puesto = "Ayudante General";
                salario = 9000;
                break;
            }
            default ->{
                JOptionPane.showMessageDialog(null, "Error 004: Opción Incorrecta");
                break;
            }
        }
    salarioPorDia = salario / 30;
    aguinaldoSinImpuestos = salarioPorDia * diasAguinaldo;
    impuestos = aguinaldoSinImpuestos * 0.125;
    total = aguinaldoSinImpuestos - impuestos;
    
    JOptionPane.showMessageDialog(null, "Su nombre es: "
            + nombre + "\nSu puesto es: " + puesto + "\nDias de aguinaldo"
            + diasAguinaldo + "\nSu aguinaldo es de: $" + aguinaldoSinImpuestos
            + "\nMenos impuestos: $" + impuestos + "\nSu total es de: $" + total);
    }
}
