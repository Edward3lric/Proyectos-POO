package Practica_Clase;
/**
 * date 27/03/2023
 * @author Melchor Ruiz Gonzalez
 */
public class Throw{
    // Creamos un metodo privado de tipo void
    private void metodo1(){
       try{
           metodo2();
       }
       catch(Exception e){
           System.out.println("Nivel 1: " + e.getMessage());
       }
    }
    private void metodo2() throws Exception{
        try{
            metodo3();
       }
       catch(Exception e){
           System.out.println("Nivel 2: " + e.getMessage());
           throw new Exception(e.getMessage());
       }
    }
    private void metodo3() throws Exception{
        try{
            int division = 2 / 0;
       }
       catch(Exception e){
           System.out.println("Nivel 3: " + e.getMessage());
           throw new Exception(e.getMessage());
       }
    }
    
    // Creamos un metodo de entrada al que nombramso Main
    public static void main(String[] args) {
        // Ahora vamos a crear un objeto de THroe
        Throw th = new Throw();
        th.metodo1();
    }
}
