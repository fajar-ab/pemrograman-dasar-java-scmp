// Program Demo Continue - Pertemuan 4

package democontinue;

public class DemoContinue {
    
    public static void main(String[] args) {
    	int counterDiabaikan = 0;

    	System.out.println("\nPROGRAM DEMO CONTINUE");
    	System.out.println("----------------------");

    	for(int counter = 1; counter <= 5; counter++) {
    		if(counter == 3) {
    			counterDiabaikan = counter;
    			continue;
    		} else {
    			System.out.println("Mengecek counter ke-" + counter);
    		}
    	}

    	System.out.println("\nPerulangan telah di hentikan oleh 'continue' pada counter ke-" + counterDiabaikan);
    }
}
