/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab7soal2;

import java.util.Scanner;

/**
 *
 * @author heida
 */
public class Bab7Soal2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("NIM : ");
        int nim = input.nextInt();

        input.nextLine(); // Membersihkan newline di buffer

        System.out.print("NAMA : ");
        String nama = input.nextLine();

        System.out.print("TAHUN : ");
        int tahun = input.nextInt();

        System.out.print("PILIH PEMINATAN : ");
        char peminatan = input.next().charAt(0);

        switch (tahun) {
            case 1:
                System.out.println("Bahasa Inggris, Matematika, Sain");
                break;
            case 2:
                switch (peminatan) {
                    case 'C':
                        System.out.println("Sistem Operasi, Pemrograman Java, Struktur Data");
                        break;
                    case 'E':
                        System.out.println("Algoritma, Logika Informatika");
                        break;
                    case 'M':
                        System.out.println("DBMS,Manajemen Proyek ");
                        break;
                }
                break;
            case 3:
                switch (peminatan) {
                    case 'C':
                        System.out.println("Organisasi Komputer, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Perancangan Sistem, Pemrograman WEB");
                        break;
                    case 'M':
                        System.out.println("Pemrograman Mobile, Pemrograman Java 2");
                        break;
                }
                break;
            case 4:
                switch (peminatan) {
                    case 'C':
                        System.out.println("Komunikasi Data, MultiMedia");
                        break;
                    case 'E':
                        System.out.println(" Sistem Terdistribusi , Image Processing");
                        break;
                    case 'M':
                        System.out.println("SIM , SistemJaringan ");
                        break;
                }
                break;
        }
    }
}
