package com.posisi.karakter;

import java.util.Random;

public class PosisiKarakter {
    
    public static void main(String[] args) {
    	String a = "Laboratorium Komputer dan Sistem Cerdas";

    	Random ran = new Random();

    	for(int i = 1; i <= 10; i++) {
    		int ke = ran.nextInt(a.length());
    		if(a.charAt(ke) == ' '){
    			System.out.println("karakter ke-"+ke+" = spasi");
    		}else {
    			System.out.println("karakter ke-"+ke+" = "+a.charAt(ke));
    		}
    		
    	}
    }
}
