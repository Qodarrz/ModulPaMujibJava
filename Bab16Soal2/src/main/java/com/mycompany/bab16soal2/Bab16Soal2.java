/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab16soal2;

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

    protected abstract double hitung();
}

class Penjumlahan extends OperasiAritmatika {

    public Penjumlahan(double A, double B) {
        super(A, B);
    }

    @Override
    protected double hitung() {
        return A + B;
    }
}

class Pengurangan extends OperasiAritmatika {

    public Pengurangan(double A, double B) {
        super(A, B);
    }

    @Override
    protected double hitung() {
        return A - B;
    }
}

class Perkalian extends OperasiAritmatika {

    public Perkalian(double A, double B) {
        super(A, B);
    }

    @Override
    protected double hitung() {
        return A * B;
    }
}

class Pembagian extends OperasiAritmatika {

    public Pembagian(double A, double B) {
        super(A, B);
    }

    @Override
    protected double hitung() {
        if (B == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol.");
        }
        return A / B;
    }
}

public class Bab16Soal2 {

    public static void main(String[] args) {
        double A = 9.5;
        double B = 2.5;

        OperasiAritmatika penjumlahan = new Penjumlahan(A, B);
        OperasiAritmatika pengurangan = new Pengurangan(A, B);
        OperasiAritmatika perkalian = new Perkalian(A, B);
        OperasiAritmatika pembagian = new Pembagian(A, B);

        System.out.println("Penjumlahan: " + penjumlahan.hitung());
        System.out.println("Pengurangan: " + pengurangan.hitung());
        System.out.println("Perkalian: " + perkalian.hitung());
        System.out.println("Pembagian: " + pembagian.hitung());
    }
}
