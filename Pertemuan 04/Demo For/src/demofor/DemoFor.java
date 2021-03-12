/*
	Title      : Program Demo For
	
	Deskripsi  : Mendemonstrasikan pemakaian perulangan for untuk
	             mencetak statement ke console sebanyak n kali.

*/

package demofor;

public class DemoFor {
    
    public static void main(String[] args) {
    	System.out.println("\nPROGRAM DEMO FOR");
    	System.out.println("-----------------");

    	// perulangan
    	for (int counter = 0; counter <= 5; counter++) {
    		System.out.println("Mencetak Counter ke-" + counter);
    	}
    }
}
