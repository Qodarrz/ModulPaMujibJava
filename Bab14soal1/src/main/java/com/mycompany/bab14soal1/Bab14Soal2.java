/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bab14soal1;

/**
 *
 * @author heida
 */
public class Bab14Soal2 {

    public static void main(String[] args) {

        AbstrakHewan burung = new Burung();
        burung.suara();
    }

    public static class Burung extends AbstrakHewan {

        @Override
        public void suara() {
            System.out.println("Suara Burung mencicit");
        }
    }
}
