package Ruiz_Gonzalez_Melchor;
// Importar las librerias necesarias
import javax.swing.JOptionPane;
/**
 * Date: 12/12/1212
 * @author Melchor Ruiz Gonzalez
 */
public class InvocarMetodos {
    // Metodo main
    public static void main(String[] args) {
        
        // Declaración de variable
        int option;
        
        // Crear instancias para mandar llamar a los metodos
        GestionarSalarios salario = new GestionarSalarios();
        CalcularAguinaldo aguinaldo = new CalcularAguinaldo();
        
        OUTER:
        // Utilizar un ciclo para que el programa se repita infinitamente hasta que el usuario decida salir
        while (true) {
            // Crear el menu principal
            option = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción: "
                    + "\n[1]Gestionar Salarios"
                    + "\n[2]Calcular Aguinaldo"
                    + "\n[3]Salir"));
            
            // Switch para entrar al submenu correspondiente
            switch (option) {
                case 1 -> {
                    // Ejecutar el metodo llamado submenu dentro de la instancia salario
                    salario.Submenu();
                    // Obtener el valor de option para decidir que opcion se ejecuta
                    option = salario.option;
                    if (option == 1){
                        // Ejecutar el metodo llamado consultar dentro de la instancia salario
                        salario.Consultar();
                    } else if (option == 2){
                        // Ejecutar el metodo llamado modificar dentro de la instancia salario
                        salario.Modificar();
                    }
                    break;
                }
                case 2 -> {
                    // Ejecutar el metodo llamado aguinaldo dentro de la instancia aguinaldo
                    aguinaldo.Aguinaldo();
                    // Ejecutar el metodo llamado imprimir dentro de la instancia aguinaldo
                    aguinaldo.Imprimir();
                    break;
                }    
                case 3 -> {
                    // Romper el cilo while para salir del programs
                    break OUTER;
                }
            }
        }
    }
}
