/*
	Tugas 1 - program untuk menampilkan bilangan ganjil dari 100 - 186
*/

package tugas1;

public class Main {
    
    public static void main(String[] args) {
		int bil = 101;

		System.out.println("\nMENAMPILKAN BILANGAN GANJIL 100 - 186");
		System.out.println("--------------------------------------");

		for (int i = 1; i <= 100; i++) {
			
			System.out.println(bil);
			bil += 2;

			if(bil > 186) {
				break;
			}
		}
    }
}
