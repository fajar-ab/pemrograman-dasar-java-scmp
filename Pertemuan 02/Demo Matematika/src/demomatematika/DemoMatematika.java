/**
 * Title      : Progaram Demo Matematika - Pertemuan 2
 * Deskripsi  : Mengenal konsep OOP dengan mengenal beberapa perhitungan
 *              matematika sederhana
 */

package demomatemetika;

class Matematika {
    // Mndeklarasikan variable kelass
    private double hasil;

    // Method penjumlahan
    public double jumlah(double a, double b) {
        hasil = a + b;
        return hasil;
    }

    // Method pengurangan
    public double kurang(double a, double b) {
        hasil = a - b;
        return hasil;
    }

    // Method perkalian
    public double kali(double a, double b) {
        hasil = a * b;
        return hasil;
    }

    // Method pembagian
    public double bagi(double a, double b) {
        hasil = a / b;
        return hasil;
    }
    
}

public class DemoMatematika {
    /** MAIN METHOD */
    public static void main(String[] args) {
        // Mendeklarasikan data
        double a = 100.0; double b = 3.0;
        double hasilJumalah, hasilKurang, hasilKali, hasilBagi;

        // Membuat objek "hitung" dari kelas Matematika
        Matematika hitung = new Matematika();
        hasilJumalah = hitung.jumlah(a, b);
        hasilKurang = hitung.kurang(a, b);
        hasilKali = hitung.kali(a, b);
        hasilBagi = hitung.bagi(a, b);

        // Mencetak hasil di console
        System.out.println("\nPROGRAM DEMO OPERASI MATEMATIKA");
        System.out.println("----------------------------------");

        System.out.println("Penjumlahan " + a + " + " + b + " = " + hasilJumalah);
        System.out.println("Pengurangan " + a + " - " + b + " = " + hasilKurang);
        System.out.println("Perkalian   " + a + " * " + b + " = " + hasilKali);
        System.out.println("Pembagian   " + a + " / " + b + " = " + hasilBagi);
    }
}
