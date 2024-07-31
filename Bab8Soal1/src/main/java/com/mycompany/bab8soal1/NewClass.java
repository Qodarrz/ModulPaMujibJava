/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab8soal1;

import java.util.Scanner;

/**
 *
 * @author heida
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai Awal : ");
        int a = input.nextInt();

        System.out.print("Nilai Akhir : ");
        int b = input.nextInt();
        
        System.out.print("Pengulangan : ");
        int c = input.nextInt();

        for (int i = a; i <= b; i += c) {
            System.out.println("Hasil : " + i);

        }
    }
}
