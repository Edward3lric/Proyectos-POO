package clases.Televisor;
/**
 * Date 08/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class Televisor {
    private String marca;
    private String modelo;
    private double tamaño;
    private double precio;
    
    public void encender(){
        System.out.println("Hola soy un Televisor y estoy encendiendo");
    }
    public void apagar(){
        System.out.println("Hola soy un Televisor y estoy apagando");
    }
    public void cambiarCanal(){
        System.out.println("Hola soy un Televisor y estoy cambiando de canal");
    }
    public void subirVolumen(){
        System.out.println("Hola soy un Televisor y estoy subiendo volumen");
    }
    public void bajarVolumen(){
        System.out.println("Hola soy un Televisor y estoy bajando volumen");
    }
    public void decodificarSeñal(){
        System.out.println("Hola soy un Televisor y estoy decodificando señal");
    }
    
    public void Saludar(){
        System.out.println("Hola soy un Televison y soy de marca " + marca + ", mi modelo es "
            + modelo + ", mi tamaño es " + tamaño + " pulgadas y mi precio es de " + precio + "$");
    }
    
    // Metodos Get
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public double getTamaño(){
        return tamaño;
    }
    public double getPrecio(){
        return precio;
    }
    
    // Metodos Set
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setTamaño(double tamaño){
        this.tamaño = tamaño;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
}
