package com.penggabungan.string;

public class PenggabunganString {
    
    public static void main(String[] args) {
    	String a, b, c;
    	a = "Laboratorium ";
    	b = "Komputasi ";
    	c = "Sistem Cerdas";

    	String lab1 = a + b;
    	System.out.println("- " + lab1);

    	String lab2 = a + b + "dan " + c;
    	System.out.println("- " + lab2);

    	// menggunakan method concat()
    	String lab3 = lab1.concat(c);
    	System.out.println("- " + lab3);

    }
}
