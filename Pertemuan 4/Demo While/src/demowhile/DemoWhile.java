/*
	Title      : Program Demo For
	
	Deskripsi  : Mendemonstrasikan pemakaian perulangan for untuk
	             mencetak statement ke console sebanyak n kali.

*/

package demowhile;

public class DemoWhile {
    
    public static void main(String[] args) {
    	int counter = 0; // inisialisai counter

    	System.out.println("\nDEMO PROGRAM UNTUK WHILE");
    	System.out.println("-------------------------");

    	// perulangan
    	while(counter <= 5) {
    		System.out.println("Mencetak counter ke-" + counter);
    		counter++;
    	}
    }
}
