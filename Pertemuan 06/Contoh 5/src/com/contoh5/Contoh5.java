package com.contoh5;
import java.util.Scanner;

public class Contoh5 {
    
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	double[] data = new double[10];
    	int i, jumData;
    	String str;
    	char jawaban;

    	jumData = 0;
    	for(i = 0; i < data.length; i++) {
    		System.out.println("Masukkan sembarang bilangan");
    		data[i] = userInput.nextDouble();
    		userInput.nextLine();

    		if(i < data.length - 2){
    			System.out.println("Memasukkan lagi (Y/T) ? ");
    			str = userInput.nextLine();
    			jawaban = str.charAt(0);

    			if(jawaban == 'T' || jawaban == 't') {
    				jumData = i + 1;
    				break;
    			}
    		}
    	}
    }
}
