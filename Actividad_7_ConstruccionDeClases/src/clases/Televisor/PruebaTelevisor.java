package clases.Televisor;
/**
 * Date 10/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class PruebaTelevisor {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        
        televisor.encender();
        televisor.apagar();
        televisor.cambiarCanal();
        televisor.subirVolumen();
        televisor.bajarVolumen();
        televisor.decodificarSeñal();
        
        televisor.setMarca("LG");
        televisor.setModelo("Oled");
        televisor.setTamaño(37.8);
        televisor.setPrecio(10000.99);
        
        televisor.Saludar();
    }
}
