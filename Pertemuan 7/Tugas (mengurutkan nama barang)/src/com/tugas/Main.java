package com.tugas;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
    	// daftar barang 
    	String[] barang = {
    		"Keyboard",
    		"Hardisk",
    		"Mouse",
    		"Laptop",
    		"Flashdisk",
    		"Cpu",
    		"Vga card",
    		"Ram",
    		"Motherboard",
    		"Cooling",
    		"Pad"
    	};

    	System.out.println("Daftar Barang - Toko Komputer");
    	System.out.println("-----------------------------");

    	// mengurutkan daftar barang dari a - z
    	Arrays.sort(barang);

    	// menampilkan daftar barang dan ubah menjadi huruf besar
    	for (String i : barang) {
    		System.out.println("- " + i.toUpperCase());
    	}
    }
}
