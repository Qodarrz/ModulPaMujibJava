/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab13soal2;

/**
 *
 * @author heida
 */
class LuasSegitiga {

    int tambah(int a, int b, int c) {
        return a * b / c;
    }
}

public class Bab13Soal2 {

    public static void main(String args[]) {
        LuasSegitiga objek = new LuasSegitiga();
        System.out.println(objek.tambah(10, 20, 2));
    }

}
