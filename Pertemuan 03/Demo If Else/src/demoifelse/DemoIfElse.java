// Program Demo If Else - Pertemuan 3s

package demoifelse;
import java.util.Scanner;

public class DemoIfElse {

	// METHOD UTAMA
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		double nilaiInput;

		System.out.println("\nPEROGRAM DEMO IF ELSE");
		System.out.println("----------------------\n");

		// input nilai dari user
		System.out.print("Masukkan Nilai [0 - 100] : ");
		nilaiInput = userInput.nextDouble();

		// seleksi nilai range
		if((nilaiInput < 0) || (nilaiInput > 100)) {
			System.out.println("\nData yang di input Invalid !");
		}else {

			// menyeleksi kondisi
			if(nilaiInput >= 60) {

				System.out.println("\nSelamat, anda lulus mata " + "kuliah ini.");

				if(nilaiInput >= 85) {
					System.out.println("\nNilai anda : A");

				}else if(nilaiInput >= 70) {
					System.out.println("\nNilai anda : B");

				}else if(nilaiInput >= 60) {
					System.out.println("\nNilai anda : C");

				}
			// jika seleksi kondisi bernilai false jalankan:
			}else {

				System.out.println("\nMaaf, Anda harus mengulang " +
					     "mata kuliah ini kemali, atau mengikuti " +
					     "ujian perbaikan dengan nilai maksimun C");
			}
		}

	}
}