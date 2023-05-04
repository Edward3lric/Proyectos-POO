package PelotaFutbol;
/**
 * date 20/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class PruebaPelotaFutbol {
    public static void main(String[] args) {
        
        // Crear instancia
        PelotaFutbol pelotaFutbol1 = new PelotaFutbol(23, "azul", 
                532.5, "ingles");
        
        
        // Ejecutar metodos
        pelotaFutbol1.rebotar();
        pelotaFutbol1.ponchar();
        pelotaFutbol1.inflar();
        pelotaFutbol1.rodar();
        
        pelotaFutbol1.saludar();
    }
}
