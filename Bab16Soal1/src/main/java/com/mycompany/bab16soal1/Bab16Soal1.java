/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab16soal1;

/**
 *
 * @author heida
 */
abstract class OperasiAritmatika {

    protected double A;
    protected double B;

    public OperasiAritmatika(double A, double B) {
        this.A = A;
        this.B = B;
    }

    protected abstract double penjumlahan();

    protected abstract double pengurangan();

    protected abstract double perkalian();

    protected abstract double pembagian();
}

class HitungOperasi extends OperasiAritmatika {

    public HitungOperasi(double A, double B) {
        super(A, B);
    }

    @Override
    protected double penjumlahan() {
        return A + B;
    }

    @Override
    protected double pengurangan() {
        return A - B;
    }

    @Override
    protected double perkalian() {
        return A * B;
    }

    @Override
    protected double pembagian() {
        if (B != 0) {
            return A / B;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
    }
}

public class Bab16Soal1 {

    public static void main(String[] args) {
        double A = 9.5;
        double B = 2.5;

        HitungOperasi operasi = new HitungOperasi(A, B);

        System.out.println("Penjumlahan: " + operasi.penjumlahan());
        System.out.println("Pengurangan: " + operasi.pengurangan());
        System.out.println("Perkalian: " + operasi.perkalian());
        System.out.println("Pembagian: " + operasi.pembagian());
    }
}
