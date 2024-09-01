/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab11soal1;

import java.util.Scanner;

public class Bab11Soal1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data karyawan 1:");
        System.out.print("ID Karyawan: ");
        int id1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama Karyawan: ");
        String nama1 = scanner.nextLine();

        System.out.print("Golongan: ");
        String gol1 = scanner.nextLine();

        System.out.print("Jabatan: ");
        String jabatan1 = scanner.nextLine();

        System.out.print("Gaji Pokok: ");
        double gaji1 = scanner.nextDouble();

        Bab11Soal1 karyawan1 = new Bab11Soal1(id1, nama1, gol1, jabatan1, gaji1);

        System.out.println("\nMasukkan data karyawan 2:");
        System.out.print("ID Karyawan: ");
        int id2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nama Karyawan: ");
        String nama2 = scanner.nextLine();

        System.out.print("Golongan: ");
        String gol2 = scanner.nextLine();

        System.out.print("Jabatan: ");
        String jabatan2 = scanner.nextLine();

        System.out.print("Gaji Pokok: ");
        double gaji2 = scanner.nextDouble();

        Bab11Soal1 karyawan2 = new Bab11Soal1(id2, nama2, gol2, jabatan2, gaji2);

        System.out.println("\nInformasi Karyawan 1:");
        karyawan1.tampilkanInfo();

        System.out.println("\nInformasi Karyawan 2:");
        karyawan2.tampilkanInfo();
    }
}
