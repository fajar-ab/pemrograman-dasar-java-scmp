package com.program1;
import java.util.Scanner;

// @autor Fajar_Fadilah

public class Tugas {
    
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	int x, y;

    	System.out.print("Masukkan Nilai pertama : ");
    	x = input.nextInt();
    	System.out.print("Masukkan Nilai kedua   : ");
    	y = input.nextInt();

    	System.out.println("=======================");

    	System.out.println("Hasil Perhitungan : ");

    	Operasi akhir = new Operasi(x, y);

    	System.out.println("Hasil Penjumlahan : " + akhir.getNilaiPenjumlahan());
        System.out.println("Hasil Pengurangan : " + akhir.getNilaiPenjumlahan());
        System.out.println("Hasil Perkalian   : " + akhir.getNilaiPenjumlahan());
        System.out.println("Hasil Pembagian   : " + akhir.getNilaiPenjumlahan());
    }
}
