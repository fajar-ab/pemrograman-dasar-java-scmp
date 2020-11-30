package com.contoh6;
import java.util.*;

public class Contoh6 {
    
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	int i=0, total=0, maksimal=0, minimal=0, input;

    	ArrayList<Integer> angka = new ArrayList<Integer>();

    	do {
    		System.out.println("Masukkan angka untuk data ke-"+(i+1)+" [ketikka 0 (nol) untuk stop]");
    		input = userInput.nextInt();

    		if(input != 0) {
    			angka.add(input);
    		}

    		i++;
    	}while(input > 0);

    	for(int j = 0; j < i-1; i++) {

    		total = total + angka.get(j);

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

    	System.out.println("Nilai total adalah  " + total);
    	float rata = total / (i + 1);

    	System.out.println("Nilai rata-rata adalah  " + rata);
    	System.out.println("Nilai maksimal adalah  " + maksimal);
    	System.out.println("Nilai minimal adalah  " + minimal);
    }
}
