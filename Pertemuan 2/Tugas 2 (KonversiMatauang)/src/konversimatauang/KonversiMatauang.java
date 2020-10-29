package konversimatauang;

import java.util.*;

class MataUang {

	double rupiah, dolar;

	public double konversiDolar(double nilaiRupiah) {
		dolar = nilaiRupiah * 0.000068d;
		return dolar;
	}

	public double konversiRupiah(double nilaiDolar) {
		rupiah = nilaiDolar * 14764.35d;
		return rupiah;
	}

}
class KonversiMatauang {

public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		double nilaiRupiah, nilaiDolar, hasilRupiah, hasilDolar;
	
		System.out.println("\nKONVERSI NILAI MATA UANG DOLAR DAN RUPIAH");

		// System.out.print("Masukkan nilai Rupiah : ");
		// nilaiRupiah = userInput.nextDouble(); 
		// System.out.print("Masukkan nilai Dolar  : ");
		// nilaiDolar = userInput.nextDouble();

		nilaiRupiah =  1.0d;
		nilaiDolar  =  1.0d; 

		MataUang nilai = new MataUang();

		hasilDolar = nilai.konversiDolar(nilaiRupiah);
		hasilRupiah = nilai.konversiRupiah(nilaiDolar);

		System.out.println("\nKonversi .........\n");
		System.out.printf("Rp. %f = USD. %f\n",nilaiRupiah, hasilDolar);
		System.out.printf("USD. %f = Rp. %f", nilaiDolar, hasilRupiah);

	} 
    
}
