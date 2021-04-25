package com.uas;

public class StockApp {
    
    public static void main(String[] args) {
		
		var alat1 = new Stock("Pobloint", 10, 2000);
		alat1.tampilDaftar();
		int tl1  = alat1.totalHarga();

		var alat2 = new Stock("Pensil", 10, 1000);
		alat2.tampilDaftar();
		int tl2  = alat2.totalHarga();

		var alat3 = new Stock("Penghapus", 10, 500);
		alat3.tampilDaftar();
		int tl3  = alat3.totalHarga();

		int totalKeseluruh = tl1 + tl2 + tl3;
		System.out.printf("Total dari semua \nharga barang : Rp. %,d", totalKeseluruh);
	}
}
