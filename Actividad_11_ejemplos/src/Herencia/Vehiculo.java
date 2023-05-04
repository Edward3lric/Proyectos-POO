package Herencia;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    
    public Vehiculo(String marca, String modelo, String matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }
    
    
    // Metodos Get
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getMatricula(){
        return matricula;
    }
    
    // Metodos Set
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void acelerar(){
        System.out.println("acelerando");
    }
    public void frenar(){
        System.out.println("frenando");
    }
    public void gastarCombustible(){
        System.out.println("gastando combustible");
    }
    
}
