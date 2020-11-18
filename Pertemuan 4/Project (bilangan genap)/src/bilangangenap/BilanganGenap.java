package bilangangenap;
import java.util.Scanner;

public class BilanganGenap {
    
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	int bil = 2;
    	int i = 0;

    	System.out.println("\nPROGRAM MENAMPILKAN BILANGAN GENAP");
    	System.out.println("-----------------------------------");

    	System.out.print("\nMasukkan berapa banyak : ");
    	int n = userInput.nextInt();

    	System.out.println("\nMenampilakan "+ n +" bilangan genap pertama");

    	while(i < n) {

    		System.out.print(bil + " ");
    		bil += 2;

    		i++;
    	}
    }
}
