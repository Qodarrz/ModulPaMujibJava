/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab5soal1;

/**
 *
 * @author heida
 */
import java.util.Scanner;

public class Bab5Soal1 {

    public static void main(String[] args) {
        System.out.println("Pendataan Karyawan PT. Petani Kode");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Karyawan:");
        String name = input.nextLine();
        
        System.out.print("Alamat:");
        String alamat = input.nextLine();
        
        System.out.print("Usia:");
        String usia = input.nextLine();
        
        System.out.print("Gaji:");
        String gaji = input.nextLine();

        System.out.println("Nama Karyawan : " + name);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia + " Tahun");
        System.out.println("Gaji : Rp " + gaji);

    }
}
