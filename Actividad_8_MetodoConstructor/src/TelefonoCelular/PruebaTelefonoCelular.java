package TelefonoCelular;
/**
 * date 20/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class PruebaTelefonoCelular {
    public static void main(String[] args) {
        
        // Crear instancia
        TelefonoCelular telefonoCelular1 = new TelefonoCelular("Xiaomi", 
                "Redmi", 132.6, "negro", true, 
                true);
        
        
        // Ejecutar metodos
        telefonoCelular1.recibirLlamada();
        telefonoCelular1.hacerLlamada();
        telefonoCelular1.encender();
        telefonoCelular1.cargar();
        telefonoCelular1.gastarBateria();
        telefonoCelular1.recibirMensaje();
        telefonoCelular1.enviarMensaje();
        
        telefonoCelular1.saludar();
    }
}
