/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bab15soal2;

/**
 *
 * @author heida
 */
import classtugas.Kalkulator;

public class KalkulatorKali {

    public static void main(String[] args) {
        Kalkulator objek = new Kalkulator();

        float a = 6.0f;
        float b = 7.0f;

        System.out.println("Perkalian (" + a + " * " + b + "): " + objek.perkalian(a, b));
    }
}
