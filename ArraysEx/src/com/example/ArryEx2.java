/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class ArryEx2 {
    
    public static void main(String args[]) {
        // Array de tres posiciones de tipo string
        String[] browsers = new String[3];
        // Try para intentar guardar los navegadoes
        try {
            browsers[0] = "explorer";
            browsers[1] = "chrome";
            browsers[2] = "opera";
            browsers[3] = "firefox";
        }
        // Atrapar excepciones de fuera de indice
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }
        // Imprimir el largo del array
        System.out.println("size of array: " + browsers.length);
        
        // ciclo foreach para imprimir los exploradores
        for(String browser : browsers){
            System.out.println("Explorador: " + browser);
        }
    }
}
