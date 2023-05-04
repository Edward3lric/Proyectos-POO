package clases.Avion;
/**
 * Date 08/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class Avion {
    private int noTurbinas;
    private String tipoCombustible;
    private String tipo;
    private double capacidadCarga;
    
    public void despegar(){
        System.out.println("Hola soy un Avión y estoy despegando");
    }
    public void aterrizar(){
        System.out.println("Hola soy un Avión y estoy aterrizando");
    }
    public void gastarCombustible(){
        System.out.println("Hola soy un Avión y estoy gastando combustible");
    }
    public void planear(){
        System.out.println("Hola soy un Avión y estoy planeando");
    }
    
    public void saludar(){
        System.out.println("Hola soy un Avión y tengo " + noTurbinas + " turbinas, utilizo combustible "
            + tipoCombustible + ", soy de tipo " + tipo + " y tengo una capacidad de carga de " + capacidadCarga + "kg");
    }
    
    
    // Metodos Get
    public int getNoTurbinas(){
        return noTurbinas;
    }
    public String getTipoCombustible(){
        return tipoCombustible;
    }
    public String getTipo(){
        return tipo;
    }
    public double getCapacidadCarga(){
        return capacidadCarga;
    }
    
    
    // Metodos Set
    public void setNoTurbinas(int noTurbinas){
        this.noTurbinas = noTurbinas;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setCapacidadCarga(double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }
}
