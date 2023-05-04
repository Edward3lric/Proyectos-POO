package Modelo;

import Controlador.C_Estacionamieno;
import javax.swing.JOptionPane;

/**
 * date 14/04/2023
 * @author Melchor Ruiz Gonzalez
 */
public class M_Estacionamieno {
    // Variables
    private int tamanio = 3, index = 0;
    
    // Array
    C_Estacionamieno autos[] = new C_Estacionamieno[tamanio];
    
    // Getter
    public C_Estacionamieno[] getAutos() {
        return autos;
    }
    
    // Metodos
    public void ingresarAutos(int p_tipoVehiculo, double p_tarifa, String p_matricula){
        try{
            if(autos[index] == null){
                autos[index] = new C_Estacionamieno(p_matricula, p_tarifa, p_tipoVehiculo);
                index++;
                JOptionPane.showMessageDialog(null, "Auto Ingresado con Exito, quedad: " + (tamanio - index) + " lugares");
            } else {
                JOptionPane.showMessageDialog(null, "Cupo lleno");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Ya no hay mas espacio en el estacionamiento");
        }
    }
    
    public void retirarAutos(C_Estacionamieno[] auto){
        try{
            auto[index-1]=null;
            index--;
            JOptionPane.showMessageDialog(null, "Auto Retirado con exito");
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Ya no tiene mas autos es su estacionamiento");
        }
    }
    
    public void listaAutos(C_Estacionamieno[] auto){
        String lista = "";
        for(int i = 0; i < auto.length; i++){
            if (auto[i] == null){
                lista += "Espacio " + i + " Esta libre\n";
            } else{
                lista += "Espacio " + i + " Ocupado\n";
            }
        }
        JOptionPane.showMessageDialog(null, lista);
    }
}
