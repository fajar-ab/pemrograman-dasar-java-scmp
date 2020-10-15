package demomatemetika;

class Matematika {
    
    private double hasil;

    public double jumlah(double a, double b) {
        hasil = a + b;
        return hasil;
    }

    public double kurang(double a, double b) {
        hasil = a - b;
        return hasil;
    }

    public double kali(double a, double b) {
        hasil = a * b;
        return hasil;
    }

    public double bagi(double a, double b) {
        hasil = a / b;
        return hasil;
    }
    
}

public class DemoMatematika {

    public static void main(String[] args) {
        double a = 100.0; double b = 3.0;
        double hasilJumalah, hasilKurang, hasilKali, hasilBagi;

        Matematika hitung = new Matematika();
        hasilJumalah = hitung.jumlah(a, b);
        hasilKurang = hitung.kurang(a, b);
        hasilKali = hitung.kali(a, b);
        hasilBagi = hitung.bagi(a, b);

        System.out.println("\nPROGRAM DEMO OPERASI MATEMATIKA");
        System.out.println("----------------------------------");

        System.out.println("Penjumlahan " + a + " + " + b + " = " + hasilJumalah);
        System.out.println("Pengurangan " + a + " - " + b + " = " + hasilKurang);
        System.out.println("Perkalian   " + a + " * " + b + " = " + hasilKali);
        System.out.println("Pembagian   " + a + " / " + b + " = " + hasilBagi);


    }
}
