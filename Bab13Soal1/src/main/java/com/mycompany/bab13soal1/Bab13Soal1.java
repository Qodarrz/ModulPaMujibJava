/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab13soal1;
/**
 *
 * @author heida
 */
class CalculatorSederhana {

    int tambah(int a, int b) {
        return a + b;
    }

    int kurang(int a, int b) {
        return a - b;
    }

    int perkalian(int a, int b) {
        return a * b;
    }

    int pembagian(int a, int b) {
        return a / b;
    }
}

public class Bab13Soal1 {

    public static void main(String args[]) {
        CalculatorSederhana objek = new CalculatorSederhana();
        System.out.println(objek.tambah(10, 20));
        System.out.println(objek.kurang(10, 20));
        System.out.println(objek.perkalian(10, 20));
        System.out.println(objek.pembagian(10, 20));
    }

}
