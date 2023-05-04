package Ruiz_Gonzalez_Melchor;

import javax.swing.JOptionPane;

/**
 * date 13/03/2023
 * @author Melchor Ruiz G
 */
public class Menu {
    public static void main(String[] args) {
        
        // Preguntar el numero de vehiculos a registrasr
        int numVehicles = Integer.parseInt(JOptionPane.showInputDialog(
                "Bienvenido\n¿Cuantos vehiculos deseas registrar?"));
        // Crear el array donde se van a guardar los vehiculos
        Vehiculo vehicles[] = new Vehiculo[numVehicles];
        
        // Creacion de variables
        int option = 0, counter = 0;
        double precio = 0;
        String marca = null, modelo = null;
        
        // Ciclo while para ciclar el programa
        while(option != 4){
            
            // Mostrar menu principal
            option = Integer.parseInt(JOptionPane.showInputDialog("=== MENU PRINCIPAL =="
                    + "\n[1]Agregar un auto"
                    + "\n[2]Agregar una motocicleta"
                    + "\n[3]Mostrar Vehiculos"
                    + "\n[4]Salir"));
            
            // Agregar datos del vehiculo solo si se va agregar alguno
            if (option == 1 || option == 2){
                marca = JOptionPane.showInputDialog(
                        "¿Cual es la marca del vehiculo");
                modelo = JOptionPane.showInputDialog(
                        "¿Cual es el modelo del vehiculo");
                precio = Double.parseDouble(JOptionPane.showInputDialog(
                        "¿Cual es el precio del vehiculo"));
            }
            
            // Entrar a la opcion indicada por el usuario
            switch (option){
                // Agregar auto
                case 1 -> {
                    // Realizar try para que no se agregguen mas autos de los permiidos
                    try{
                        // Solicitar datos del auto
                        int numPuertas = Integer.parseInt(JOptionPane.showInputDialog(
                                "¿Cuantas puertas tiene el carro?"));
                        
                        // Crear el objeto carro dentro del array de vehicles
                        vehicles[counter] = new Carro(numPuertas, marca, modelo, precio);
                        
                        // Mostrar mensaje de registro exitoso
                        JOptionPane.showMessageDialog(null, 
                                "***Registro existoso***" + vehicles[counter].mostrarDatos());
                        
                        // Aumentar el contador
                        counter++;
                    } catch (ArrayIndexOutOfBoundsException e){
                        // Mensaje de error
                        JOptionPane.showMessageDialog(null, "Error 2: Carro no se pudo agregar\n" + e);
                    }
                }
                // Agregar motocicleta
                case 2 -> {
                    // Realizar try para que no se agregguen mas motos de las permiidos
                    try{
                        // Solicitar datos de la motocicleta
                        int cilindrada = Integer.parseInt(JOptionPane.showInputDialog(
                                "¿Cual es la cilindrada de la motocicleta?"));
                        
                        // Crear el objeto motocicleta dentro del array vehicles
                        vehicles[counter] = new Motocicleta(cilindrada, marca, modelo, precio);
                        
                        // Mostrar mensaje de registro exitoso
                        JOptionPane.showMessageDialog(null, 
                                "***Registro existoso***" + vehicles[counter].mostrarDatos());
                        
                        // Aumentar el contador
                        counter++;
                    } catch(ArrayIndexOutOfBoundsException e){
                        // Mensaje de error
                        JOptionPane.showMessageDialog(null, "Error 3: Motocicleta no se pudo agregar\n" + e);
                    }
                }
                // Mostrar informacion de vehiculos
                case 3 -> {
                    try{
                        // Crear cadena de texto donde guardar la informacion
                        String data = "";
                        // Ciclo for-each para obtener la informacion de cada vehiculo
                        for(Vehiculo vehicle : vehicles){
                            data += "-------------------" + vehicle.mostrarDatos() + "\n"; 
                        }
                        data += "-------------------";
                        // Mostrar la informacion
                        JOptionPane.showMessageDialog(null, data);
                    } catch (NullPointerException e){
                        // Mensaje de error
                        JOptionPane.showMessageDialog(null, "Error 4: Aun no han sido agregados todos los auto\n" + e);
                    }
                }
                // Mensaje de salida
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Finalizando Programa");
                }
                // Mensaje de erroo
                default -> {
                    JOptionPane.showMessageDialog(null, "Error 1: Opcion invalida");
                }
            }
        }
    }
}
