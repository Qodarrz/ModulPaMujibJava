/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab8soal2;

import java.util.Scanner;

/**
 *
 * @author heida
 */
public class Bab8Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai Awal : ");
        int a = input.nextInt();

        System.out.print("Nilai Akhir : ");
        int b = input.nextInt();

        for (int i = a; i >= b; i --) {
            System.out.println("Hasil : " + i);

        }
    }
}
