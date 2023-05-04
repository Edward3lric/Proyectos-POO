package Alumno;
/**
 * date 20/02/2023
 * @author Melchor Ruiz Gonzalez
 */
public class PruebaAlumno {
    public static void main(String[] args) {
        
        // Crear instancia
        Alumno alumno1 = new Alumno("22001418", "Melchor", 
                "Ruiz", "González", "DSM", 18, 
                170);
        
        // Ejecutar metodos
        alumno1.presentarExamen();
        alumno1.estudiar();
        alumno1.copiar();
        alumno1.hacerTarea();
        alumno1.aprender();
        alumno1.asistirAClases();
        
        alumno1.saludar();
    }
}
