package AdquisicionDeTarjeta;

import javax.swing.JOptionPane;
/**
 * date: 17/03/2023
 * @author Melchor Ruiz Gonzalez
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        // Atributos
        int folio = 0;
        String option = "0";
        
        // Ciclar la aplicacion
        while (Integer.parseInt(option) != 4){
            
            // Mostrar menu principal
            option = JOptionPane.showInputDialog("=== Tarjetas Disponibles ==="
                + "\n[1] General"
                + "\n[2] Estudiante"
                + "\n[3] Adultos Mayores"
                + "\n[4] Salir");
            
            // Entrar a los diferentes submenus
            switch (option){
                // Tarjeta General
                case "1" -> {
                    // Definir costo y folio
                    int costoPlastico = 30;
                    folio++;
                    
                    // Crear la instancia
                    TarjetaPagoBus tarjetaGeneral = new TarjetaPagoBus("PG" + folio, 13, 0);
                    
                    // Mostrar datos
                    JOptionPane.showMessageDialog(null, tarjetaGeneral.mostrarDatos());
                    
                    // Metodo cobrar
                    tarjetaGeneral.cobrar(costoPlastico);
                    break; 
                }
                // Tarjeta Estudiantes
                case "2" -> {
                    
                    // Definir costo
                    int costoPlastico = 25;
                    folio++;
                    
                    // Solicitar datos
                    String nombreEstudiante = JOptionPane.showInputDialog("¿Cual es el nombre del estuduante?");
                    String nombreEscuela = JOptionPane.showInputDialog("¿Cual es el nombre de la escuela?");
                    
                    // Crear la instancia utilizando polimorfismo
                    TarjetaPagoBus tarjetaEstudiante = new Estudiante(nombreEstudiante, nombreEscuela, "PG" + folio, 5, 0);
                    
                    // Mostrar dartos
                    JOptionPane.showMessageDialog(null, tarjetaEstudiante.mostrarDatos());
                    
                    // Metodo cobrar
                    tarjetaEstudiante.cobrar(costoPlastico);
                    break;
                }
                // Tarjeta Adultos Mayores
                case "3" -> {
                    
                    // Definir costo
                    int costoPlastico = 20;
                    folio++;
                    
                    // Solicitar datos
                    String nombreAdulto = JOptionPane.showInputDialog("¿Cual es el nombre del adulto mayor?");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es la edad del adulto mayor?"));
                    
                    // Crear la instancia utilizando polimorfismo
                    TarjetaPagoBus tarjetaAdultoMayor = new AdultosMayores(nombreAdulto, edad, "PG" + folio, 0, 0);
                    
                    // Mostrar datos
                    JOptionPane.showMessageDialog(null, tarjetaAdultoMayor.mostrarDatos());
                    
                    // Metodo cobrar
                    tarjetaAdultoMayor.cobrar(costoPlastico);
                    break;
                }
                // Salir del programa
                case "4" -> {
                    // Mensaje salir
                    JOptionPane.showMessageDialog(null, "Finalizando programa");
                    break;
                }
                // Opcion por defecto para detectar errores
                default -> {
                    // Mensaje de error de opcion incorrecta
                    JOptionPane.showMessageDialog(null, "Opción no valida");
                    break;
                }
            }
        }
    }
}
