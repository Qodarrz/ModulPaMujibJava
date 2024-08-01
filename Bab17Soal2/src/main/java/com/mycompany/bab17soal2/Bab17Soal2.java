/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab17soal2;

/**
 *
 * @author heida
 */
public class Bab17Soal2 {

    public static void main(String[] args) {

        String[][] negaraDanIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        for (int i = 0; i < negaraDanIbukota.length; i++) {
            String negara = negaraDanIbukota[i][0];
            String ibukota = negaraDanIbukota[i][1];
            System.out.println("Ibukota " + negara + " adalah " + ibukota);
        }
    }
}
