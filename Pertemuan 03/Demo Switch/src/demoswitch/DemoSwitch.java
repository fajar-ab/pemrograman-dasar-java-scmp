/**
 * Title      : Program Demo Switch - Pertemuan 3
 * Deskripsi  : Menggunakan Switch untuk menyeleksi jadwal kuliah
 *              mahasiswa.
 */

package demoswitch;
import java.util.Scanner;

public class DemoSwitch {
    
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);

    	System.out.println("\nPROGRAM JADWAL KULIAH");
    	System.out.println("----------------------");

    	System.out.println("Jadwal Kuliah");
    	System.out.println(">>-- Hari --<<");
    	System.out.println("1. Senin");
    	System.out.println("2. Selasa");
    	System.out.println("3. Rabu");
    	System.out.println("4. Kamis");
    	System.out.println("5. Jum'at");
    	System.out.println("6. Sabtu");
    	System.out.println("7. Minggu");
    	System.out.print("Silahkan Pilih Hari \n:> ");
    	int pilih = userInput.nextInt();

    	switch(pilih) {
    		case 1:
				System.out.println("\n>>  Anda Memilih Hari Senin  <<\n"+
					       "- Hari Senin Anda Tidak Memiliki Jam Kuliah"+
					       "\n  I Fell FREE..!!! :D");
				break;
			case 2:
				System.out.println("\n>>  Anda Memilih Hari Selasa  <<\n"+
					       "- Hari Selasa Anda Kuliah >>"+
					       "\n  Pemograman  Berbasis Objek > (08.20 WIB)");
				break;
			case 3:
				System.out.println("\n>>  Anda Memilih Hari Rabu  <<\n"+
					       "- Hari Rabu Anda Kuliah >>"+
					       "\n . Elektronika Digital > (07.30 WIB)"+
						   "\n . Matematika Distrit  > (09.10 WIB)");
				break;
			case 4:
				System.out.println("\n>>  Anda Memilih Hari Kamis  <<\n"+
					       "- Hari Kamis Anda Kuliah >>"+
					       "\n  . Perawatan Perangkat Komuter > (09.10 WIB)"+
						   "\n  . Sistem Operasi \t\t\t  > (13.10 WIB)");
				break;
			case 5:
				System.out.println("\n>>  Anda Memilih Hari Jum'at  <<\n"+
					       "- Hari Jum'at Anda Kuliah >>"+
					       "\n  APJK \t > (09.10 WIB)");
				break;
			case 6:
				System.out.println("\n>>  Anda Memilih Hari Sabtu  <<\n"+
					       "- Hari Sabtu Anda Tidak Memiliki Jam Kuliah"+
					       "\n  I Fell FREE..!!! :D");
				break;
			case 7:
				System.out.println("\n>>  Anda Memilih Hari Sabtu  <<\n"+
					       "- Hari Sabtu Anda Tidak Memiliki Jam Kuliah"+
					       "\n  I Fell FREE..!!! :D");
				break;
			default:
				System.out.println("\nPilihan Anda Salah..!!"+
					"Inggat Dalam Satu Minggu Hanya Terdapat 7 Hari");
    	}
    }
}
