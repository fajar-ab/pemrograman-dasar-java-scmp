package tespoligon;

public class Lingkaran implements Poligon {
    
    // deklarasi atribut
    private double radius;
    private double PI = 3.14d;

    // defenisi method
    // konstruktor
    public Lingkaran(double r) {
    	radius = r;
    }

    public double getRadius() {
        return radius;
    }

    // selector
    public double Luas() {
    	return (PI * radius * radius);
    }

    // defenisi method dari kelas induk
    public double Keliling() {
    	return (2 * PI * radius);
    }

    public String displayInfo() {
    	return (
    		"Lingkaran"
    		+ "\n- Jari jari : " + (float)getRadius()
    		+ "\n- Luas      : " + (float)Luas()
    		+ "\n- Keliling  : " + (float)Keliling()
    	);
    }
}
