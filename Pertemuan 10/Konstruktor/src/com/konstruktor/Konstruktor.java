package com.konstruktor;

public class Konstruktor {

	public static void main(String[] args) {
		
		Konstruk kon = new Konstruk();
		kon.Show();
	}
}

class Konstruk {

	public int A, B;

	public Konstruk() {
		System.out.println("=============================");
		System.out.println("=        Constructor        =");
		System.out.println("=============================");
		System.out.println("\n\n");

		A = B = 10;
	}

	protected void Finalize() {
		System.out.println("Finalizing.....");
	}

	public void Show(){
		System.out.println("Nilai A = " + A);
		System.out.println("Nilai B = " + B);

		System.out.println("\nHasil Perkalian = " + A * B);
	}
}
