/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab8soal1;

import java.util.Scanner;

/**
 *
 * @author heida
 */
public class Bab8Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai Awal : ");
        int a = input.nextInt();

        System.out.print("Nilai Akhir : ");
        int b = input.nextInt();

        for (int i = a; i <= b; i += 5) {
            System.out.println("Hasil : " + i);

        }
    }
}
