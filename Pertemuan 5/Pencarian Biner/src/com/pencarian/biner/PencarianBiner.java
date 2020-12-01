package com.pencarian.biner;
import java.util.*;

public class PencarianBiner {
    
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	int[] deretanTerurut = new int[10];

    	System.out.println("\nPROGRAM PENCARIAN BINER");
    	System.out.println("------------------------");

    	System.out.print("Deretan bilangan terurut       : ");
    	for (int i = 1; i < deretanTerurut.length; i++) {
    		deretanTerurut[i] = 2 * i + 1;
    	}

    	System.out.println(Arrays.toString(deretanTerurut));

    	System.out.print("Masukkan kunci                 : ");
    	int kunci = userInput.nextInt();

    	int indexElemen = cariKunci(kunci, deretanTerurut);
    	tampil(indexElemen);
    	
    }

    public static void tampil(int indexElemen) {
        if(indexElemen != -1) {
            System.out.println("Kunci di temukan pada index ke : " + indexElemen);
        }else {
            System.out.println("Kunci tidak di temukan pada deret ini");
        }
    }

    public static int cariKunci(int kunci, int[] deretanTerurut) {
    	int indexTerkecil = 0;
    	int indexTerbesar = deretanTerurut.length - 1;

    	return cariKunci(kunci, deretanTerurut, indexTerkecil, indexTerbesar);
    }

    public static int cariKunci(int kunci, int[] deretanTerurut, int indexTerkecil, int indexTerbesar) {

    	if(indexTerkecil > indexTerbesar){
    		return - 1;
    	}

    	int indexTengah = (indexTerkecil + indexTerbesar) / 2;
    	
    	if(kunci  < deretanTerurut[indexTengah]) {
    		return cariKunci(kunci, deretanTerurut, indexTerkecil, indexTengah - 1);
    	}else if(kunci == deretanTerurut[indexTengah]) {
    		return indexTengah;
    	}else {
    		return cariKunci(kunci, deretanTerurut, indexTengah + 1, indexTerbesar);
    	}
    }
}
