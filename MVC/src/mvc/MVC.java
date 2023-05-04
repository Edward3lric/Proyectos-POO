package mvc;

import view.Vista;
import controller.Controlador;
import model.Modelo;

/**
 *
 * @author h4lof
 */
public class MVC {
    public static void main(String[] args) {
       Modelo model = new Modelo();
       Vista view = new Vista();
       Controlador controller = new Controlador(model, view);
       controller.sumar();
    }
    
}
