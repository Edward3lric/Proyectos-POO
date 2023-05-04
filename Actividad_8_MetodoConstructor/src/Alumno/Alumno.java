package Alumno;
/**
 * date 20/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class Alumno {
    
    // Constructor Default
    public Alumno(){
        matricula = null;
        nombre = null;
        aPaterno = null;
        aMaterno = null;
        especialidad = null;
        edad = 0;
        estatura = 0;
    }
    
    // Constructor con atributos
    public Alumno(String matricula, String nombre, String aPaterno, 
                String aMaterno, String especialidad, int edad, int estatura){
        this.matricula = matricula;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.especialidad = especialidad;
        this.edad = edad;
        this.estatura = estatura;
    }
      
    // Atributos
    private String matricula;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String especialidad;
    private int edad;
    private int estatura;
    
    // Metodos  
    public void presentarExamen(){
        System.out.println("Hola soy un Alumno y estoy presentando un examen");
    }
    public void estudiar(){
        System.out.println("Hola soy un Alumno y estoy estudiando");
    }
    public void copiar(){
        System.out.println("Hola soy un Alumno y estoy copiando");
    }
    public void hacerTarea(){
        System.out.println("Hola soy un Alumno y estoy haciendo tarea");
    }
    public void aprender(){
        System.out.println("Hola soy un Alumno y estoy aprendiendo");
    }
    public void asistirAClases(){
        System.out.println("Hola soy un Alumno y estoy asistiendo a clase");
    }
    
    public void saludar(){
        System.out.println("Hola soy " + nombre + " " + aPaterno + " " + aMaterno
                + " con matricula: " + matricula + " y especialidad: " + especialidad
                + ", tengo " + edad + " años y mi estatura es de: " + estatura + "cm.");
    }
}
