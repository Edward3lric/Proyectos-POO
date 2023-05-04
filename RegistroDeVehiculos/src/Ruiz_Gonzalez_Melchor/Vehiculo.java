package Ruiz_Gonzalez_Melchor;
/**
 * date 13/03/2023
 * @author Melchor Ruiz G
 */
public class Vehiculo {
    
    // Creamos constructor default
    public Vehiculo() {
        marca = "";
        modelo = "";
        precio = 0.0;
    }

    // Constructor con valores
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    // Creamos los atriburos encapsulados
    private String marca;
    private String modelo;
    private double precio;
    
    // Creamos los getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nPrecio: $" + precio;
    }
}
