/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruiz_Gonzalez_Melchor;
/**
 * date 15/02/2023
 * @author Melchor Ruiz González
 */
import javax.swing.JOptionPane;
public class Menus {
    // Creamos metodo de entrada
    public static void main(String[] args) {
        // Variables para guardar las opciones que ingresara el usuario
        int menuPrincipal;
        int menuSalarios;
        int menuAguinaldos;
        
        // Crear instancias de metodos
        Salarios sal = new Salarios();
        Aguinaldos ag = new Aguinaldos();
        
        // Mostramos menu al usuario
        menuPrincipal = Integer.parseInt(JOptionPane.showInputDialog("1. Gestionar Salario\n2. Calcular Aguinaldo"));
        
        switch (menuPrincipal){
            case 1 -> {
                // Menu Salarios
                menuSalarios = Integer.parseInt(JOptionPane.showInputDialog("1. Consultar\n2. Modificar"));
                switch (menuSalarios){
                    case 1 -> {
                        // Mando llamar metodo Consultar
                        sal.consultarSalario();
                        break;
                    }
                    case 2 -> {
                        // Mando llamar metodo Modificar
                        sal.ModificarSalario();
                        break;
                    }
                    default -> {
                        // Mostrar mensaje de error en caso de ingresar opcion no valida
                        JOptionPane.showMessageDialog(null, "Error 003: Opción Incorrecta");
                        break;
                    }
                }
                break;
            }
            case 2 -> {
                // Menu Aguinaldos
                menuAguinaldos = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción"
                        + "\n 1. Enero-Abril"
                        + "\n 2. Mayo-Agosto"
                        + "\n 3.Septiembre-Diciembre"));
                // Mandar llamar metodo Asigna dias de Aguinaldo
                ag.AsignarDias(menuAguinaldos);
                
                break;
            }
            default -> {
                // Mostrar mensaje de error en caso de ingresar opcion no valida
                JOptionPane.showMessageDialog(null, "Error 001: Opción Incorrecta");
                break;
            }
        }
    }
}
