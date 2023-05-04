package Controlador;

import Modelo.M_Estacionamieno;

/**
 * date 14/04/2023
 * @author Melchor Ruiz Gonzalez
 */
public class C_Estacionamieno {
    // Constructor Default
    public C_Estacionamieno() {
        this.matricula = null;
        this.tarifa = 0.0;
        this.tipoVehiculo = 0;
    }
    // Constructor valores
    public C_Estacionamieno(String matricula, double tarifa, int tipoVehiculo) {
        this.matricula = matricula;
        this.tarifa = tarifa;
        this.tipoVehiculo = tipoVehiculo;
    }
    
    
    // Atributos
    private String matricula;
    private double tarifa;
    private int tipoVehiculo;
    
    // Getters
    public String getMatricula() {
        return matricula;
    }

    public double getTarifa() {
        return tarifa;
    }

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }
    
    // Se crea instancia a la clase M_Estacionamiento
    M_Estacionamieno mod = new M_Estacionamieno();
    // Metodo para mostra la lista de autos
    public void mostrar(){
        mod.listaAutos(mod.getAutos());
    }
    // Metodo para retirar autos
    public void retirar(){
        mod.retirarAutos(mod.getAutos());
    }
    public void definirTarifa(int tipoVehiculo, String matricula){
        int de_tarifa;
        if (tipoVehiculo == 1){
            de_tarifa = 10;
        } else {
            de_tarifa = 15;
        }
        mod.ingresarAutos(tipoVehiculo, de_tarifa, matricula);
    }
    
}
