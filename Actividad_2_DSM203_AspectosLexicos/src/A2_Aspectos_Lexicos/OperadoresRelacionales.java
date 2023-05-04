/* Declara 2 variables numéricas (con el valor que desees), he indica cual es 
 * mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores
 * para comprobar que funciona */
package A2_Aspectos_Lexicos;
/**
 * Fecha 18/01/2023
 * Ultima modificación: 18/01/2023
 * @author Melchor Ruiz Gonzalez
 */
public class OperadoresRelacionales {
    public static void main(String[] args) {
        
        // Definir variables
        int a = 35;
        int b = 35;
        
        // Verificar si a es mayor que b
        if (a > b){
            System.out.println(a  + " es mayor que " + b);
        }
        // Verificar si b es mayor que a
        if (a < b){
            System.out.println(b  + " es mayor que " + a);
        }
        // Verificar si a es igua que b
        if (a == b){
            System.out.println(a  + " es igual que " + b);
        }
    }
}
