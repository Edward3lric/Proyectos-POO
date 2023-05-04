/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruiz_Gonzalez_Melchor;

import javax.swing.JOptionPane;

/**
 * date 15/02/2023
 * @author Melchor Ruiz González
 */
public class Salarios {
    // Cramos variables globales
    double salarioSinImpuestos;
    double impuestos;
    double salarioConImpuestos;
    String puesto;
    // Crear metodo para consultar salarios
    public void consultarSalario(){
        int id_puesto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la clave de su puesto"));
        
        switch (id_puesto){
            case 1 ->{
                // Datos del puesto 1
                salarioSinImpuestos = 20000;
                puesto = "Gerente";
                break;
            }
            case 2 ->{
                // Datos del puesto 2
                salarioSinImpuestos = 18000;
                puesto = "Subgerente";
                break;
            }
            case 3 ->{
                // Datos del puesto 3
                salarioSinImpuestos = 12000;
                puesto = "Jefe Inmediato";
                break;
            }
            case 4 ->{
                // Datos del puesto 4
                salarioSinImpuestos = 9000;
                puesto = "Ayudante General";
                break;
            }
            default ->{
                // Mostrar mensaje de error en caso de ingresar opcion no valida
                JOptionPane.showMessageDialog(null, "Opción Incorrecta");
                break;
            }
        }
        
        impuestos = salarioSinImpuestos * 0.125;
        salarioConImpuestos = salarioSinImpuestos - impuestos;
        JOptionPane.showMessageDialog(null, "Su puesto es: " + puesto
            + "\nSu salario actual es de: $" + salarioSinImpuestos
            + "\nMenos impuestos: $" + impuestos
            + "\nSu total es: $" + salarioConImpuestos);
    }
    public void ModificarSalario(){
        consultarSalario();
        double aumentox100 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el porcentaje a aumentar"));
        double aumento = (salarioSinImpuestos * aumentox100) / 100;
        double total = salarioSinImpuestos + aumento;
        JOptionPane.showMessageDialog(null, "Modificación exitosa\nSalario sin aumento: $"
                + salarioSinImpuestos + "\nSu aumento del " + aumentox100 
                + "% es de: $" + aumento + "\nSu total es de. $" + total);
    }
}
