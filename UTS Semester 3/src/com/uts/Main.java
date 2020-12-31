package com.uts;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		char merkIkan;
		show();
		System.out.println("\n\nSTMIK Citra Mandiri Minimarket\n");
		System.out.println(".----------------------. .----------------------. .----------------------.");
		System.out.println("| A. SARDEN            | | B. BALANAK           | | C. DENDENG           |");
		System.out.println("|    1. Ukuran Kecil   | |    1. Ukuran Kecil   | |    1. Ukuran Kecil   |");
		System.out.println("|    2. Ukuran Sedang  | |    2. Ukuran Sedang  | |    2. Ukuran Sedang  |");
		System.out.println("|    3. Ukuran Besar   | |    3. Ukuran Besar   | |    3. Ukuran Besar   |");
		System.out.println("'----------------------' '----------------------' '----------------------'");

		System.out.print("\nMasukkan Merk Ikan [Sarden | Balanak | Dendeng] : ");
		merkIkan = userInput.next().charAt(0);

		if(merkIkan == 'A' || merkIkan == 'a') {
			sarden();
		}else if(merkIkan == 'B' || merkIkan == 'b') {
			balanak();
		}else if(merkIkan == 'C' || merkIkan == 'c') {
			dendeng();
		}else {
			System.out.println("Input Yang Anda Masukkan Salah");
		}
	}

	public static void sarden(){
		Scanner userInput = new Scanner(System.in);
		int ukuran, hargaSatuan;

		System.out.print("Ukuran Kaleng Ikan [Kecil|Sedang|Besar]         : ");
		ukuran = userInput.nextInt();
		
		switch(ukuran) {
			case 1:
				hargaSatuan = 25000;
				total(hargaSatuan);
				break;
			case 2:
				hargaSatuan = 30000;
				total(hargaSatuan);
				break;
			case 3:
				hargaSatuan = 45000;
				total(hargaSatuan);
				break;
			default:
				System.out.println("Imput anda salah");
		}

	}

	public static void balanak(){
		Scanner userInput = new Scanner(System.in);
		int ukuran, hargaSatuan;

		System.out.print("Ukuran Kaleng Ikan [Kecil|Sedang|Besar]         : ");
		ukuran = userInput.nextInt();
		
		switch(ukuran) {
			case 1:
				hargaSatuan = 20000;
				total(hargaSatuan);
				break;
			case 2:
				hargaSatuan = 25000;
				total(hargaSatuan);
				break;
			case 3:
				hargaSatuan = 30000;
				total(hargaSatuan);
				break;
			default:
				System.out.println("Imput anda salah");
		}

	}

	public static void dendeng(){
		Scanner userInput = new Scanner(System.in);
		int ukuran, hargaSatuan;

		System.out.print("Ukuran Kaleng Ikan [Kecil|Sedang|Besar]         : ");
		ukuran = userInput.nextInt();
		
		switch(ukuran) {
			case 1:
				hargaSatuan = 30000;
				total(hargaSatuan);
				break;
			case 2:
				hargaSatuan = 35000;
				total(hargaSatuan);
				break;
			case 3:
				hargaSatuan = 40000;
				total(hargaSatuan);
				break;
			default:
				System.out.println("Imput anda salah");
		}

	}

	public static void total(int harga) {
		Scanner userInput = new Scanner(System.in);
		int jumlah, totalHarga;

		System.out.printf("Harga Satuan Barang                             : Rp %,d", harga);
		System.out.print("\nJumlah Yang Di Beli                             : ");
		jumlah = userInput.nextInt();

		totalHarga = jumlah * harga;
		System.out.printf("Harga Yang Harus Di Bayar Sebesar               : Rp %,d", totalHarga);
	}

	public static void show(){
		char[] a = {78,97,109,97,32,58,32,70,97,106,97,114,32,70,97,100,105,108,97,104};
		char[] b = {78,73,77,32,32,58,32,50,48,49,57,48,49,48,48,49,50};
		for(char nama: a){
			System.out.print(nama);
		}
		System.out.println();
		for(char nim : b) {
			System.out.print(nim);
		}
	}
}
