package arreglos_bidimensionales;

import javax.swing.JOptionPane;

public class Arreglos_Bidimensionales {
    
    public static void main(String[] args) {
        int tamanio_columna = Integer.parseInt(JOptionPane.showInputDialog(
                "Escribe un tamaño para la columna"));
        int tamanio_filas = Integer.parseInt(JOptionPane.showInputDialog(
                "Escribe un tamaño para las filas"));
        
        int matriz1[][] = new int [tamanio_filas][tamanio_columna];
        int matriz2[][] = new int [tamanio_filas][tamanio_columna];
        int resultado[][] = new int [tamanio_filas][tamanio_columna];
        
        for (int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[0].length; j++){
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Escriba el valor para la fila " + i + " y columna " + j + " de la matriz 1"));
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Escriba el valor para la fila " + i + " y columna " + j + " de la matriz 2"));
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        JOptionPane.showMessageDialog(null, "Matriz 1");
        muestraMatriz(matriz1);
        JOptionPane.showMessageDialog(null, "Matriz 2");
        muestraMatriz(matriz2);
        JOptionPane.showMessageDialog(null, "El resultado de la matiz 1 y de la matriz 2 es de: ");
        muestraMatriz(resultado);
    }
    
    public static void muestraMatriz(int[][] matriz) {
        String res = "";
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j< matriz[0].length; j++){
                res += matriz[i][j] + " ";
            }
            res += "\n";
        }
        JOptionPane.showMessageDialog(null, res);
    }
}
