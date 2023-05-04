package Registro_de_alimentos;

import javax.swing.JOptionPane;

/**
 *
 * @author h4lof
 */
public class AlmacenDeAlimentos {
    private static Alimentos[] alimentos = new Alimentos[10];
    private static int numAlimentos = 0;
    
    public static void main(String[] args) {
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Sellecione una opcion"
                    + "\n1. Agreagar alimento"
                    + "\n2. Mostrar alimento"
                    + "\n3. Salir"));
            
            switch(opcion){
                case 1 ->{
                    agregarAlimento();
                    break;
                }
                case 2 ->{
                    mostrarAlimentos();
                    break;
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;
                }
            }
        } while (opcion != 3);
    }
    
    private static void agregarAlimento(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alimento");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de fruta"));
        double precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio unitario"));
        int tipoAlimento = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de alimento\n1. Fruta"));
    
        switch(tipoAlimento){
            case 1 ->{
                String tipoFruta = JOptionPane.showInputDialog("Ingrese el tipo de fruta");
                alimentos[numAlimentos++] = new Fruta(tipoFruta, nombre, cantidad, precioUnitario);
                break;
            }
            default->{
                JOptionPane.showMessageDialog(null, "Tipo de alimento invalido");
            }
        }
    }
    
    private static void mostrarAlimentos(){
        String mensaje = "Alimentos almacenados\n";
        for (int i = 0; i < numAlimentos; i++){
            mensaje += "- " + alimentos[i].getNombre() 
                    + ", " + alimentos[i].getCantidad() + " unidades, $" 
                    + alimentos[i].getPrecioUnitario() + " cada una\n";
        }
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
