package dosen_uli_v2;

public class kalab extends dosen {
    
    private String laboratorium;

    // inisialisasi
    kalab(String namaX, String nikX, String jurX, String labX) {

    	super(namaX, nikX, jurX);
    	laboratorium = labX;
    }

    public void view() {

    	super.view();
    	System.out.println("Laboratorium      : " + laboratorium);
    }
}
