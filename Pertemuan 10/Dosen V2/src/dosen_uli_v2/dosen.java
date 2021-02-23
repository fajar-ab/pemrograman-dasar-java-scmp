package dosen_uli_v2;

public class dosen {
    
    protected String nama;
    protected String nik;
    protected String jurusan;

    // inisialisasi
    dosen(String namaX, String nikX, String jurX) {

    	nama    = namaX;
    	nik     = nikX;
    	jurusan = jurX;
    }

    public void view() {

    	System.out.println("Nama              : " + nama);
    	System.out.println("Nik               : " + nik);
    	System.out.println("jurusan           : " + jurusan);
    }
}
