package com.kompersi.karakter;

public class KonversiKarakter {
    
    public static void main(String[] args) {
    	String kalimat = "Labolatorium Komputasi dan Sistem Cerdas";
    	String besar;
    	String kecil;

    	// ubah kalimat dengan huruf besar semua
    	besar = kalimat.toUpperCase();
    	// ubah kalimat dengan huruf kecil semua
    	kecil = kalimat.toLowerCase();

    	System.out.println("Kalimat awal          : " + kalimat);
    	System.out.println("Diubah ke huruf besar : " + besar);
    	System.out.println("Diubah ke huruf besar : " + kecil);
    }
}
