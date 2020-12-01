// Program Array Searching - Pertemuan 5

package array.searching;
import java.util.Scanner;

public class ArraySearching {
    
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	int[] deretan = new int[10];

    	System.out.println("\nPROGRAM PENCARIAN LINIER");
    	System.out.println("------------------------");

    	System.out.print("Deretan bilangan     : ");
    	for(int i = 0; i < deretan.length; i++){
    		deretan[i] = (int)(Math.random()*100);
    		System.out.print(deretan[i] + " ");
    	}

    	System.out.println();

    	System.out.print("Masukan kunci        : ");
    	int kunci = userInput.nextInt();
    	int index = cariKunci(kunci, deretan);

    	if(index != -1){
    		System.out.println("Kunci ditemukan pada : " + index);
    	}else {
    		System.out.println("Kunci tidak di temukan pada deretan bilangan");
    	}
    }

    public static int cariKunci(int kunci, int[] deretan) {
    	for(int i = 0; i < deretan.length; i++) {
    		if(kunci == deretan[i]) {
    			return i;
    		}
    	}
    	return -1;
    }
}

