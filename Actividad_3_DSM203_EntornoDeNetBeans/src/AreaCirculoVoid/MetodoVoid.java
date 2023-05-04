
package AreaCirculoVoid;
/**
 * Fecha 23/01/2023
 * Ultima modificación: 23/01/2023
 * @author Melchor Ruiz Gonzalez
 */

// Importar la libreria Scanner para leer datos por consola
import java.util.Scanner;
public class MetodoVoid {
    // Crear las variables necesarias
    double radio;
    double area;
    
    // Metodo para leer el valor del radio del ciculo
    void Leer(){
        // Inicia el Scanner en la variable read
        Scanner read = new Scanner(System.in);
        // Imprimir un mensaje para solicitar el radio
        System.out.println("¿Cual es el radio del circulo?");
        // Leer el radio y guardarlo en su respectiva variable
        radio = read.nextInt();
    }
    
    // Metodo para calcular el area del circulo
    void CalcularArea(){
        // Calcular el area del circulo con la funcion Math
        area = Math.PI * Math.pow(radio, 2);
    }
    
    // Metodo para escribir el area redondeado
    void Escribir(){
        // Imprimir el resultado usando la funcion round para redondearlo a 2 decimales
        System.out.println("Area: " + area);
    }
}
