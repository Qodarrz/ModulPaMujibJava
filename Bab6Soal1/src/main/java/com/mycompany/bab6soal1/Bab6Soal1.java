/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab6soal1;

import java.util.Scanner;

/**
 *
 * @author heida
 */
public class Bab6Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NIM ? ");
        int nim = input.nextInt();

        System.out.print("Nama ? ");
        String nama = input.nextLine();

        input.nextLine();

        System.out.print("Nilai ? ");
        double Nilai = input.nextInt();

        if (Nilai >= 85 && Nilai < 100) {
            System.out.println("grade A ");
        } else if (Nilai >= 75 && Nilai < 84) {
            System.out.println("grade B ");
        } else if (Nilai >= 0 && Nilai < 75) {
            System.out.println("grade C ");

        }
    }
}
