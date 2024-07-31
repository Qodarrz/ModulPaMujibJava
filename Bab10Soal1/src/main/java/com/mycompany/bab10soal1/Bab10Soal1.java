package com.mycompany.bab10soal1;

public class Bab10Soal1 {

    public static class aritmatika {

        int angka;

        void setTambah(int bil1, int bil2) {
            angka = bil1 + bil2;
        }

        int getTambah() {
            return angka;
        }
    }

        public static void main(String[] args) {
            
            aritmatika aritmatikaku = new aritmatika();
            int a = 10, b = 20;
            aritmatikaku.setTambah(a, b);
            System.out.println("Bilangan 1= " + a);
            System.out.println("Bilangan 2= " + b);
            System.out.println("Hasil Pertambahan= " + aritmatikaku.getTambah());
        }
    }

