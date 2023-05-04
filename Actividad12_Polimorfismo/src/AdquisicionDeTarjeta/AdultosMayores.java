package AdquisicionDeTarjeta;
/**
 * date: 17/03/2023
 * @author Melchor Ruiz Gonzalez
 */
public class AdultosMayores extends TarjetaPagoBus{

    // Constructor con valores
    public AdultosMayores(String nombreAdulto, int edad, String folio, double tarifa, double saldo) {
        super(folio, tarifa, saldo);
        this.nombreAdulto = nombreAdulto;
        this.edad = edad;
    }
    
    // Atributos
    private String nombreAdulto;
    private int edad;
    
    // Metodos
    @Override
    public String mostrarDatos(){
        // Regresar Datos
       return "Usted ha solicitado una tarjeta de Adultos Mayores a nombre de: " + nombreAdulto
                + "\nCon edad de: " + edad 
                + "\nSu númerode tarjeta es: " + getFolio() 
                + "\nTendrá una tarifa de: "  + getTarifa() 
                + "\nTu saldo es de: " + getSaldo(); 
    }
}
