/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18soal1;

/**
 *
 * @author heida
 */
public class BLokTryCatchMethod {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[10] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        System.out.println("Program tetap berjalan setelah menangani exception.");
    }
}

