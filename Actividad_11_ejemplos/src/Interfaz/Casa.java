package Interfaz;
public class Casa implements Puerta{

    @Override
    public void abrir() {
        System.out.println("El casa abre su puerta");
    }

    @Override
    public void cerrar() {
        System.out.println("El casa cierra su puerta");
    }
    
}
