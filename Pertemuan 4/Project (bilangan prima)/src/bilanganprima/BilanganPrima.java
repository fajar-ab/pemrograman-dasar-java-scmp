package bilanganprima;
import java.util.Scanner;

public class BilanganPrima {
    
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	int counter = 1;
    	int bilangan = 2;
    	boolean testPrima = true;

    	System.out.println("\nPROGRAM MENCARI N BILANGAN PRIMA PERTAMA");
    	System.out.println("-----------------------------------------");

    	System.out.print("Masukkan jumlah bilangan prima : ");
    	int jumBilPrima = userInput.nextInt();

    	System.out.println("\nMencari "+ jumBilPrima +" Bilangan prima pertama");

    	while(counter <= jumBilPrima) {

    		testPrima = true;
    		for (int pembagi = 2; pembagi <= bilangan / 2; pembagi++) {
    			if(bilangan % pembagi == 0) {
    				testPrima = false;
    				break;
    			}
    		}

    		if(testPrima) {
    			if(counter % 10 == 0) {
    				System.out.println(bilangan);
    			} else 
    				System.out.print(bilangan + " ");
    			
    			counter++;
    		}

    		bilangan++;
    	}
    }
}
