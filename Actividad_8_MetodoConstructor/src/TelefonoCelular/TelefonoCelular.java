package TelefonoCelular;
/**
 * date 20/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class TelefonoCelular {
    // Constructor default
    public TelefonoCelular(){
        marca = null;
        modelo = null;
        peso = 0.0;
        color = null;
        esInteligente = false;
        tieneWIFI = false;
    }
 
    // Constructor con atributos
    public TelefonoCelular(String marca, String modelo, double peso, 
            String color, boolean esInteligente, boolean tieneWIFI){
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.color = color;
        this.esInteligente = esInteligente;
        this.tieneWIFI = tieneWIFI;
    }
    
    // Atributos
    private String marca;
    private String modelo;
    private double peso;
    private String color;
    private boolean esInteligente;
    private boolean tieneWIFI;
    
    // Metodos
    public void recibirLlamada(){
        System.out.println("Hola soy un Telefono Celular y estoy recibiendo una llamada");
    }
    public void hacerLlamada(){
        System.out.println("Hola soy un Telefono Celular y estoy haciendo una llamada");
    }
    public void encender(){
        System.out.println("Hola soy un Telefono Celular y estoy encendiendo");
    }
    public void cargar(){
        System.out.println("Hola soy un Telefono Celular y estoy cargando");
    }
    public void gastarBateria(){
        System.out.println("Hola soy un Telefono Celular y estoy gastando bateria");
    }
    public void recibirMensaje(){
        System.out.println("Hola soy un Telefono Celular y estoy recibiendo mensajes");
    }
    public void enviarMensaje(){
        System.out.println("Hola soy un Telefono Celular y estoy enviando mensajes");
    }
    
    public void saludar(){
        System.out.println("Hola soy un Telefono Celular y soy de marca " + marca + ", mi modelo es "
            + modelo + ", peso " + peso + "gr, tengo un color " + color
            + ", soy inteligente: " + esInteligente + " y tengo WIFI: " + tieneWIFI);
    }
}
