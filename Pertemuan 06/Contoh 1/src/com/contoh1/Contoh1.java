package com.contoh1;

public class Contoh1 {
    
    public static void main(String[] args) {
    	int[] penjualan = {100,120,112,132,105,122,108,121,122,130,125,125};

    	int n = penjualan.length;

    	for(int i = 0; i < n; i++) {
    		System.out.println("Penjualan ke-"+ i +" = "+ penjualan[i]);
    	}
    }
}
