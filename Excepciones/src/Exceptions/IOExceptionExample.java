package Exceptions;

import java.io.*;

public class IOExceptionExample {
   public static void main(String[] args) {
      
      try {
         // Abrir el archivo
         FileWriter file = new FileWriter("ejemplo.txt");

         // Escribir en el archivo
         file.write("Este es un ejemplo de texto en el archivo.");

         // Cerrar el archivo
         file.close();

         // Leer el archivo
         FileReader fileReader = new FileReader("ejemplo.txt");

         // Crear un buffer de lectura
         BufferedReader bufferedReader = new BufferedReader(fileReader);

         // Leer línea por línea
         String linea;
         while ((linea = bufferedReader.readLine()) != null) {
            System.out.println(linea);
         }

         // Cerrar el archivo
         fileReader.close();
      } catch (IOException e) {
         System.out.println("Error al manipular el archivo: " + e.getMessage());
      }
   }
}
