/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bab18soal1;

/**
 *
 * @author heida
 */
public class ThrowMethod {

    public static void main(String[] args) {
        try {

            checkAge(15);
        } catch (Exception e) {

            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Usia harus lebih dari 18 tahun.");
        } else {
            System.out.println("Usia valid.");
        }
    }
}
