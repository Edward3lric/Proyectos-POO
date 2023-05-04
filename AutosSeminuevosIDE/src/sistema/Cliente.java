
package sistema;
/**
 *
 * @author h4lof
 */
public class Cliente extends Persona{
    
    // Atributos
    private int idCliente;
    private String RFC;
    private String correo;
    private String fechaNacimiento;

    // Getters & Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Metodos
    public void comprarAuto(){
        
    }
}
