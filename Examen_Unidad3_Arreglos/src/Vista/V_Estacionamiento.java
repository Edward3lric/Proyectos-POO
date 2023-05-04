package Vista;
// Importamos Clase C_Estacionamiento del package controlador
import Controlador.C_Estacionamieno;
import javax.swing.JOptionPane;
/**
 * date 14/04/2023
 * @author Melchor Ruiz Gonzalez
 */
public class V_Estacionamiento {
    public static void main(String[] args) {
        // Se crea una instancia a la clase C_Estacionamiento
        C_Estacionamieno con = new C_Estacionamieno();
        // Declara variable para salir del ciclo menu
        int salir = 0;
        // palabra reservado do para declarar el cliclo do-while
        do{
            byte menu = Byte.parseByte(JOptionPane.showInputDialog("****Estacionamiento Publico"
                    + "\n1. Ingresar Auto"
                    + "\n2. Retirar Auto"
                    + "\n3. Listar Autos"
                    + "\n4. Salir(1.Salir, 0.Continuar)"));
            switch (menu) {
                case 1 -> {
                    // Creamos Submenu para definir el tipo de Vehiculo
                    int tipoVehiculo = Byte.parseByte(JOptionPane.showInputDialog("***Tipo Vehiculo***"
                            + "\n1. Motocicleta"
                            + "\n2. Carro o Camioneta"));
                    // Solicitamos la matricula del vehiculo
                    String matricula = JOptionPane.showInputDialog("Ingrese la matricula del Vehiculo");
                    // mandamos llamar el metodo definirTarifa,, madamos parametros tipoVehiculos y matricula
                    con.definirTarifa(tipoVehiculo, matricula);
                    break;
                }
                case 2 -> {
                    // Mandamos llamar meodo retirar
                    con.retirar();
                    break;
                }
                case 3 -> {
                    // Mandamos llamr meodo mostrar
                    con.mostrar();
                    break;
                }
                case 4 -> {
                    // Cambiamos llamar metodo mostrar
                    salir = 1;
                    // Mensaje para cerrar programa
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    break;
                }
                default -> {
                    // Mensaje si el usuario ingresa una opcion no valida
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
                }
            }
            // El programa se ejecuto mientras la variable salir se aigual = 0
        } while(salir == 0);
    }
}
