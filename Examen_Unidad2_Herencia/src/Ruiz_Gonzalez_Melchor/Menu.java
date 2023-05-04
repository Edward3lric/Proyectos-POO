package Ruiz_Gonzalez_Melchor;

import javax.swing.JOptionPane;

/**
 * 10/03/2023
 * @author Melchor Ruiz González
 */
public class Menu {
    public static void main(String[] args) {
        
        // Atributos
        boolean salir = false;
        int opcion;
        String marca;
        String modelo;
        double precio;
        int numPuertas;
        int cilindraje;
        
        while(salir == false){
            
            // Resetear valores
            marca = null;
            modelo = null;
            precio = 0;
            numPuertas = 0;
            cilindraje = 0;
            
            // Menu pricipal
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu pricipal"
                    + "\n[1] Registrar Auto"
                    + "\n[2] Registrar Motocicleta"
                    + "\n[3] Salir"));
            
            // Introducir datos del vehiculo
            if (opcion == 1 || opcion == 2){
                marca = JOptionPane.showInputDialog("¿Cual es la marca del vehiculo?");
                modelo = JOptionPane.showInputDialog("¿Cual es el modelo del vehiculo?");
                precio = Double.parseDouble(JOptionPane.showInputDialog("¿Cual es el precio del vehiculo?"));
            }

            // Redirigir a Carro o Motocicleta
            switch (opcion){
                case 1 ->  {
                    // Introducir datos del carro
                    numPuertas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas puertas tiene el vehiculo?"));
                    
                    // Instacia con valores introducidos
                    Carro carro = new Carro(numPuertas, marca, modelo, precio);
                    
                    // Mostrar datos del carro
                    carro.mostrarDatos();
                    
                    break;
                }
                case 2 ->  {
                    // Introducir datos de la motocicleta
                    cilindraje = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el cilindraje que tiene la motocicleta en cm3?"));
                    
                    // Instancia con valores introducidos
                    Motocicleta motocicleta = new Motocicleta(cilindraje, marca, modelo, precio);
                    
                    // Mostrar datos de la motocicleta
                    motocicleta.mostrarDatos();
                    
                    break;
                }
                case 3 ->  {
                    // Mensaje salir
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    
                    // Marcar la salida
                    salir = true;
                    
                    break;
                }
                default ->  {
                    // Mensaje de error
                    JOptionPane.showMessageDialog(null, "Error 1: Opcion incorrecta");
                    
                    break;
                }
            }
        }
    }
}
