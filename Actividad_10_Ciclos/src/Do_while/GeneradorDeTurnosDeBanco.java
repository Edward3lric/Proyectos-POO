package Do_while;

import javax.swing.JOptionPane;

/**
 * date 27/03/2023
 * @author Melchor Ruiz Gonzlez
 */
public class GeneradorDeTurnosDeBanco {
    public static void main(String[] args) {
        
        // Declara variables
        int opcion;
        String turno;
        int turnoCajas = 1;
        int turnoEjecutivos = 1;
        
        // Ciclo do-while para repetir el programa multiples veces
        do{
            // Elegir el submenu al que el usuario quiere entrar
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Bienvenido al Banco\n[1] Cajas\n[2] Ejecutivos\n[3] Salir"));
            
            // Entrar al submenu correspondiente
            switch (opcion) {
                // Zona cajas
                case 1 -> {
                    turno = "CJ"+ turnoCajas;
                    JOptionPane.showMessageDialog(null, "Su turno es: " + turno);
                    turnoCajas++;
                }
                // Zona ejecutivos
                case 2 -> {
                    turno = "EJ"+turnoEjecutivos;
                    JOptionPane.showMessageDialog(null, "Su turno es: " + turno);
                    turnoEjecutivos++;
                }
                // Salir del banco
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Saliendo");
                }
                // Monstrar error
                default -> {
                    JOptionPane.showMessageDialog(null, "Error 1: Opcion incorrecta");
                }
            }
        } while(opcion != 3);

    }
}
