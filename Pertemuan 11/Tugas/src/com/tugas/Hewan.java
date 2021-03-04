package com.tugas;

public class Hewan {
    
    public static void main(String[] args) {

    	cetakHewan(new Gajah());
    	cetakHewan(new Kuda());
    	cetakHewan(new Paus());
    	cetakHewan(new Kodok());
    }

    public static void cetakHewan(Object object) {
    	System.out.println(object);
    }
}

/* + + + + + akhir kelas polimorphism + + + + + */

class Gajah extends Kuda {

	public String toString() {
		return "Gajah\nBerkaki 4, bertubuh besar dan memiliki gading\n";
	}
}

class Kuda extends Paus {
	public String toString() {
		return "Kuda\nBerkaki 4, bertubuh sedang dan berlari cepat\n";
	}
}

class Paus extends Kodok {
	public String toString() {
		return "Paus\nHidup di laut, bertubuh besar dan bernapas dengan paru paru\n";
	}
}

class Kodok extends Object {
	public String toString() {
		return "Kodok\nHidup di air dan darat, bertubuh kecil dan bergerak dengan cara melompat";
	}
}