/* Declara dos variables numéricas (con el valor que desees),
 * muestra por consola la suma, resta, multiplicación,
 * división y módulo (resto de la división) */

package A2_Aspectos_Lexicos;
/**
 * Fecha 18/01/2023
 * Ultima modificación: 18/01/2023
 * @author Melchor Ruiz Gonzalez
 */

public class OperacionesAritmeticas1 {
    public static void main(String[] args) {
        
        // Declarar dos variables numericas
        double num1 = 56;
        double num2 = 45;
        
        
        // Imprimir por pantalla los resultados de la suma, resta, multiplicacion, division y modulo de dos numeros
        System.out.println("Suma: " + Math.round((num1 + num2)*100d)/100d + 
                "\nResta: " + Math.round((num1 - num2)*100d)/100d + 
                "\nMultiplicacion: " + Math.round((num1 * num2)*100d)/100d + 
                "\nDivision: " + Math.round((num1 / num2)*100d)/100d + 
                "\nModulo: " + Math.round((num1 % num2)*100d)/100d );
    }
}
