/**
 * Title      : Program Demo If - Pertemuan 3
 * Deskripsi  : Menggunakan if untuk menyeleksi nilai ujian.             
 */

package demoif;
import java.util.Scanner;

public class DemoIf {
    
    /** MAIN METHOD */
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);

    	System.out.println("\nPROGRAM IF");
    	System.out.println("-----------");

    	// Menginstruksikan user untuk menginputkan nilai
    	System.out.print("Masukkan nilai 0 - 100 : ");
    	double nilaiinput = userInput.nextDouble();

    	// Menyeleksi kondisi dan cetaknya ke console
    	if(nilaiinput >= 60) {
    		System.out.println("\nSelamat anda lulus mata kuliah ini !!");
    	}
    }
}
