package tespoligon;

// Program Utama
public class TesPoligon {
    
    public static void main(String[] args) {
    	
    	// deklarasi array
    	Poligon[] p = new Poligon[4];

    	SegiEmpat se = new SegiEmpat(17, 8);
    	Segitiga  sg = new Segitiga(21, 4);
    	Lingkaran lg = new Lingkaran(10);
    	Lingkaran lh = new Lingkaran(7);

    	// bentuk polimorfisme
    	p[0] = se;
    	p[1] = sg;
    	p[2] = lg;
    	p[3] = lh;

    	Lingkaran x = new Lingkaran(8);

    	// display informasi
    	for(int i = 0; i < p.length; i++) {
    		System.out.println("\n" + p[i].displayInfo());
    	}
    }
}
