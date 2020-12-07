// Program Mamalia Darat - Pertemuan 2

package mamaliadarat;
import java.util.Scanner;

class MamaliaDarat {

	public static void main(String[] args) {
		// Deklarasi data
		String suaraHewan = "";

		System.out.println("\nDEMO KELAS, METHOD, DAN DATA");
		System.out.println("-----------------------------");

		Kucing pussy = new Kucing();
		suaraHewan = pussy.mengeong();
		System.out.println("Pussy      : " + suaraHewan);

		Anjing doggy = new Anjing();
		suaraHewan = doggy.menggonggong();
		System.out.println("Doggy      : " + suaraHewan);

		Macan siKumbang = new Macan();
		suaraHewan = siKumbang.mengaum();
		System.out.println("Si Kumbang : " + suaraHewan);

	}
}

class Kucing {
	// Method mengembalikan suara kucing
	public String mengeong(){
		String suara = new String("Meoooong......");
		return suara;
	}
}

class Anjing {
	// Method mengembalikan suara anjing
	public String menggonggong(){
		String suara = new String("Guk....Guk....");
		return suara;
	}
}

class Macan {
	// Method mengembalikan suara macan
	public String mengaum(){
		String suara = new String("Auuuummm......");
		return suara;
	}
}