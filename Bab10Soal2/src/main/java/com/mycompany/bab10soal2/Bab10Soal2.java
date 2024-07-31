/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab10soal2;

/**
 *
 * @author heida
 */
public class Bab10Soal2 {

    public static void main(String[] args) {
        Bab10Soal2Part aritmatikaku = new Bab10Soal2Part();
        int bilangan1 = 10;
        int bilangan2 = 5;

        System.out.println("Bilangan 1 = " + bilangan1);
        System.out.println("Bilangan 2 = " + bilangan2);

        // Pengurangan
        System.out.println("Hasil Pengurangan = " + aritmatikaku.pengurangan(bilangan1, bilangan2));

        // Perkalian
        System.out.println("Hasil Perkalian = " + aritmatikaku.perkalian(bilangan1, bilangan2));

        // Pembagian
        try {
            System.out.println("Hasil Pembagian = " + aritmatikaku.pembagian(bilangan1, bilangan2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Pangkat
        System.out.println("Hasil Pangkat = " + aritmatikaku.pangkat(bilangan1, bilangan2));
    }
}
