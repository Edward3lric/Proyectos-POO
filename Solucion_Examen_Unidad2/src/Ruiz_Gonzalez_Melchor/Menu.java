package Ruiz_Gonzalez_Melchor;

import javax.swing.JOptionPane;

/**
 * date 13/03/2023
 * @author h4lof
 */
public class Menu {
    public static void main(String[] args) {
        
        // Declaramos vairables
        byte opcionMenu;
        String marca;
        String modelo;
        double precio;
        
        
        // 
        do {
            opcionMenu = Byte.parseByte(JOptionPane.showInputDialog("""
                                                                    ***Captura los datos del vehiculo***
                                                                    1.Registrar Aunto
                                                                    2.Registrar Motocicleta
                                                                    3.Salir"""));
            
            if (opcionMenu == 3){
                JOptionPane.showMessageDialog(null, "Hasta luego");
                break;
            }
             
            marca = JOptionPane.showInputDialog("Ingresa la Marca del Vehiculo");
            modelo = JOptionPane.showInputDialog("Ingrese el Modelo del Vehiculo");
            precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el Precio del Vehiculo"));

            switch (opcionMenu){
                case 1 -> {
                    // Solicitar el numero de puertas
                    int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de puertas del carro"));
                    Carro car = new Carro(numPuertas, marca, modelo, precio);
                    car.mostrarDatos();
                    break;
                }
                case 2 -> {
                    // Solicitar la cilindrada
                    int cilindrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cilindrada de la motocicleta"));
                    Motocicleta moto = new Motocicleta(cilindrada, marca, modelo, precio);
                    moto.mostrarDatos();
                    break;
                }
                default -> {
                    // Enviar mensaje de opcion incorrecta
                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
                    break;
                }
            }
        } while (opcionMenu != 3);
    }
}
