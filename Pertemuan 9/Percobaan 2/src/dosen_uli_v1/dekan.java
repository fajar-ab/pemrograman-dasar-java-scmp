package dosen_uli_v1;

public class dekan extends dosen{
    
    private String fakultas;

    // Inisialisasi
    dekan(String namaX, String nikX, String jurX, String fakX) {
		super(namaX, nikX, jurX);
		fakultas = fakX;
	}

	// Menampilkan Informasi
	public void viewDekan() {
		
		System.out.println("fakultas           : " + fakultas);
	}

}
