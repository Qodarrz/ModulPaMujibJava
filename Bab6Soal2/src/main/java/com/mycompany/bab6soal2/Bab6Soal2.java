/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab6soal2;

import java.util.Scanner;

public class Bab6Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NIM ? ");
        int nim = input.nextInt();

        input.nextLine(); // Membersihkan newline di buffer

        System.out.print("Nama ? ");
        String nama = input.nextLine();

        System.out.print("Nilai ? ");
        double nilai = input.nextDouble();

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Grade A");
        } else if (nilai >= 75 && nilai < 85) {
            System.out.println("Grade B");
        } else if (nilai >= 50 && nilai < 75) {
            System.out.println("Grade C");
        }

        if (nilai >= 50) {
            System.out.println("Lulus");
        } else if (nilai < 50) {
            System.out.println("Tidak Lulus");
        }
    }
}

