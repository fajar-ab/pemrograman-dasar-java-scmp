package dosen_uli_v2;

public class rektor extends dosen {
    
    private int th_mulai;
    private int jabatan_ke;

    // inisialisasi
    rektor(String namaX, String nikX, String jurX, int thX, int keX) {
    	
    	super(namaX, nikX, jurX);
    	th_mulai   = thX;
    	jabatan_ke = keX;
    }

    public void view() {
    	
    	System.out.println("Th Mulai Jabatan  : " + th_mulai);
    	System.out.println("Jabatan Rektor Ke : " + jabatan_ke);
    }
}
