package Exceptions;

import java.io.*;

public class FileNotFoundExceptionExample {
   public static void main(String[] args) {
      try {
         // Intentar abrir un archivo que no existe
         FileReader fileReader = new FileReader("archivo_que_no_existe.txt");
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         String linea;
         while ((linea = bufferedReader.readLine()) != null) {
            System.out.println(linea);
         }
         fileReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("El archivo no se puede encontrar: " + e.getMessage());
      } catch (IOException e) {
         System.out.println("Error al manipular el archivo: " + e.getMessage());
      }
   }
}

