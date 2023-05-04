package MetodoFinal;
/**
 * Date 13/03/2023
 * @author h4lof
 */
public final class ClaseFinal {
    private int x, y;
    
    public ClaseFinal(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    final void imprimirCuadrante(){
        System.out.println("[" + x + ", " + y + "]");
        
        if (x > 0 && y > 0){
            System.out.println("Se encuentra en el primer cuadrante");
        } else if (x < 0 && y > 0){
            System.out.println("Se encuentra en el segundo cuadrante");
        } else if (x < 0 && y < 0){
            System.out.println("Se encuentra en el tercer cuadrante");
        } else if (x > 0 && y < 0){
            System.out.println("Se encuentra en el cuarto cuadrante");
        } else {
            System.out.println("El punto no se encuentra en el cuadrante");
        }
    }
    
    public static void main(String[] args) {
        ClaseFinal punto1;
        punto1 = new ClaseFinal(5, 8);
        punto1.imprimirCuadrante();
        ClaseFinal punto2;
        punto2 = new ClaseFinal(-3, -5);
        punto2.imprimirCuadrante();
    }
}
