/**
 * Title      : Program Demo Break - Pertemuan 4
 * Deskripsi  : Mendemostrasikan pemakaian break untuk menghentikan
 *              perulangan    
 */

package demobreak;

public class DemoBreak {
    
    public static void main(String[] args) {
    	int counter = 0;

    	System.out.println("\nPROGRAM DEMO BREAK");
    	System.out.println("-------------------");

    	while(counter < 100) {
    		counter++;

			// jika kondisi di bawah terpenuhi, hentikan perulangan
    		if(counter == 7) break; 
    	}

    	System.out.println("Counter terakhir adalah: " + counter);
    }
}
