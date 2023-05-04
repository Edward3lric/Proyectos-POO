/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplications;
import java.util.Scanner;
public class kevin {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int piso, puerta;
        piso = 1;
        
        System.out.println("BRASIL CAMPEON DEL MUNDO FUCHIBOL");
        System.out.println("Japon le ganara a brasil en cuartos");
        
        System.out.println("Estas en el piso: " + piso);
        do{
            System.out.println("0---mantenimiento");
            System.out.println("1---piso 1");
            System.out.println("2---piso 2");
            System.out.println("3---piso 3");
            System.out.println("4---Piso 4");
            System.out.println("5---abrir puerta");
            System.out.println("6---cerrar puerta");
            switch(piso){
                case 0:
                    System.out.println("llendo al piso de mantenimiento");
                    break;
                case 1:
                    System.out.println("llendo al piso 1");
                case 2:
                    System.out.println("lendo al piso 2");
                    break;
            }
        }
        while(1 == 1);
    } 
}
