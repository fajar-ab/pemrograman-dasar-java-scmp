package dosen_uli_v2;

public class dekan extends dosen {
    
    private String fakultas;

    // inisialisasi
    dekan(String namaX, String nikX, String jurX, String fakX) {
    	
    	super(namaX, nikX, jurX);
    	fakultas = fakX;
    }

    public void view() {

    	super.view();
    	System.out.println("Fakultas          : " + fakultas);
    }
}
