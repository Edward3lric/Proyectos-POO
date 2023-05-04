package clases.Alumno;
/**
 * Date 10/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class PruebaAlumno {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        
        alumno.presentarExamen();
        alumno.estudiar();
        alumno.copiar();
        alumno.hacerTarea();
        alumno.aprender();
        alumno.asistirAClase();
        
        alumno.setMatricula("22001418");
        alumno.setNombre("Jose Miguel");
        alumno.setAPaterno("Ortiz");
        alumno.setAMaterno("Vazquez");
        alumno.setEspecialidad("Desarrollo de software");
        alumno.setEdad(18);
        alumno.setEstatura(180);
        
        alumno.Saludar();
    }
}
