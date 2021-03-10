package com.tugas.pertemuan8;

public class Main {
    
    public static void main(String[] args) {

		System.out.println("\nTUGAS PERTEMUAN 8");
		System.out.println("-----------------\n");

		// pembeli 1 akan mendapatkan diskon
		HitungHarga pembeli_1 = new HitungHarga();
		pembeli_1.setTotal(8000000, 2500000);
		System.out.printf("- Barang pertama : Rp. %,.2f\n", pembeli_1.barangPertama);
		System.out.printf("- Barang kedua   : Rp. %,.2f\n", pembeli_1.barangKedua);
		System.out.printf("\nTotal yang dibayar Rp. %,.2f", pembeli_1.totalBayar());

		System.out.println("\n");

		// pembeli 2 tidak mendapatkan diskon
		HitungHarga pembeli_2 = new HitungHarga();
		pembeli_2.setTotal(8000000, 500000);
		System.out.printf("- Barang pertama : Rp. %,.2f\n", pembeli_2.barangPertama);
		System.out.printf("- Barang kedua   : Rp. %,.2f\n", pembeli_2.barangKedua);
		System.out.printf("\nTotal yang dibayar Rp. %,.2f", pembeli_2.totalBayar());
	}
}

class HitungHarga {

	public double totalBarang, barangPertama, barangKedua;

	// hitung total dari barang
	public void setTotal(double barang1, double barang2) {
		barangPertama = barang1;
		barangKedua   = barang2;

		totalBarang = barang1 + barang2;
	}

	// kembalikan hasil yang akan di bayar jika total Barang lebih dari 
	// 10 jt dapat diskon 10%
	public double totalBayar(){

		if(totalBarang >= 10000000){
			double diskon = totalBarang * 0.1;
			return totalBarang - diskon;
		}

		return totalBarang;
	}
}