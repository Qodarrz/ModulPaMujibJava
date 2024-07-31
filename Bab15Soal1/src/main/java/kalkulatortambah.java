import com.mycompany.bab15soal1.kalkulator;

public class kalkulatortambah {

    public static void main(String[] args) {
        kalkulator objek = new kalkulator();

        int a1 = 10;
        int b1 = 30;
        int a2 = 50;
        int b2 = 20;
        float a3 = 40.0f;
        float b3 = 10.0f;
        float a4 = 6.0f;
        float b4 = 7.0f;

        System.out.println("Pertambahan (" + a1 + " + " + b1 + "): " + objek.pertambahan(a1, b1));

        System.out.println("Pengurangan (" + a2 + " - " + b2 + "): " + objek.pengurangan(a2, b2));

        System.out.println("Pembagian (" + a3 + " / " + b3 + "): " + objek.pembagian(a3, b3));

        System.out.println("Perkalian (" + a4 + " * " + b4 + "): " + objek.perkalian(a4, b4));
    }
}
