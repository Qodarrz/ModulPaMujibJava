/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab14soal1;
/**
 *
 * @author heida
 */
abstract class AbstrakHewan {

    public abstract void suara();

    public void suara2() {
        System.out.println("Ini metode konkrit dari parent class");
    }
}

class Kucing extends AbstrakHewan {

    @Override
    public void suara() {
        System.out.println("Meow");
    }
}

class Anjing extends AbstrakHewan {

    @Override
    public void suara() {
        System.out.println("Woof");
    }
}

public class Bab14soal1 {

    public static void main(String[] args) {

        AbstrakHewan kucing = new Kucing();
        kucing.suara();
        kucing.suara2();

        AbstrakHewan anjing = new Anjing();
        anjing.suara();
        anjing.suara2();
    }
}
