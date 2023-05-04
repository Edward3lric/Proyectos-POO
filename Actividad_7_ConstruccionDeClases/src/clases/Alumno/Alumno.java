package clases.Alumno;
/**
 * Date 08/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class Alumno {
    private String matricula;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String especialidad;
    private int edad;
    private int estatura;
    
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
    public void asistirAClase(){
        System.out.println("Hola soy un Alumno y estoy asistiendo a clase");
    }
    
    public void Saludar(){
        System.out.println("Hola soy un Alumno y mi matricula es " + matricula + ", mi nombre es "
            + nombre + " " + aPaterno + " " + aMaterno + ", mi especialidad es " + especialidad
            + ", tengo " + edad + " años y mido " + estatura + "cm");
    }
    
    
    // Metodos Get
    public String getMatricula(){
        return matricula;
    }
    public String getNombre(){
        return nombre;
    }
    public String getAPaterno(){
        return aPaterno;
    }
    public String getAMaterno(){
        return aMaterno;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public int getEdad(){
        return edad;
    }
    public int getEstatura(){
        return estatura;
    }
    
    // Metodos Set
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setAPaterno(String aPaterno){
        this.aPaterno = aPaterno;
    }
    public void setAMaterno(String aMaterno){
        this.aMaterno = aMaterno;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setEstatura(int estatura){
        this.estatura = estatura;
    }
}
