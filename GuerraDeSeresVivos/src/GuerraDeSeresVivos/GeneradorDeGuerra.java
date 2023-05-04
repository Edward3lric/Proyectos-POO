package GuerraDeSeresVivos;
/**
 * @author: Melchor Ruiz Gonzalez
 * Date: 31/03/2023
 * Program goal: Create a game of plants vs zombies with arrays 
 */
public class GeneradorDeGuerra {
    // Variable para indicar el tamaño de los ejercitos
    int tamanioEjercitos = 10;
    // Arreglo de objetos de tipo zombi
    private Zombi ejercitoDeZombies[] = new Zombi[tamanioEjercitos];
    // Arreglo de objetos de tipo planta
    private Planta ejercitoDePlantas[] = new Planta[tamanioEjercitos];
    
    public void crearEjercito(){
        // Se itera o recorre el arreglo de plantas
        for (int i = 0; i < ejercitoDePlantas.length; i++){
            // Se crea un objeto planta y se almacena en cada
            // Possicion del arreglo
            ejercitoDePlantas[i] = new Planta(1.3f, "Flor", true, "Planta " + i);
        }
        for (int i = 0; i < ejercitoDeZombies.length; i++){
            // Se crea un objeto zombie y se almacena en cada
            // posicion del arreglo
            ejercitoDeZombies[i] = new Zombi("Verde", 1.7f, true, "Zombi " + i);
        }
    }
    public void pelear(){
        // Se recorren los objetos de los ejercitos
        for (int i = 0; i < tamanioEjercitos; i++){
            // Inician matando los zombies, donde primero se verifica
            // Que este vivo para poder matar
            if (ejercitoDeZombies[i].getVivo() == true){
                // Genera aleatoriamente la victima a la que matara
                int victima = ejercitoDeZombies[i].matar();
                // Se le dice a la planta que sera victima que se muera
                ejercitoDePlantas[victima].morir();
            }
            // Si no esta vivo solamente se manda un mensaje diciendo que
            // ya esta muero y no puede matar
            else{
                System.out.println(ejercitoDeZombies[i].getNombre() 
                        + " no puedo matar porque ya estoy muerto");
            }
            // Ahora las plantas van a matar, para esto verificamos que la planta esté 
            // viva, si esta viva matara un zombie
            if (ejercitoDePlantas[i].getVivo() == true){
                // Genera aleatoriamente la victima a la que matara
                int victima = ejercitoDePlantas[i].matar();
                // Se le dice al zombie que sera victima que se muera
                ejercitoDeZombies[victima].morir();
            }
            // Si no esta vivo solamente se manda un mensaje diciendo que
            // ya esta muerto y no puede matar
            else{
                System.out.println(ejercitoDePlantas[i].getNombre() 
                        + " no puedo matar porque ya estoy muerto");
            }
        }
    }
    
    public void obtenerGanador(){
        // Variables para almacenar los zombies vivos
        int zombiesVivos = 0;
        // Variables para almacenar las plantas vivos
        int plantasVivas = 0;
        // Iteramos el arreglo de plantas para contar las plantas vivas
        for(int i = 0;i < ejercitoDePlantas.length; i++){
            // Si la planta esta viva incrementamos el contador de plantas vivas
            if(ejercitoDePlantas[i].getVivo() == true){
                plantasVivas++;
            }
        }
        for(int i = 0;i < ejercitoDeZombies.length; i++){
            // Si el zombi esta vivo incrementamos el contador de zombies vivas
            if(ejercitoDeZombies[i].getVivo() == true){
                zombiesVivos++;
            }
        }
        // Si el contador de plnaras vivas es igual al contador de zombies vivos
        // fue un empata
        if (plantasVivas == zombiesVivos){
            System.out.println("Empate");
        }
        else if (plantasVivas > zombiesVivos){
            System.out.println("Ganan las plantas");
        }
        else{
            System.out.println("Ganan los zombies");
        }
    }     
}
