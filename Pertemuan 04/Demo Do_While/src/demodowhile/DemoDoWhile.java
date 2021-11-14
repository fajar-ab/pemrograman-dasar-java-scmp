/**
 * Title      : Program Demo Do..While
 * Deskripsi  : Mendemonstrasikan pemakaian perulangan do..while untuk
 *              mencetak statement ke console sebanyak n kali.           
 */

package demodowhile;

public class DemoDoWhile {
    
 	public static void main(String[] args) {
 		// inisialisasi counter
 		int counter = 0;

 		System.out.println("\nProgram Demo Do...While");
 		System.out.println("------------------------");

 		// memberikan perintah untuk dikerjakan jika kondisi dipenuhi
 		do {
 			System.out.println("Mengecek counter ke-" + counter);

			 // menambahkan nilai counter persetiap loop denga 1
 			counter++;

		// menyatakan "counter <= 5" sebagi kondisi perulangan	 
 		}while(counter <= 5);
 	}
}