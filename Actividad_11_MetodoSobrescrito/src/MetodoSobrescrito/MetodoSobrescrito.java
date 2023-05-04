package MetodoSobrescrito;

class Animal{
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El perro ladra");
    }
}
public class MetodoSobrescrito {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.hacerSonido();
        
        Perro perro = new Perro();
        perro.hacerSonido();
    }
}
