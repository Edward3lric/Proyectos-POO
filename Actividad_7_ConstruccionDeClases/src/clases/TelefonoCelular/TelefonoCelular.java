package clases.TelefonoCelular;
/**
 * Date 08/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class TelefonoCelular {
    private String marca;
    private String modelo;
    private double peso;
    private String color;
    private boolean esInteligente;
    private boolean tieneWIFI;
    
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
    
    // Metodos Get
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public double getPeso(){
        return peso;
    }
    public String getColor(){
        return color;
    }
    public boolean getEsInteligente(){
        return esInteligente;
    }
    public boolean getTieneWIFI(){
        return tieneWIFI;
    }
    
    // Metodos Set
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setEsInteligente(boolean esInteligente){
        this.esInteligente = esInteligente;
    }
    public void setTieneWIFI(boolean tieneWIFI){
        this.tieneWIFI = tieneWIFI;
    }
}
