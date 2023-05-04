package MetodoVirtual;

public class MetodoVirtual {
    public static void main(String[] args) {
        
        Animal leon = new Leon();
        
        leon.movilidad();
        leon.nacer();
        
        Animal aguila = new Aguila();
        
        aguila.movilidad();
        aguila.nacer();
        
        Animal ballena = new Ballena();
        
        ballena.movilidad();
        ballena.nacer();
    }
}
