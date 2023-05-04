package GuerraDeSeresVivos;
/**
 * @author: Melchor Ruiz Gonzalez
 * Date: 31/03/2023
 * Program goal: Create a game of plants vs zombies with arrays 
 */
public class Zombi extends SerVivo{
    
    // Constructores
    public Zombi(String color, float tamanio, boolean vivo, String nombre) {
        super(vivo, nombre);
        this.color = color;
        this.tamanio = tamanio;
    }
    public Zombi() {
        this.color = "verde";
        this.tamanio = 1.6f;
    }

    // Atributos
    private String color;
    private float tamanio;
    
    // Getters y Setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }
    
}
