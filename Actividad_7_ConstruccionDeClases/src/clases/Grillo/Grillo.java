package clases.Grillo;
/**
 * Date 08/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class Grillo {
    private int edad;
    private double tamaño;
    private String color;
    private String genero;
    
    public void cantar(){
        System.out.println("Hola soy un Grillo y estoy cantando");
    }
    public void volar(){
        System.out.println("Hola soy un Grillo y estoy volando");
    }
    public void morder(){
        System.out.println("Hola soy un Grillo y estoy mordiendo");
    }
    public void dormir(){
        System.out.println("Hola soy un Grillo y estoy durmiendo");
    }
    
    public void saludar(){
        System.out.println("Hola soy un Grillo y tengo " + edad + " años, mi tamaño es de "
            + tamaño + "cm, soy de color " + color + " y mi genero es " + genero);
    }
    
    // Metodos Get
    public int getEdad(){
        return edad;
    }
    public double getTamaño(){
        return tamaño;
    }
    public String getColor(){
        return color;
    }
    public String getGenero(){
        return genero;
    }
    
    // Metodos Set
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setTamaño(double tamaño){
        this.tamaño = tamaño;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
}
