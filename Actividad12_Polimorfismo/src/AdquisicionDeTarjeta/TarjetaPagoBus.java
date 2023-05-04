package AdquisicionDeTarjeta;

import javax.swing.JOptionPane;

/**
 * date: 17/03/2023
 * @author Melchor Ruiz Gonzalez
 */
public class TarjetaPagoBus {
    
    // Metodo constructor con valores
    public TarjetaPagoBus(String folio, double tarifa, double saldo) {
        this.folio = folio;
        this.tarifa = tarifa;
        this.saldo = saldo;
    }
    
    // Atributos
    private String folio;
    private double tarifa;
    private double saldo;

    
    // Metodos Getters
    public String getFolio() {
        return folio;
    }
    public double getTarifa() {
        return tarifa;
    }
    public double getSaldo() {
        return saldo;
    }
    
    // Metodo mostrar datos
    public String mostrarDatos(){
       // Regresar Datos
       return "Usted ha solicitado una tarjeta General"
               + "\nSu número de tarjeta es: " + folio 
               + "\nTendra una Tarifa de de: " + tarifa 
               + "\nSu saldo es de: " + saldo; 
    }
    
    // Metodo cobrar
    public void cobrar(int precio){
        // Atributos 
        double pago = 0;
        boolean entrar = true;
        
        // Ciclo para no salir hasta que se haya completado el pago
        while(entrar){
            // Dinero que falta pagar
            double precioFinal = precio - pago;
            
            // Solicitar el pago
            pago += Double.parseDouble(JOptionPane.showInputDialog("Precio a pagar: " 
                    + precioFinal + "\n-- Ingrese el dinero --"));
            
            // Ver si falta o sobra dinero
            if (pago > precio){
                JOptionPane.showMessageDialog(null, "Precio: " + precio
                        + "\nPago: " + pago
                        + "\nCambio: " + (pago - precio));
                entrar = false;
            } else if (pago < precio){
                JOptionPane.showMessageDialog(null, "Precio: " + precio
                        + "\nPago: " + pago
                        + "\nDinero faltante: " + (precio - pago));
            } else {
                JOptionPane.showMessageDialog(null, "Precio: " + precio
                        + "\nPago: " + pago
                        + "\nDinero completo");
                entrar = false;
            }
        }
    }
}
