package Registro_de_alimentos;

/**
 *
 * @author h4lof
 */
public class Fruta extends Alimentos{
    private String tipo;

    public Fruta(String tipo, String nombre, int cantidad, double precioUnitario) {
        super(nombre, cantidad, precioUnitario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
}
