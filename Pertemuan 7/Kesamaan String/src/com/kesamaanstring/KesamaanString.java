package com.kesamaanstring;

public class KesamaanString {
    
    public static void main(String[] args) {
    	String A = "Laboratorium Komputasi dan Sistem Cerdas";
    	String B = "LABORATORIUM KOMPUTASI DAN SISTEM CERDAS";

    	String C, D, E;

    	C = "Laboratorium Komputasi Sistem Cerdas";
    	D = "LABORATORIUM KOMPUTASI DAN SISTEM CERDAS";
    	E = "Laboratorium Komputasi dan Sistem Cerdas";

    	boolean tes1, tes2, tes3;

    	tes1 = A.equals(B);
    	tes2 = (A == C);
    	tes3 = A.equals(E);

    	System.out.println("["+A+"]"+" == "+"["+B+"]"+" --> " + tes1);
    	System.out.println("["+A+"]"+" == "+"["+C+"]"+" --> " + tes2);
    	System.out.println("["+A+"]"+" == "+"["+E+"]"+" --> " + tes3);
    	System.out.println("["+B+"]"+" == "+"["+D+"]"+" --> " + B.equals(D));
    	System.out.println("["+C+"]"+" == "+"["+E+"]"+" --> " + (C == E));
    }
}