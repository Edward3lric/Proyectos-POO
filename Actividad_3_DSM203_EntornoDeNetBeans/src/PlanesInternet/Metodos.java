package PlanesInternet;
/**
 * Fecha 24/01/2023
 * Ultima modificación: 24/01/2023
 * @author Melchor Ruiz Gonzalez
 */

// Importar la libreria Scanner para leer datos
import java.util.Scanner;
public class Metodos {
    
    // Definir variables globales
    String planElegido;
    int precioMensual;
    double total;
    double costoAnual;
    
    // Definir constantes globales
    int PRE_BA = 50;
    int PRE_ME = 75;
    int PRE_CO = 200;
    String  BASICO = "Basico $" + PRE_BA;
    String MEDIO = "Medio $" + PRE_ME;
    String COMPLETO = "Completo $" + PRE_CO;
    
    // Metodo para escribir por consola los planes que ofrece la compañia
    void EscribirPlanes(){
        // Escribir por pantalla nuestros planes de internet
        System.out.println("Bienvendio a tu proxima compañia de internet");
        System.out.println("Ofrecemos los siguientes planes de internet:\n[1]"
        + BASICO + ", [2]" + MEDIO + ", [3])" + COMPLETO);
    }
    
    void ElegirPlan(){
        // Iniciar el Scanner en la variable read
        Scanner read = new Scanner (System.in);

        // Iniciar la variable local de tipo boolean
        boolean salir = false;
        
        // Volver a leer la respuesta hasta que se introdusca una opcion valida
        while (salir == false){
            // Leer la respuesta del usuario y guardarla en una variable
            // Si la respuesta no es valida se imprimira un mensaje
            switch(read.nextInt()){
                case 1 ->  {
                    planElegido = BASICO;
                    precioMensual = PRE_BA;
                    salir = true;
                }
                case 2 ->  {
                    planElegido = MEDIO;
                    precioMensual = PRE_ME;
                    salir = true;
                }
                case 3 ->  {
                    planElegido = COMPLETO;
                    precioMensual = PRE_CO;
                    salir = true;
                }
                default -> {
                    System.out.println("Opcion no valida, intenta de nuevo");
                }
            }     
        }
    }
    
    void CalcularCostos(){
        // Calcular el total + iva
        total = (precioMensual * 1.16);
        
        // Calcular el costo anual
        costoAnual = total * 12;
    }
    
    void MostrarResultados(){
        // Imprimir por pantalla todo lo que nos pide el problema 
        System.out.println("\nHas elegido el plan: [" + planElegido + "]"
                + "\nSu valor total + iva es de: " + Math.round(total*100d)/100d
                + "\nSu costo por año es de: "  + Math.round(costoAnual*100d)/100d);
    }
}
