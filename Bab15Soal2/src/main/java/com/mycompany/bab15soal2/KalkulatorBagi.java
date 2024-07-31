package com.mycompany.bab15soal2;

import classtugas.Kalkulator;

public class KalkulatorBagi {

    public static void main(String[] args) {
        Kalkulator objek = new Kalkulator();

        float a = 40.0f;
        float b = 10.0f;

        System.out.println("Pembagian (" + a + " / " + b + "): " + objek.pembagian(a, b));
    }
}
