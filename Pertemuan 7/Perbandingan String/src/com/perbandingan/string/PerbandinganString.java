package com.perbandingan.string;

public class PerbandinganString {
    
    public static void main(String[] args) {
    	String[] nama = {"Soekarno","Soeharto","Habibie","Gusdur","Megawati","SBY","Jokowi"};
    	String semetara;
    	int n = nama.length;

    	System.out.println("Dafrar nama sebelum diurutkan");
    	for (int i = 0; i < n; i++) {
    		System.out.println((i+1) + ". " + nama[i]);
    	}

    	for (int i = 0; i < n - 1; i++) {
    		for (int j = i + 1; j < n - 1; j++) {
    			if(nama[i].compareTo(nama[j]) > 0) {
    				semetara = nama[i];
    				nama[i] = nama[j];
    				nama[j] = semetara;
     			}
    		}
    	}

    	System.out.println("Dafrar nama setelah diurutkan");
    	for (int i = 0; i < n; i++) {
    		System.out.println((i+1) + ". " + nama[i]);
    	}
    }
}
