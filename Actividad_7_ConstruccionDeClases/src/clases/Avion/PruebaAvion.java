package clases.Avion;
/**
 * Date 08/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class PruebaAvion {
    public static void main(String[] args) {
        
        Avion avion = new Avion();
        
        avion.despegar();
        avion.aterrizar();
        avion.gastarCombustible();
        avion.planear();
        
        avion.setNoTurbinas(2);
        avion.setTipoCombustible("disel");
        avion.setTipo("comercial");
        avion.setCapacidadCarga(1000.0);
        
        avion.saludar();
    }
}
