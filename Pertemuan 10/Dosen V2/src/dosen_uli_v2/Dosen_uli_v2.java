package dosen_uli_v2;

public class Dosen_uli_v2 {
    
    public static void main(String[] args) {
    	
    	dosen p;
    	rektor rek = new rektor("Andi", "885330203", "Informatika", 2016, 2);
    	dekan dek = new dekan("Ahmad", "995230101", "T. Kimia", "TI");
    	kalab lab = new kalab("Indah", "035230302", "Informatika", "RSC");

    	p = rek;
    	p.view();
    	System.out.println();

    	p = dek;
    	p.view();
    	System.out.println();

    	p = lab;
    	p.view();
    	System.out.println();

    }
}
