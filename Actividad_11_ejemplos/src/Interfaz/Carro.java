package Interfaz;
public class Carro implements Rueda, Puerta{

    @Override
    public void avanzar() {
        System.out.println("El carro avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("El carro se detiene");
    }

    @Override
    public void abrir() {
        System.out.println("El carro abre su puerta");
    }

    @Override
    public void cerrar() {
        System.out.println("El carro cierra su puerta");
    }

    
    
}
