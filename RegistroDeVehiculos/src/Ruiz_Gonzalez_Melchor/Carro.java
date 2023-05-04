package Ruiz_Gonzalez_Melchor;

/**
 * date 13/03/2023
 * @author Melchor Ruiz G
 */
public class Carro extends Vehiculo{
    
    // Constructor por default
    public Carro() {
        numPuertas = 0;
    }
    
    // Constructor con valores
    public Carro(int numPuertas, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.numPuertas = numPuertas;
    }
    
    // Declaramos variables
    private int numPuertas;
    
    @Override
    public String mostrarDatos(){
        return "\nMarca: " + getMarca()
                + "\nModelo: " + getModelo()
                + "\nPrecio: $" + getPrecio()
                + "\nNumero de puertas: " + numPuertas;
    }
}
