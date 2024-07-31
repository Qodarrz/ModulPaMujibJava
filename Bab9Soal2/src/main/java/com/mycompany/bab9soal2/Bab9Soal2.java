/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab9soal2;

import java.util.Scanner;

/**
 *
 * @author heida
 */
public class Bab9Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan bilangan awal : ");
        int nilaiAwal = input.nextInt();

        System.out.print("Masukan bilangan akhir : ");
        int nilaiAkhir = input.nextInt();

        System.out.println("Hasil deret bilangan :");
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            if (i > nilaiAwal) {
                System.out.print(", ");
            }
            System.out.print(i);
        }

        input.close();
    }
}

