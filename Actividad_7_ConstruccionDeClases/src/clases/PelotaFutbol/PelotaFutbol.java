package clases.PelotaFutbol;
/**
 * Date 08/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class PelotaFutbol {
    private int tamaño;
    private String color;
    private double peso;
    private String tipo;
    
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
        System.out.println("Hola soy una Pelota de futbol y mido " + tamaño + "cm de diameto, soy de color "
            + color + ", peso " + peso + "gr y soy de tipo " + tipo);
    }
    
    // Metodos Get
    public int getTamaño(){
        return tamaño;
    }
    public String getColor(){
        return color;
    }
    public double getPeso(){
        return peso;
    }
    public String getTipo(){
        return tipo;
    }
    
    // Metodos Set
    public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
}
