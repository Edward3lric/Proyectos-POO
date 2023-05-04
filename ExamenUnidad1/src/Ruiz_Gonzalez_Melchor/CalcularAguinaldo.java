package Ruiz_Gonzalez_Melchor;
// Importar libreria JOptionPane
import javax.swing.JOptionPane;
public class CalcularAguinaldo {
    // Declaracion de variables globales
    String nombre;
    String puesto;
    double sueldo;
    int diasAguinaldo;
    
    // Declaracion de constantes globales
    double PATRICIA = 20000;
    double CARLOS = 18000;
    double ALBERTO = 12000;
    double JOSEJUAN = 9000;
    
    // Metodo para determinar el empleado y sus dias de aguinaldo
    void Aguinaldo(){
        // Preguntar el id del empleado para calcular su aguinaldo
        int id = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el id del empleado?(1,2,3,4)"));
        // Submenu de cuatrimestres
        int cuatrimestre = Integer.parseInt(JOptionPane.showInputDialog("¿En cual cuatrimestre ingreso?"
                + "\n[1]Enero-Abril"
                + "\n[1]Mayo-Agosto"
                + "\n[1]Septiembre-Diciembre"));
        
        // Switch para definir los dias de aguinaldo segun el cuatrimestre
        switch(cuatrimestre){
            case 1 -> {
                diasAguinaldo = 15;
                break;
            }
            case 2 -> {
                diasAguinaldo = 7;
                break;
            }
            case 3 -> {
                diasAguinaldo = 3;
                break;
            }
        }
        // Switch para asiganr el nombre, puesto y sueldo usado para imprimir lo que nos pide el problema 
        switch(id){
            case 1 -> {
                nombre = "Patricia";
                puesto = "Gerente";
                sueldo = PATRICIA;
                break;
            }
            case 2 -> {
                nombre = "Carlos";
                puesto = "Subgerente";
                sueldo = CARLOS;
                break;
            }
            case 3 -> {
                nombre = "Alberto";
                puesto = "Jefe Inmediato";
                sueldo = ALBERTO;
                break;
            }
            case 4 -> {
                nombre = "Jose Juan";
                puesto = "Ayudante General";
                sueldo = JOSEJUAN;
                break;
            }
        }
    }
    // Metodo para imprimir todo lo que nos pide la problematica
    void Imprimir(){
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre
                        + "\nPuesto: " + puesto
                        + "\nDias de aguinaldo: " + diasAguinaldo
                        + "\nAguinaldo sin retención: " + ((sueldo / 30)*diasAguinaldo)
                        + "\nRetención: " + (((sueldo / 30)*diasAguinaldo)*0.125)
                        + "\nAguinaldo con retención: " + (((sueldo / 30)*diasAguinaldo)*0.875));
    }
}
