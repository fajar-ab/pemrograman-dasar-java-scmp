/*
	Tugas : Membuat program yang dapat menampilkan kepribadian seseorang melalui
	        warna favorit dengan kondisi switch
	Nama  : Fajar Fadilah
*/

package com.tugas;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	int pilih;

    	System.out.println("\nPROGRAM PILIH WARNA FAVORIT");
    	System.out.println("---------------------------\n");

    	System.out.println("Warna Favorit");
    	System.out.println("-------------");
    	System.out.println("1. Merah");
    	System.out.println("2. Pink");
    	System.out.println("3. Hijau");
    	System.out.println("4. Biru");
    	System.out.println("5. Ungu");
    	System.out.println("6. Hitam");
    	System.out.println("7. Putih");
    	System.out.println("8. Coklat");


    	// mengambil input user
    	System.out.print("\nSilahkan Pilih Warna (1 - 8)\npilih : ");
    	pilih = userInput.nextInt();


    	switch(pilih) {
    		case 1:
    			System.out.println("\nMerah.... \n"+
    				               "-----------------------------------------\n"+
    				               " > Berani, percaya diri, teguh pendirian.");
    			break;
    		case 2:
    			System.out.println("\nPink..... \n"+
    				               "-------------------------------\n"+
    				               "> Lemah lebut, baik, penyayang.");
    			break;
    		case 3:
    			System.out.println("Hijau..... \n"+
    				               "--------------------------------\n"+
    				               " > Pencinta alam, sejuk hatinya.");
    			break;
    		case 4:
    			System.out.println("\nBiru......\n"+
    				               "---------------------------------------\n"+
    				               " > Tenang, mudah bergaul, bisa dipercaya.");
    			break;
    		case 5:
    			System.out.println("\nUngu.....\n"+
    				               "-------------------------------------------\n"+
    				               " > Agak kasar, suka hal mistis, bikin repot.");
    			break;
    		case 6:
    			System.out.println("\nHitam.....\n"+
    				               "---------------------------------\n"+
    				               " > Realistis, suka bergaya, pesimis.");
    			break;
    		case 7:
    			System.out.println("\nPutih......\n"+
    				               "------------------------------------\n"+
    				               " > Teliti, polos, ingin menyakinkan.");
    			break;
    		case 8:
    			System.out.println("\nCoklat......\n"+
    				               "---------------------------------------\n"+
    				               " > Sederhana, nyaman, dapat di percaya.");
    			break;
    		default:
    			System.out.println("\nMaaf.....\n"+
    				               "input yang anda masukkan tidak benar\n"+
    				               "pilih warna dari 1 - 8 saja. ");
    	}
    }
}
