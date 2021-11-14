/**
 * Title      : Program Demo while - Pertemuan 4
 * Deskripsi  : Mendemonstrasikan pemakaian perulangan While untuk
 *              mencetak statement ke console sebanyak n kali.        
 */

package demowhile;

public class DemoWhile {
    
    public static void main(String[] args) {

		// inisialisai counter
    	int counter = 0; 

    	System.out.println("\nDEMO PROGRAM UNTUK WHILE");
    	System.out.println("-------------------------");

    	// menyatakan "counter <= 5" sebagi kondisi perulangan
    	while(counter <= 5) {
    		System.out.println("Mencetak counter ke-" + counter);

			// menambahkan nilai counter persetiap loop denga 1
    		++counter;
    	}
    }
}
