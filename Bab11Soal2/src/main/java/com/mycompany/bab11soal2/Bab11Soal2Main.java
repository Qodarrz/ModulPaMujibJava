/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bab11soal2;

import java.util.Scanner;

/**
 *
 * @author heida
 */
public class Bab11Soal2Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan data karyawan 1
        System.out.println("Masukkan data karyawan 1:");
        System.out.print("ID Karyawan: ");
        int id1 = scanner.nextInt();
        scanner.nextLine();  // Mengonsumsi newline

        System.out.print("Nama Karyawan: ");
        String nama1 = scanner.nextLine();

        System.out.print("Golongan: ");
        String gol1 = scanner.nextLine();

        // Membuat objek karyawan 1
        Bab11Soal2 karyawan1 = new Bab11Soal2(id1, nama1, gol1);

        // Memasukkan data karyawan 2
        System.out.println("\nMasukkan data karyawan 2:");
        System.out.print("ID Karyawan: ");
        int id2 = scanner.nextInt();
        scanner.nextLine();  // Mengonsumsi newline

        System.out.print("Nama Karyawan: ");
        String nama2 = scanner.nextLine();

        System.out.print("Golongan: ");
        String gol2 = scanner.nextLine();

        // Membuat objek karyawan 2
        Bab11Soal2 karyawan2 = new Bab11Soal2(id2, nama2, gol2);

        // Menampilkan informasi karyawan
        System.out.println("\nInformasi Karyawan 1:");
        karyawan1.tampilkanInfo();

        System.out.println("\nInformasi Karyawan 2:");
        karyawan2.tampilkanInfo();
    }
}
