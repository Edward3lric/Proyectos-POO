package Ruiz_Gonzalez_Melchor;

import javax.swing.JOptionPane;

/**
 * 10/03/2023
 * @author Melchor Ruiz González
 */
public class Motocicleta extends Vehiculo{
    
    // Constructor default
    public Motocicleta(){
        cilindraje = 0;
    }
    
    // Constructor con valores
    public Motocicleta(int cilindraje, String marca, String modelo, double precio){
        super(marca, modelo, precio);
        this.cilindraje = cilindraje;
    }
    
    // Atributos
    private int cilindraje;
    
    // Metodos
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Registro Exitosdo"
                + "\nMarca: " + getMarca()
                + "\nModelo: " + getModelo()
                + "\nPrecio: $" + getPrecio()
                + "\nCilindrada: " + cilindraje + " cm3");
    }
}
