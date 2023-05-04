package Interfaz;
public class MenuInterfaz {
    public static void main(String[] args) {
        Carro cr = new Carro();
        Casa cs = new Casa();
        
        cr.avanzar();
        cr.detenerse();
        cr.abrir();
        cr.cerrar();
        
        cs.abrir();
        cs.cerrar();
    }
}
