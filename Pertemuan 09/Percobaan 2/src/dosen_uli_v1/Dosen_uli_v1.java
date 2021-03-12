package dosen_uli_v1;

public class Dosen_uli_v1 {
    
    public static void main(String[] args) {
    	
    	// pemanggil konstruktor
    	rektor rek = new rektor("Afris", "1020058", "Sistem Komputer", 2010, 2);
    	dekan dek = new dekan("Ade", "1020060", "T. Kimia", "TI");
    	kalab lab = new kalab("Indah", "1020059", "Informatika", "KSC");

    	rek.view();
    	rek.viewRektor();
    	System.out.println();

    	dek.view();
    	dek.viewDekan();
    	System.out.println();

    	lab.view();
    	lab.viewKalab();
    }
}
