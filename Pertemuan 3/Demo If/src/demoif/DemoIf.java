package demoif;
import java.util.Scanner;

public class DemoIf {
    
    // Methot utama
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);

    	System.out.println("\nPROGRAM IF");
    	System.out.println("-----------");

    	// imput nilai 
    	System.out.print("Masukkan nilai 0 - 100 : ");
    	double nilaiinput = userInput.nextDouble();

    	// seleksi kondisi dan cetak ke console
    	if(nilaiinput >= 60) {
    		System.out.println("\nSelamat anda lulus mata kuliah ini !!");
    	}
    }
}
