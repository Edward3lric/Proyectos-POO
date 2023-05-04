/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class ArrayEx1 {

    public static void main(String args[]) {
        
        // Array de 5 posiciones de tipo entero
        int[] score = new int[9];
        // Array de 10 posiciones de tipo byte con valores de 1
        byte[] values = {1,1,1,1,1,1,1,1,1,1};
        // Verificar que el tamaño sea 10
        System.out.println(values.length);
        
        // Array de 20 posiciones de tipo entero
        int[] primeNum = new int[20];
        // Array de 5 posiciones de tipo entero
        int[] even=new int[5];
        
        // Array de 20 posiciones de tipo long
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);
        
    }
}
