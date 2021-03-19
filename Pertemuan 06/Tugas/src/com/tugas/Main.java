package com.tugas;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	int i=0, total=0, maksimal=0, minimal=0, input;

    	ArrayList<Integer> angka = new ArrayList<Integer>();

    	System.out.println("Masukkan dafrar nilai matematika Mahasiswa !");
    	System.out.println("Untuk berhenti masukkan data, ketikkan 0 (nol)\n");

    	do {
    		System.out.print("Mahasiswa ke-"+(i+1)+" : ");
    		input = userInput.nextInt();

    		if(input != 0) {
    			angka.add(input);
    		}

    		i++;
    	}while(input > 0);

    	for(int j = 0; j < i-1; j++) {
    		if(maksimal < angka.get(j)) {
    			maksimal = angka.get(j);
    		}
    		if(minimal == 0) {
    			minimal = angka.get(j);
    		}
    		if(minimal > angka.get(j)) {
    			minimal = angka.get(j);
    		}
    	}

    	System.out.println("\nNilai matematika tertinggi adalah " + maksimal);
    	System.out.println("Nilai matematika terendah adalah  " + minimal);
    }
}