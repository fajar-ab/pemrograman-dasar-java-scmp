package polimorphism;

public class Polimorphism {
    
    public static void main(String[] args) {
    	cetakObjek(new Balok());
    	cetakObjek(new PersegiPanjang());
    	cetakObjek(new BangunDatar());
    	cetakObjek(new Object());
    }

    public static void cetakObjek(Object object) {
    	System.out.println(object);
    }
}
// akhir kelas polimorphism

class Balok extends PersegiPanjang {
	public String toString() {
		return "Mempunyai sisi panjang, lebar dan tinggi";
	}
}

class PersegiPanjang extends BangunDatar {
	public String toString() {
		return "Mempunyai sisi panjang dan lebar";
	}
}

class BangunDatar extends Object {
	public String toString() {
		return "Mempunyai berbagai bentuk";
	}
}


