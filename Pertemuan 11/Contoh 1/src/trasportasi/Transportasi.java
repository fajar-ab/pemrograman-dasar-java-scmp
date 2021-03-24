package trasportasi;

public class Transportasi {
    
    public static void main(String[] args) {
    	
    	kendaraan p;
    	pesawat psw = new pesawat("Boing 707", "Pesawat Komersial");
    	mobil mbl1 = new mobil("Honda Jazz", "Sport");
    	mobil mbl2 = new mobil("Suzuki Boleno", "Sedan");
    	mobil mbl3 = new mobil("VW Combi");
    	kapal kpl = new kapal("Queen Mary 2", "Kapal Pesiar");

    	p = psw;
    	p.informasi();
    	System.out.println();

    	p = mbl1;
    	p.informasi();
    	System.out.println();

    	p = mbl2;
    	p.informasi();
    	System.out.println();

    	p = mbl3;
    	p.informasi();
    	System.out.println();

    	p = kpl;
    	p.informasi();
    	System.out.println();
    }
}
