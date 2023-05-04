/* Si a, b y c son variables enteras con valores a=8, b=3, c=-5, 
 * determina el valor de las siguientes expresiones aritméticas:
 * a) a + b + c
 * b) 2 * b + 3 * (a – c)
 * c) a / b
 * d) a % b
 * e) a / c
 * f) a % c
 * g) a * b / c
 * h) a * (b / c)
 * i) (a * c) % b
 * j) a * (c % b)
 * k) (3 * a – 2 * b) % (2 * a – c)
 * l) 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2)
 * m) (a - 3 * b) % (c + 2 * a) / (a - c)
 * n) a - b - c * 2 */

package A2_Aspectos_Lexicos;
/**
 * Fecha 18/01/2023
 * Ultima modificación: 18/01/2023
 * @author Melchor Ruiz Gonzalez
 */

public class OperadoresAritmeticos1 {
    public static void main(String[] args) {
        
        // Declarar las variables
        float a = 8;
        float b = 3;
        float c = -5;
        
        // Imprimir los resultados de cada operacion
        System.out.println("a) a + b + c = " + (a + b + c) + 
                "\nb) 2 * b + 3 * (a - c) = " + (2 * b + 3 * (a - c)) +
                "\nc) a / b = " + (a / b) +
                "\nd) a % b = " + (a % b) +
                "\ne) a / c = " + (a / c) +
                "\nf) a % c = " + (a % c) +
                "\ng) a * b / c = " + (a * b / c) +
                "\nh) a * (b / c)= " + (a * (b / c)) +
                "\ni) (a * c) % b = " + ((a * c) % b) +
                "\nj) a * (c % b) = " + (a * (c % b)) +
                "\nk) (3 * a - 2 * b) % (2 * a - c) = " + ((3 * a - 2 * b) % (2 * a - c)) +
                "\nl) 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2) = " + (2 * ( a / 5 + (4 - b * 3)) % (a + c - 2)) +
                "\nm) (a - 3 * b) % (c + 2 * a) / (a - c) = " + ((a - 3 * b) % (c + 2 * a) / (a - c)) +
                "\nn) a - b - c * 2" + (a - b - c * 2)
        );
        
    }
}
