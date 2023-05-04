package clases.TelefonoCelular;
/**
 * Date 10/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class PruebaTelefonoCelular {
    public static void main(String[] args) {
        TelefonoCelular telefonoCelular = new TelefonoCelular();
        
        telefonoCelular.recibirLlamada();
        telefonoCelular.hacerLlamada();
        telefonoCelular.encender();
        telefonoCelular.cargar();
        telefonoCelular.gastarBateria();
        telefonoCelular.recibirMensaje();
        
        telefonoCelular.setMarca("Samsung");
        telefonoCelular.setModelo("fold");
        telefonoCelular.setPeso(120.3);
        telefonoCelular.setColor("Negro");
        telefonoCelular.setEsInteligente(true);
        telefonoCelular.setTieneWIFI(true);
        
        telefonoCelular.saludar();
    }
}
