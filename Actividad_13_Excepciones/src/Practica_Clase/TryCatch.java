package Practica_Clase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * date 24/03/2023
 * @author h4lof
 */
public class TryCatch {
    public static void main(String[] args) {
        try{
            // Este objeto busca la ruta del archivo
            File ruta = new File("C:\\Users\\h4lof\\OneDrive - Universidad Tecnológica de León\\NetBeansProjects\\Archivos\\Archivo.txt");
            // Abrimos archivo
            FileReader abrir = new FileReader(ruta);
            // Lectura de archivo mediante un buffer
            BufferedReader leer = new BufferedReader(abrir);

            String lineas;

            while ((lineas = leer.readLine()) != null){
                System.out.println(lineas);
            }
        }
        catch(FileNotFoundException fnf){
            System.out.println("No se encuentra el archivo " + fnf.getMessage());
        }
        catch(IOException io){
            System.out.println("Error al abrir archivo " + io.getMessage());
        }
        finally{
            System.out.println("Esto continua");
        }
        System.out.println("Nas continuacion...");
    }
}
