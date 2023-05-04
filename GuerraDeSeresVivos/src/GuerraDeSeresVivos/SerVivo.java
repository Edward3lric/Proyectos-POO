package GuerraDeSeresVivos;
import java.util.Random;
/**
 * @author: Melchor Ruiz Gonzalez
 * Date: 31/03/2023
 * Program goal: Create a game of plants vs zombies with arrays 
 */
public class SerVivo {
    
    // Constructor con valores
    public SerVivo(boolean vivo, String nombre) {
        this.vivo = vivo;
        this.nombre = nombre;
    }
    // Constructor default
    public SerVivo(){
        this.vivo = true;
        this.nombre = "DESCONOCIDO";
    }
    
    // Atributos
    private boolean vivo;
    private String nombre;
    
    //Comportamientos
    public void morir(){
        //Si el ser vivo está vivo
        if (vivo == true){
            // Imprime un mensaje diciendo que se va a morir
            System.out.println("Soy " + nombre + " y me muero");
            // El atributo vivo para a false, para iniciar que está muerto
            this.vivo = false;
        }
        // Si no esta vivo entonces manda un mensaje que ya esta muerto
        else{
            System.out.println("Soy " + nombre + " ya estaba muerto");
        } 
    }
    public int matar(){
        // Creamos un objeto random para generar un numero aleatorio,
        // el cual sera un numero de 0 a 10 y sera el numero del
        // ser vivo que matará
        Random generadorDeAleatorios = new Random();
        // La victima se genera de manera aleatoria
        int victima = generadorDeAleatorios.nextInt(10);
        return victima;
    }

    // Getters y setter
    
    public boolean getVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
