package Ruiz_Gonzalez_Melchor;
/**
 * 10/03/2023
 * @author Melchor Ruiz González
 */
public class Vehiculo {
    
    // Constructor default
    public Vehiculo(){
        marca = null;
        modelo = null;
        precio = 0;
    }
    
    // Constructor con valores
    public Vehiculo(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    // Atributos
    private String marca;
    private String modelo;
    private double precio;
    
    // Getters
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public double getPrecio(){
        return precio;
    }
    
}
