package com.program;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int gajiPegawai = 2000000;
		long omset;
		double totalGaji, bonus = 0d;

		System.out.println("\nPROGRAM BOMUS KARIAWAN\n");

		System.out.print("Ketikkan omset kariawan : Rp ");
		omset = userInput.nextInt();

		if(omset >= 100000000) {
			bonus = (double)omset * 0.01;
		}

		totalGaji = gajiPegawai + bonus;

		System.out.println("----------------------");
		System.out.printf("Total Gaji : Rp %,.2f", totalGaji);
	}
}