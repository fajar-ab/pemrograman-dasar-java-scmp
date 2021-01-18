package main.persegipanjang;

public class PersegiPanjang {
    
    private double panjang; // atribut yang di hide
    private double lebar;   // atribut yang di hide
    private double tinggi;  // atribut yang di hide

    public PersegiPanjang() {
    	panjang = 0;
    	lebar   = 0;
    }

    private double luas(double p, double l) { // di encap
    	return p * l;
    }

    public void setPanjang(double panjang) {
    	this.panjang = panjang;
    }

    public void setLebar(double lebar) {
    	this.lebar = lebar;
    }

    public double getPanjang() {
    	return panjang;
    }

    public double getLebar() {
    	return lebar;
    }

    public double getLuas() {
    	return luas(panjang, lebar);
    }
}