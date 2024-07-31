/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab5soal2;

import java.util.Scanner;

/**
 *
 * @author heida
 */
public class Bab5Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tinggi Segitiga:");
        double tinggi = input.nextInt();

        System.out.print("Alas Segitiga:");
        double alas = input.nextInt();

        double hasil = tinggi * alas / 2;
        
        System.out.print("Hasil Yang Didapatkan Dari Perhitungan Diatas Dengan Tinggi Sebesar "
                + tinggi + " Dan Dikali Alas Sebesar " + alas + " Dan Dibagi 2, Yaitu Sebesar " + hasil);
    }
}
