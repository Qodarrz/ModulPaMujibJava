/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab15soal1;

/**
 *
 * Author: heida
 */
public class kalkulator {
    
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public float pembagian(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Tidak bisa melakukan pembagian dengan nol");
        }
    }

    public float perkalian(float a, float b) {
        return a * b;
    }

    public static void main(String args[]) {
        kalkulator obj = new kalkulator();
        System.out.println(obj.pertambahan(10, 20));
    }
}
