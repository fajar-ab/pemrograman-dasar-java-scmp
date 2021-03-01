package tespoligon;

public class SegiEmpat implements Poligon {
    
    // deklarasi atribut
    private double panjang, lebar;

    // defenisi methot
    // konstruktor
    public SegiEmpat(double p, double l) {
    	panjang = p;
    	lebar   = l;
    }

    // selector 
    public double getPanjang() {
    	return panjang;
    }

    public double getLebar() {
    	return lebar;
    }

    // defenisi method dari kelas induk
    public double Luas() {
    	return (panjang * lebar);
    }

    public double Keliling() {
    	return (2 * (panjang + lebar));
    }

    public String displayInfo() {
    	return (
    		"Segi Empat"
    		+ "\n- Panjang   : " + (float)getPanjang()
    		+ "\n- Lebar     : " + (float)getLebar()
    		+ "\n- Luas      : " + (float)Luas()
    		+ "\n- Keliling  : " + (float)Keliling()
    	);
    }
}