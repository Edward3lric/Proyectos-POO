package clases.PelotaFutbol;
/**
 * Date 10/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class PruebaPelotaFutbol {
    public static void main(String[] args) {
        PelotaFutbol pelotaFutbol = new PelotaFutbol();
        
        pelotaFutbol.rebotar();
        pelotaFutbol.ponchar();
        pelotaFutbol.inflar();
        pelotaFutbol.rodar();
        
        pelotaFutbol.setTamaño(23);
        pelotaFutbol.setColor("Blaco");
        pelotaFutbol.setPeso(568.3);
        pelotaFutbol.setTipo("sport");
        
        pelotaFutbol.saludar();
    }
}
