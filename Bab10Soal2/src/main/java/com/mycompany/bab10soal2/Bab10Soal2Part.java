/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bab10soal2;

/**
 *
 * @author heida
 */
public class Bab10Soal2Part {

    // Method untuk penjumlahan
    public int tambah(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Method untuk pembagian
    public int pembagian(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diizinkan");
        }
    }

    // Method untuk pangkat
    public int pangkat(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
