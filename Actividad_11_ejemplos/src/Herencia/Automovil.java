package Herencia;
/**
 *
 * @author h4lof
 */
public class Automovil extends Vehiculo{
    private int noPuertas;
    
    public Automovil(String marca,String modelo, String matricula, int noPuertas){
        super(marca, modelo, matricula);
        this.noPuertas = noPuertas;
    }
    public void girar(){
        System.out.println("girando");
    }
    public void datosAuto(){
        System.out.println("Marca: " + getMarca()
                + "\nModelo: " + getModelo()
                + "\nMatricula: " + getMatricula()
                + "\nNo Puertas: " + noPuertas);
    }
}
