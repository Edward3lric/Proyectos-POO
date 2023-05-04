package GuerraDeSeresVivos;
/**
 * @author: Melchor Ruiz Gonzalez
 * Date: 31/03/2023
 * Program goal: Create a game of plants vs zombies with arrays 
 */
public class SimuladorDeGuerra {
    public static void main(String[] args) {
        // Objeto generador de guerra
        GeneradorDeGuerra guerrilla = new GeneradorDeGuerra();
        
        // Se crean los ejercitos
        guerrilla.crearEjercito();
        
        // Se ponen a pelear los ejercitos
        guerrilla.pelear();
        
        // Se verifica quien ganó la guerra
        guerrilla.obtenerGanador();

    }
}
