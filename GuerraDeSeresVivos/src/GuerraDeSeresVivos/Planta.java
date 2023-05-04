package GuerraDeSeresVivos;
/**
 * @author: Melchor Ruiz Gonzalez
 * Date: 31/03/2023
 * Program goal: Create a game of plants vs zombies with arrays 
 */
public class Planta extends SerVivo{
    
    // Constructores
    
    public Planta() {
        this.tamanio = 1.2f;
        this.tipo = "flores";
    }
    public Planta(float tamanio, String tipo, boolean vivo, String nombre) {
        super(vivo, nombre);
        this.tamanio = tamanio;
        this.tipo = tipo;
    }
    
    // Atributos
    private float tamanio;
    private String tipo;
    
    // Getters y Setters

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
