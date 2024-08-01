/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab17soal1;

import java.util.Scanner;

/**
 *
 * @author heida
 */
public class Bab17Soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine();

        String[] kotaArray = new String[jumlahKota];

        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kotaArray[i] = scanner.nextLine();
        }

        System.out.println("Kota-kota yang dimasukkan:");
        for (int a = 0; a < kotaArray.length; a++) {
            System.out.println((a + 1) + "." + kotaArray[a]);
        }
    }
}
