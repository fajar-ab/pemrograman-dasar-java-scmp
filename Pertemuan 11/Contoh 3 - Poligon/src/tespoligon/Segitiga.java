package tespoligon;
import java.lang.Math;

public class Segitiga implements Poligon {
    
    // deklarasi atribut
    private double alas, tinggi;

    // defenisi method
    // kostruktor
    public Segitiga(double a, double t) {
    	alas   = a;
    	tinggi = t;
    }

    // selector
    public double getAlas() {
    	return alas;
    }

    public double getTinggi() {
    	return tinggi;
    }

    // defenisi method dari kelas induk
    public double Luas() {
    	return (alas * tinggi) / 2;
    }

    public double Keliling() {
    	double d;
    	d = Math.sqrt((alas * alas) + (tinggi * tinggi));
    	return (alas + tinggi + d);
    }

    public String displayInfo() {
    	return (
    		"Segitiga"
    		+ "\n- Alas      : " + (float)getAlas()
    		+ "\n- Tinggi    : " + (float)getTinggi()
    		+ "\n- Luas      : " + (float)Luas()
    		+ "\n- Keliling  : " + (float)Keliling()
    	);
    }
}
