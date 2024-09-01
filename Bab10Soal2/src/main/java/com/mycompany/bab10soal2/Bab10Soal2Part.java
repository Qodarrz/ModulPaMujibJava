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

    //penjumlaha
    public int tambah(int a, int b) {
        return a + b;
    }

    //pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    //perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    //pembagian
    public int pembagian(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diizinkan");
        }
    }

    //pangkat
    public int pangkat(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
