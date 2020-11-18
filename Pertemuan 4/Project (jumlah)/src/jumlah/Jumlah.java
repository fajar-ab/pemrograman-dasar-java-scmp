package jumlah;
import java.util.Scanner;

public class Jumlah {
    
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	int data, a = 1;
    	double masukkan, jumlah = 0;

    	System.out.print("Banyak data : ");
    	data = userInput.nextInt();

    	while(a <= data) {
    		System.out.print("- Data " + a + " : ");
    		masukkan = userInput.nextInt();
    		a++;

    		jumlah += masukkan;
    	}

    	System.out.println("Jumlah : " + jumlah);
    }
}
