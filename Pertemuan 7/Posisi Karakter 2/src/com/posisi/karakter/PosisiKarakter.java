package com.posisi.karakter;

public class PosisiKarakter {

	public static void main(String[] args) {
		String a = "Labolatorium Komputasi dan Sistem Cerdas";

		System.out.println("Karakter s terletak pada posisi ke: " + a.indexOf('s'));
		System.out.println("Karakter a terletak pada posisi ke: " + a.indexOf('a'));
		System.out.println("Karakter v terletak pada posisi ke: " + a.indexOf('v'));

		System.out.println("Setelah posisi ke-10, karakter s terletak pada " + a.indexOf('s', 10));
		System.out.println("Setelah posisi ke-10, karakter a terletak pada " + a.indexOf('a', 10));
	}
}