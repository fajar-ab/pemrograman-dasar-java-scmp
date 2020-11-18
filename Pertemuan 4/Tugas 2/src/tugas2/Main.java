/*
	Tugas 2 - program rata-rata bilangan positif, dimana banyaknya data
	          ditentukan dari data yang dimasukkan dengan keyboard.
*/
package tugas2;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	int n;
    	double jumlah = 0, data, hasil;

    	System.out.print("Banyaknya data : ");
    	n = userInput.nextInt();
    	System.out.println("\n--------------------");

    	for (int i = 1; i <= n; i++) {
    		
    		System.out.print("Masukkan data ke-"+i+" : ");
    		data = userInput.nextDouble();
    		
    		if(data < 0){
    			continue;
    		} else {
    			jumlah += data;
			}
    	}

    	hasil = jumlah / n;

		System.out.println("--------------------");
    	System.out.println("Jumah : " + hasil);
    }
}
