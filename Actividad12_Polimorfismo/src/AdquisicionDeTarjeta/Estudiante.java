package AdquisicionDeTarjeta;
/**
 * date: 17/03/2023
 * @author Melchor Ruiz Gonzalez
 */
public class Estudiante extends TarjetaPagoBus{

    // Constructor con valores
    public Estudiante(String nombreEstudiante, String nombreEscuela, String folio, double tarifa, double saldo) {
        super(folio, tarifa, saldo);
        this.nombreEstudiante = nombreEstudiante;
        this.nombreEscuela = nombreEscuela;
    }
    
    // Atributos
    private String nombreEstudiante;
    private String nombreEscuela;
    
    // Metodos
    @Override
    public String mostrarDatos(){
        // Regresar Datos
        return "Usted ha solicitado una tarjeta de Estudiante a nombre de: " + nombreEstudiante
                + "\nEstudiante en: " + nombreEscuela 
                + "\nSu númerode tarjeta es: " + getFolio() 
                + "\nTendrá una tarifa de: "  + getTarifa() 
                + "\nSu saldo es de: " + getSaldo();
    }
}
