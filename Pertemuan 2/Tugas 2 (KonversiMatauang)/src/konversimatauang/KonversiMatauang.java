package konversimatauang;

import java.util.*;

class MataUang {

	double rupiah, dolar;

	public double konversiDolar(double nilaiRupiah) {
		dolar = nilaiRupiah * 0.0068;
		return dolar;
	}

	public double konversiRupiah(double nilaiDolar) {
		rupiah = nilaiDolar * 14764.35;
		return rupiah;
	}

}

public class KonversiMatauang {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		double nilaiRupiah, nilaiDolar, hasilRupiah, hasilDolar;

		System.out.println("\nKONVERSI NILAI MATA UANG DOLAR DAN RUPIAH");

		// System.out.print("Masukkan nilai Rupiah : ");
		// nilaiRupiah = userInput.nextDouble(); 
		// System.out.print("Masukkan nilai Dolar  : ");
		// nilaiDolar = userInput.nextDouble();

		nilaiRupiah =  1.0;
		nilaiDolar  =  1.0; 

		MataUang nilai = new MataUang();

		hasilDolar = nilai.konversiDolar(nilaiRupiah);
		hasilRupiah = nilai.konversiRupiah(nilaiDolar);

		System.out.println("\nKonversi .........\n");
		System.out.println("Rp. " + nilaiRupiah + " = USD. " + hasilDolar);
		System.out.println("USD. " + nilaiDolar + " = Rp. " + hasilRupiah);

	} 
    
}
