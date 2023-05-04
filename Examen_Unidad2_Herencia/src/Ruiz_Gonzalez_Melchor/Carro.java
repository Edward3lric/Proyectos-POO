package Ruiz_Gonzalez_Melchor;

import javax.swing.JOptionPane;

/**
 * 10/03/2023
 * @author Melchor Ruiz González
 */
public class Carro extends Vehiculo{    
    
    // Constructor default
    public Carro(){
        numPuertas = 0;
    }
    
    // Constructor con valores
    public Carro(int numPuertas, String marca, String modelo, double precio){
        super(marca, modelo, precio);
        this.numPuertas = numPuertas;
    }
    
    // Atributos
    private int numPuertas;
    
    // Metodos
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Registro Exitosdo"
                + "\nMarca: " + getMarca()
                + "\nModelo: " + getModelo()
                + "\nPrecio: $" + getPrecio()
                + "\nNúmero de puertas: " + numPuertas);
    }
}