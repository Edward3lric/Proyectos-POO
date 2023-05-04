package PagoBus;

import javax.swing.JOptionPane;
/**
 * date 22/02/2023
 * @author Melchor Ruiz
 */
public class PagoBus {
    // Constructor default
    public PagoBus(){
        nombre = null;
        apellido = null;
        idUsuario = 0;
        saldo = 0;
    }
    // Constructor con valore
    public PagoBus(String nombre, String apellido, int idUsuario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.idUsuario = idUsuario;
    }
    
    // Variables globales
    private String nombre;
    private String apellido;
    private int idUsuario;
    private double saldo;
    
    // Metodo depositar
    public void depositar(){
        double saldoAnterior = saldo;
        double option = Double.parseDouble(JOptionPane.showInputDialog(
                "¿Cuanto saldo quieres ingresar?"));
        if (option > 0){
            saldo += option;
            verSalario(option, saldoAnterior);
        } else  {
            JOptionPane.showMessageDialog(null, 
                    "Error 3: No puedes ingresar cantidades menores o iguales a 0 pesos");
        }
        
    }
    // Metodo pagar
    public void pagar(double tarifa){
        if (saldo >= 5){
            double saldoAnterior = saldo;
            saldo += tarifa;
            JOptionPane.showMessageDialog(null, 
                    "Pago realizado con exito de $" + tarifa);
            verSalario(tarifa, saldoAnterior);
        }else {
            JOptionPane.showMessageDialog(null, 
                    "Error 2: Saldo Insuficiente");
        }    
    }
    // Metodo ver salario
    private void verSalario(double movimiento, double saldoAnterior){
        JOptionPane.showMessageDialog(null, 
                "Su saldo anterior es de: $" + saldoAnterior
                + "\nUltimo movimiento: $" + movimiento
                + "\nSaldo final: $" + saldo);
    }
    
    // Metodos Getters
    public double getSaldo(){
        return saldo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getIdUsuario(){
        return  idUsuario;
    }
}
