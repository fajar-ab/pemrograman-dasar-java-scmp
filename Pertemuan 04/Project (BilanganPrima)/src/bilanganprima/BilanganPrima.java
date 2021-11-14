/**
 * Title      : Program Bilangan Prima - Pertemuan 4
 * Deskripsi  : Program Bilangan Prima, mengaplikesikan beberapa elemen kendali 
 *              (while, for, if) untuk mencars bilangan prima.     
 */

package bilanganprima;

import java.util.Scanner;

public class BilanganPrima {
    
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);

    	// Counter penghitung bilangan prima
    	int counter = 1;

    	int bilangan = 2;
    	/**
    	* Menentukan bilangan yang akan diperiksa, apakah
    	* merupakan bilangan prima atau bukan.
    	* 
    	* Variabel ini diinisialisasikan dengan 2 karena
    	* merupakann bilangan prima pertama.
    	*
    	* Selanjutnya bilangan ini akan diupdate dengan
    	* bilangan berikutnya (3, 4, 5, ...)
    	* 
    	*/

    	boolean testPrima = true;
    	/**
    	* Kondisi yang akan menyatakan suatu bilangan
    	* sebagai prima atau bukan
    	*/

    	System.out.println("\nPROGRAM MENCARI N BILANGAN PRIMA PERTAMA");
    	System.out.println("-----------------------------------------");

    	/**
    	* Menginstruksikan user untuk memasukkan jumlah bilangan prima 
    	* yang akan di cari
    	*/
    	System.out.print("Masukkan jumlah bilangan prima : ");
    	int jumBilPrima = userInput.nextInt();

    	System.out.println("\nMencari "+ jumBilPrima +" Bilangan prima pertama");

    	/**
    	* Blok yang mengulang pemeriksaan bila bilangan yang baru
    	* adalah bilangan prima
    	*/
    	while(counter <= jumBilPrima) {

    		// Mengasumsikan suatu bilangan merupakan bilangan prima
    		testPrima = true;

    		/**
    		* Mereset testPrime menjadi false, bila bilangan tersebut
    		* ternyata bukan bilangan prima
    		*/
    		for (int pembagi = 2; pembagi <= bilangan / 2; pembagi++) {

    			// Jika bernilai benar, maka bilangan bukan prima
    			if(bilangan % pembagi == 0) {
    				testPrima = false;

    				break;
    				// Keluar dari blok perulangan for
    			}
    		}

    		// Mencetak bilangan prima dan menambahkan counter
    		if(testPrima) {
    			if(counter % 10 == 0) 

    				//Mencetak bilangan prima
    				System.out.println(bilangan);
    			else 
    				System.out.print(bilangan + " ");
					
    				//Menambankan satu ke counter
					counter++;
    		}

    		// Memeriksa apakah bilangan selanjutnya merupakan Prima
    		bilangan++;
    	}
    }
}
