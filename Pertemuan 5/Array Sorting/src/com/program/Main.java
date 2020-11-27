package com.program;

public class Main {
    
    public static void main(String[] args) {
    	int[] deretBilangan = new int[10];

    	System.out.println("\nPROGRAM MENGURUTKAN ELEMEN ARRAY");
    	System.out.println("--------------------------------");

    	System.out.println("Deretan bilangan random sebelum di urutkan");
    	for (int i = 0; i < deretBilangan.length; i++) {
    		deretBilangan[i] = (int)(Math.random()*100);
    		System.out.print(deretBilangan[i] + " ");
    	}
    	System.out.println();

    	sorting(deretBilangan);

    	System.out.println();
    	System.out.println("Deretan bilangan setelah di urutkan ");
    	cetakDeretan(deretBilangan);
    }

    public static void cetakDeretan(int[] deretan) {
    	for (int i = 0; i < deretan.length; i++) {
    		System.out.print(deretan[i] + " ");
    	}
    }

    public static void sorting(int[] deretan) {
    	int nilaiMax;
    	int indexNilaiMax;

    	for (int i = deretan.length-1; i >=1 ; i--) {
    		nilaiMax = deretan[i];
    		indexNilaiMax = i;
    		for (int j = i-1; j >= 0; j--) {
    			if (nilaiMax < deretan[j]) {
    				nilaiMax = deretan[j];
    				indexNilaiMax = j;
    			}
    		}

    		if (indexNilaiMax != i) {
    			deretan[indexNilaiMax] = deretan[i];
    			deretan[i] = nilaiMax;
    		}
    	}
    }
}
