package com.percobaan2;

import java.text.DecimalFormat;

public class Encapsulation {

	public static void main(String[] args) {
		
		// Mengeset tampilan hasil menjadi dua digit desimal
		DecimalFormat digitPresisi = new DecimalFormat("0.00");

		System.out.println("\nDEMO ENCAPSULASI");
		System.out.println("----------------");

		/* Membuat instans dari kelas hitungGaji untuk satu
		   pegawai, dan memanggil methd-methodnya  
		*/
		
		HitungGaji tony = new HitungGaji();
		tony.setGaji(2500000);
		tony.hitungGaji();

		System.out.println("Informasi Gaji Pegawai");
		System.out.println("\nBesar Gaji Kotor : " + digitPresisi.format(tony.getGajiKotor()));
		System.out.println("\nBesar Gaji yang dibawa plang : " + digitPresisi.format(tony.getGajiBersih()));

		// atau bisa pilih output di console seperti ini
		// ---------------------------------------------------------------------------------
		// System.out.printf("\nBesar Gaji Kotor             : %,.2f", tony.getGajiKotor());
		// System.out.printf("\nBesar Gaji yang dibawa plang : %,.2f", tony.getGajiBersih());
		// ---------------------------------------------------------------------------------
	}
}

class HitungGaji  {
	/*	Mendeklarasikan variabel-variabel internal kelas hitungGaji
		variabel potongan menyatakn dan untuk Asuransi kesehatan
		(Akses, iuran koperasi, cicilan kendaraan dan sebagainya)
		haya variabel gajiKotor dan gaji bersih yang dapat di akses
		oleh "lingkungan luar"
	*/

	private double gajiKotor, gajiSetelahPajak;
	public double gajiBersih;
	private double potongan = 75000.00d;

	public void setGaji(double gaji) {
		gajiKotor = gaji;
	}

	// Method untuk menghitung gaji bersih
	public void hitungGaji() {
		gajiSetelahPajak = gajiKotor - (0.2 * gajiKotor);
		gajiBersih = gajiSetelahPajak - potongan;
	}

	// Method yang mengembalikan gaji kotor
	public double getGajiKotor() {
		return gajiKotor;
	}

	// Method yang mengembalikan besar gaji bersih
	public double getGajiBersih() {
		return gajiBersih;
	}
}