package com.uas;

public class Stock {
	
    String nama;
	int stock, hargaSatuan;

	Stock(String nama, int stock, int hargaSatuan) {
		this.nama = nama;
		this.stock = stock;
		this.hargaSatuan = hargaSatuan;
	}

	public void tampilDaftar()  {
		System.out.println("Nama         : " + nama);
		System.out.println("Stock        : " + stock);
		System.out.printf("Harga Satuan : Rp. %,d\n", hargaSatuan);
		System.out.printf("Total Harga  : Rp. %,d\n\n", totalHarga());
	}

	public int totalHarga(){
		return stock * hargaSatuan;
	}
}
