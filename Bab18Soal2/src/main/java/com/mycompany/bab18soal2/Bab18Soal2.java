/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab18soal2;

/**
 *
 * @author heida
 */
class Bab18Soal2 {

    public static void main(String args[]) {
        try {
            // Kode di bawah ini tidak akan melempar exception
            Float data = 500 / 15f;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Blok finally akan selalu dieksekusi.");
        }
    }
}
