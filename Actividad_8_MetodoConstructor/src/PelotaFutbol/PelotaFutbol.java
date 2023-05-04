package PelotaFutbol;
/**
 * date 20/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class PelotaFutbol {
    
    // Constructor default
    public PelotaFutbol(){
        tamaño = 0;
        color = null;
        peso = 0.0;
        tipo = null;
    }
    
    // Constructor con atributos
    public PelotaFutbol(int tamaño, String color, double peso, String tipo){
        this.tamaño = tamaño;
        this.color = color;
        this.peso = peso;
        this.tipo = tipo;
    }
    
    // Atributos
    private int tamaño;
    private String color;
    private double peso;
    private String tipo;
    
    // Metodos
    public void rebotar(){
        System.out.println("Hola soy un Pelota y estoy rebotando");
    }
    public void ponchar(){
        System.out.println("Hola soy un Pelota y estoy ponchada");
    }
    public void inflar(){
        System.out.println("Hola soy un Pelota y me estoy inflando");
    }
    public void rodar(){
        System.out.println("Hola soy un Pelota y estoy rodando");
    }
    
    public void saludar(){
    System.out.println("Hola soy una Pelota de futbol y mido " + tamaño + 
            "cm de diameto, soy de color " + color + ", peso " + peso + 
            "gr y soy de tipo " + tipo);
    }
}
