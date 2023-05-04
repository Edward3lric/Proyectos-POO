/* Haz una aplicacion que calcule el area de un circulo (PI*R2), el radio se pedira
   por teclado (recuerda pasar de string a double con Double.parseDouble). Usa
   la constante PI y el metodo pow de Math */

package Areas;
/**
 * Fecha 16/01/2023
 * Ultima modificación: 16/01/2023
 * @author Melchor Ruiz Gonzalez
 */

//Importar la libreria Scanner
import java.util.Scanner;

public class Circulo {
    //Crear nuestro metodo inicial main
    public static void main (String[] mimetodo) {
        //Declarar nuestras variables
        double radio = 0;
        double area = 0;
        
        //Iniciar Scanner para poder leer por teclado
        Scanner read = new Scanner (System.in);
        
        //Imprimir un mensaje al usuario de lo que le vamos a pedir
        System.out.println("Ingresa el radio del cirulo: ");
        //Obtenemos los datos y los guadamos en la variable radio
        radio = Double.parseDouble(read.nextLine());
        //Impriir los datos capturados
        System.out.println("Radio = " + radio);
        
        //Calcular el area, utilizando la constante PI multiplicando por radio ^ 2 utilizando pow
        area = Math.PI * Math.pow(radio, 2);
        
        //Imprimir el area redondeandola a dos decimales
        System.out.println("Area: " + Math.round(area*100d)/100d);
    }
}
