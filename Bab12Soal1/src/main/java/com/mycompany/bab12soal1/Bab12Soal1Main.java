/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bab12soal1;
/**
 *
 * @author heida
 */
class Employee {

    protected double gaji;
    protected double bonus;
    protected double tunjanganMakan;
    protected double transport;

    public Employee(double gaji, double bonus, double tunjanganMakan, double transport) {
        this.gaji = gaji;
        this.bonus = bonus;
        this.tunjanganMakan = tunjanganMakan;
        this.transport = transport;
    }

    public void display() {
        System.out.println("Gaji System Analyst: " + gaji);
        System.out.println("Bonus: " + bonus);
        System.out.println("Tunjangan Makan: " + tunjanganMakan);
        System.out.println("Transport: " + transport);
    }
}

class Manager extends Employee {

    public Manager(double gaji, double bonus, double tunjanganMakan, double transport) {
        super(gaji, bonus, tunjanganMakan, transport);
    }

    public double kalkulasiGajiTotal() {
        return gaji + bonus + tunjanganMakan + transport;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Gaji Total: " + kalkulasiGajiTotal());
    }
}

public class Bab12Soal1Main {

    public static void main(String[] args) {
        Manager manager = new Manager(4000000, 1000000, 400000, 500000);
        manager.display();
    }
}
