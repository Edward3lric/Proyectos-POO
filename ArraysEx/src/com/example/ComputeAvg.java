/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        
        // Crear el objeto scanner
        Scanner read = new Scanner(System.in);

        // Crear array para puntos
        double[] points = new double[5];
        // Crear variables
        double sum = 0, average;
        
        // Ciclo for para ingresar calificaciones
        for(int i = 0; i < points.length; i++){
            System.out.println("Ingrese la calificacion " + (i + 1));
            points[i] = read.nextInt();
        }
        
        // Ciclo foreach para imprimir los valores y sumarlos
        System.out.print("- ");
        for(double point : points){
            System.out.print(point + " - ");
            sum += point;
        }
        
        // Calcular el promedio
        average = sum / points.length;
        
        // Imprimir el promedio
        System.out.println("\nEl promedio es de: " + average);
    }
}
