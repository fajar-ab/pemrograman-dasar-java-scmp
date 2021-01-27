package dosen_uli_v1;

public class kalab extends dosen{
    
    private String labolatorium;

    // Inisialisasi
    kalab(String namaX, String nikX, String jurX, String labX) {
		super(namaX, nikX, jurX);
		labolatorium = labX;
	}

	// Menampilkan Informasi
	public void viewKalab() {

		System.out.println("Labolatorium       : " + labolatorium);
	}
}
