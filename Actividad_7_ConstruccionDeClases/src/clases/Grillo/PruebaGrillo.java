package clases.Grillo;
/**
 * Date 10/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class PruebaGrillo {
    public static void main(String[] args) {
        Grillo grillo = new Grillo();
        
        grillo.cantar();
        grillo.volar();
        grillo.morder();
        grillo.dormir();
        
        grillo.setEdad(3);
        grillo.setTamaño(3.2);
        grillo.setColor("Azul");
        grillo.setGenero("Masculino");
        
        grillo.saludar();
    }
}
