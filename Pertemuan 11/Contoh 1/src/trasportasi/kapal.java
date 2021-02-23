package trasportasi;

public class kapal extends kendaraan {
    
    private String nama;
    private String jenis;

    public kapal(String nama) {

    	super("Kapal");
    	this.nama  = nama;
    	this.jenis = "Belum Terindifikasi";
    }

    public kapal(String nama, String jenis) {

		super("Kapal");
		this.nama  = nama;
		this.jenis = jenis;
	}

    public void informasi() {

    	System.out.println("Nama Kapal adalah     " + nama);
    	System.out.println("Jenis Kapal adalah    " + jenis);
    }
}
