/*
	Title     : Matriks
	deskripsi : Menampilkan penjumlahan dan perkalian dua matriks dalam 1 file java
*/

package com.perkalian.matriks;
import java.util.Scanner;

public class PerkalianMatriks {
    
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);

    	System.out.println("\n Program penjumlahan dan perkalian Matriks");
    	System.out.println("-------------------------------------------");

    	// matriks berdimensi dua (m x n) di mana m = n = 3
    	System.out.print("Masukkan orde matriks : ");
    	int ordeMatriks = userInput.nextInt();

    	int[][] matriks1 = new int[ordeMatriks][ordeMatriks];
    	int[][] matriks2 = new int[ordeMatriks][ordeMatriks];

    	// mengintruksi user untuk mengimputkan tiap-tiap element
    	System.out.println();
    	// memasukkan entri matriks 1
    	for (int i = 0; i < matriks1.length; i++) {

    		for (int j = 0; j < matriks1[i].length; j++) {
    			int indexBaris = i + 1;
    			int indexKolom = j + 1;

    			System.out.print("Masukkan element matriks A pada baris ke "+indexBaris+" kolom ke "+indexKolom+" : ");
    			matriks1[i][j] = userInput.nextInt();
    		}
    	}

    	System.out.println("-------------------------------------------");

    	// memasukkan entri matriks 2
    	for (int i = 0; i < matriks1.length; i++) {

    		for (int j = 0; j < matriks1[i].length; j++) {
    			int indexBaris = i + 1;
    			int indexKolom = j + 1;

    			System.out.print("Masukkan element matriks B pada baris ke "+indexBaris+" kolom ke "+indexKolom+" : ");
    			matriks2[i][j] = userInput.nextInt();
    		}
    	}

    	// menambahkan dua matriks dan menyetaknya di monitor
    	int[][] hasil = jumlahMatriks(matriks1, matriks2);
    	System.out.println("\n Penjumlahan Matriks");
    	cetakHasil(matriks1, matriks2, hasil, '+');
    }

    // fungsi menjumlahkan dua matriks
    public static int[][] jumlahMatriks(int[][] matriks1, int[][] matriks2) {
    	int[][] hasil = new int[matriks1.length][matriks1[0].length];

    	for (int i = 0; i < hasil.length; i++) {
    		for (int j = 0; j < hasil[0].length; j++) {
    			hasil[i][j] = matriks1[i][j] + matriks2[i][j];
    		}
    	}

    	return hasil;
    }

    //  fungsi mancetak hasil ke monitor
    public static void cetakHasil(int[][] matriks1, int[][] matriks2, int[][] matriks3, char op) {
    	for (int i = 0; i < matriks1.length; i++) {
    		/*-----------------------------------------------------*/
    		for (int j = 0; j < matriks1.length; j++) {
    			System.out.print(" " + matriks1[i][j]);
    			if (i == matriks1.length/2) {
    				System.out.print(" "+ op +"");
    			}else {
    				System.out.print("  ");
    			}
    		}
    		/*-----------------------------------------------------*/
    		for (int j = 0; j < matriks2[0].length; j++) {
    			System.out.print("  "+ matriks2[i][j]);
    			if (i == matriks1.length/2) {
    				System.out.print(" =");
    			}else {
    				System.out.print(" ");
    			}
    		}
    		/*-----------------------------------------------------*/
    		for (int j = 0; j < matriks3[0].length; j++) {
    			System.out.print(" " + matriks3[i][j]);
    		}

    		System.out.println();
    	}
    }
}
