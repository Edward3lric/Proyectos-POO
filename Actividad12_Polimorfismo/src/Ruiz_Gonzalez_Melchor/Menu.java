package Ruiz_Gonzalez_Melchor;

/**
 * date 13/03/2023
 * @author h4lof
 */
public class Menu {
    public static void main(String[] args) {
        // Creamos objetos aplicando polimorfismo
        Vehiculo v = new Vehiculo("Honda", "Civic", 60000);
        System.out.println(v.mostrarDatos());
        
        Vehiculo car = new Carro(2, "Ford", "Bronco", 350000);
        System.out.println(car.mostrarDatos());
        
        Vehiculo moto = new Motocicleta(600, "Kawasaky", "NinjaH2", 400000);
        System.out.println(moto.mostrarDatos());
    }
}
