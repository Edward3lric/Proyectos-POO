package Ruiz_Gonzalez_Melchor;

/**
 * date 13/03/2023
 * @author Melchor Ruiz G
 */
public class Motocicleta extends Vehiculo{

    // Creamos los constructores
    public Motocicleta() {
        cilindrada = 0;
    }
    public Motocicleta(int cilindrada, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }
    
    // Declaramos variables
    private int cilindrada;
    
    @Override
    public String mostrarDatos(){
        return "\nMarca: " + getMarca()
                + "\nModelo: " + getModelo()
                + "\nPrecio: $" + getPrecio()
                + "\nCilindrada: " + cilindrada + " cc";
    }
}
