package trasportasi;

public class mobil extends kendaraan {
    
    private String nama;
    private String jenis;

    public mobil(String nama) {

    	super("Mobil");
    	this.nama  = nama;
    	this.jenis = "Belum Terindifikasi";
    }

    public mobil(String nama, String jenis) {

		super("Mobil");
		this.nama  = nama;
		this.jenis = jenis;
	}

    public void informasi() {

    	System.out.println("Nama Mobil adalah     " + nama);
    	System.out.println("Jenis Mobil adalah    " + jenis);
    }
}
