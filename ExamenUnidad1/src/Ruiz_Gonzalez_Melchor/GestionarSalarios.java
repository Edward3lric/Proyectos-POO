package Ruiz_Gonzalez_Melchor;
// Importar libreria JOptionPane
import javax.swing.JOptionPane;
public class GestionarSalarios {
    // Declaracion de variables globales
    int option;
    double gerente = 20000;
    double subGerente = 18000;
    double jefeInmediato = 12000;
    double ayudanteGeneral = 9000;
    
    // Metodo para mostral el submenu correspondiente a esta sección
    void Submenu(){
        // Ciclo do-while para que el usuario solo pueda elegir una opcion valida
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción: "
                    + "\n[1]Consultar"
                    + "\n[2]Modificar"
                    + "\n[3]Menu Principal"));
        } while (!(option == 1 || option == 2 || option == 3));
    }
    
    // Metodo para colsultar el salario de un empleado segun su puesto
    void Consultar(){
        // Preguntar el id del empleado
        int id = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el id del empleado?(1,2,3,4)"));
        // switch para decidir que usuario mostrar segun su id
        switch(id){
            case 1 -> {
                // Mostrar los datos solicitados por el problema
                JOptionPane.showMessageDialog(null, "Puesto: Gerente"
                        + "\nSalario Actual: " + gerente
                        + "\nRetención: " + (gerente * 0.125)
                        + "\nSalario menos retencion:" + (gerente - (gerente * 0.125)));
                break;
            }
            case 2 -> {
                // Mostrar los datos solicitados por el problema
                JOptionPane.showMessageDialog(null, "Puesto: Subgerente"
                        + "\nSalario Actual: " + subGerente
                        + "\nRetención: " + (subGerente * 0.125)
                        + "\nSalario menos retencion:" + (subGerente - (subGerente * 0.125)));
                break;
            }
            case 3 -> {
                // Mostrar los datos solicitados por el problema
                JOptionPane.showMessageDialog(null, "Puesto: Jefe Inmediato"
                        + "\nSalario Actual: " + jefeInmediato
                        + "\nRetención: " + (jefeInmediato * 0.125)
                        + "\nSalario menos retencion:" + (jefeInmediato - (jefeInmediato * 0.125)));
                break;
            }
            case 4 -> {
                // Mostrar los datos solicitados por el problema
                JOptionPane.showMessageDialog(null,"Puesto: Ayudante General"
                        + "\nSalario Actual: " + ayudanteGeneral
                        + "\nRetención: " + (ayudanteGeneral * 0.125)
                        + "\nSalario menos retencion:" + (ayudanteGeneral - (ayudanteGeneral * 0.125)));
                break;
            }
            default -> {
                // Mostrar un mensaje de error
                JOptionPane.showMessageDialog(null, "Empleado no encontrado");
            }
        }
    }
    
    // Metodo para modificar el salario de todos los empleados con el mismo puesto
    void Modificar(){
        // Preguntar el id del puesto a cambiar el sueldo
        int id = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el id del empleado?(1,2,3,4)"));
        // Preguntar de cuanto va ha ser el aumento del sueldo en porcentaje
        double aumento = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto quieres aumentar?(en porcentaje)"));
        
        // switch para decidir a que puesto cambiar el salario
        switch(id){
            case 1 -> {
                // Mostrar los datos solicitados por el problema
                JOptionPane.showMessageDialog(null, 
                        "Modificaciòn Exitosa" 
                        + "\nSalario sin aumento " + gerente
                        + "\nCantidad Aunmentada: " + (gerente * (aumento / 100))
                        + "\nSalario con aumento: " + (gerente + (gerente * (aumento / 100))));
                // Cambiar el salario en la variable global
                gerente = gerente + (gerente * (aumento / 100));
                break;
            }
            case 2 -> {
                // Mostrar los datos solicitados por el problema
                JOptionPane.showMessageDialog(null, 
                        "Modificaciòn Exitosa" 
                        + "\nSalario sin aumento " + subGerente
                        + "\nCantidad Aunmentada: " + (subGerente * (aumento / 100))
                        + "\nSalario con aumento: " + (subGerente + (subGerente * (aumento / 100))));
                // Cambiar el salario en la variable global
                subGerente = subGerente + (subGerente * (aumento / 100));
                break;
            }
            case 3 -> {
                // Mostrar los datos solicitados por el problema
                JOptionPane.showMessageDialog(null, 
                        "Modificaciòn Exitosa" 
                        + "\nSalario sin aumento " + jefeInmediato
                        + "\nCantidad Aunmentada: " + (jefeInmediato * (aumento / 100))
                        + "\nSalario con aumento: " + (jefeInmediato + (jefeInmediato * (aumento / 100))));
                // Cambiar el salario en la variable global
                jefeInmediato = jefeInmediato + (jefeInmediato * (aumento / 100));
                break;
            }
            case 4 -> {
                // Mostrar los datos solicitados por el problema
                JOptionPane.showMessageDialog(null, 
                        "Modificaciòn Exitosa" 
                        + "\nSalario sin aumento " + ayudanteGeneral
                        + "\nCantidad Aunmentada: " + (ayudanteGeneral * (aumento / 100))
                        + "\nSalario con aumento: " + (ayudanteGeneral + (ayudanteGeneral * (aumento / 100))));
                // Cambiar el salario en la variable global
                ayudanteGeneral = ayudanteGeneral + (ayudanteGeneral * (aumento / 100));
                break;
            }
            default -> {
                // Mostrar un mensaje de error
                JOptionPane.showMessageDialog(null, "Empleado no encontrado");
            }
        }
    }
}
