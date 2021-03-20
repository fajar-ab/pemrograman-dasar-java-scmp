package com.panjang.string;

public class PanjangString {
    
    public static void main(String[] args) {
    	String A = "Pemograman Berbasis Objek";
    	String B = "Rekayasa Perangkat Lunak";
    	String C, D, E;

    	C = "Sistem Informasi";
    	D = "STMIK Citara MAndiri";
    	E = "Padangsidimpuan";

    	int nA = A.length();
    	int nB = B.length();
    	int nC = C.length();

    	System.out.println(A+ " --> Panjang String : " + nA);
    	System.out.println(B+ " --> Panjang String : " + nB);
    	System.out.println(C+ " --> Panjang String : " + nC);
    	System.out.println(D+ " --> Panjang String : " + D.length());
    	System.out.println(E+ " --> Panjang String : " + E.length());

    }
}
