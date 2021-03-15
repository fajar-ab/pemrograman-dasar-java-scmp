package ikonnegara;
import java.util.*;

public class IkonNegara {
    
    public static void main(String[] args) {
    	String ciriKhas = "";

    	System.out.println(".---------------------------------------------.");
    	System.out.println("|  NEGARA        |   CIRI KHAS                |");
    	System.out.println("|----------------|----------------------------| ");

    	Indonesia idn = new Indonesia();
    	ciriKhas = idn.iconIndonesia();
    	System.out.println("| Indonesia      | " + ciriKhas);

    	Mekkah sau = new Mekkah();
    	ciriKhas = sau.iconMekkah();
    	System.out.println("| Mekkah         | " + ciriKhas);

    	Malaysia mys = new Malaysia();
    	ciriKhas = mys.iconMalaysia();
    	System.out.println("| Malaysia       | " + ciriKhas);

    	China chn = new China();
    	ciriKhas = chn.iconChina();
    	System.out.println("| China          | " + ciriKhas);
    	
    	India ind = new India();
    	ciriKhas = ind.iconIndia();
    	System.out.println("| India          | " + ciriKhas);

    	System.out.println("'---------------------------------------------'");
    }
}

class Indonesia {
	public String iconIndonesia() {
		String ikon = new String("Candi Borobudur            |");
		return ikon;
	}
}

class Mekkah {
	public String iconMekkah() {
		String ikon = new String("Kak'bah                    |");
		return ikon;
	}
}

class Malaysia {
	public String iconMalaysia() {
		String ikon = new String("Menara Kembar Petronas     |");
		return ikon;
	}
}

class China {
	public String iconChina() {
		String ikon = new String("Tembok Besar China         |");
		return ikon;
	}
}

class India {
	public String iconIndia() {
		String ikon = new String("Tajmahal                   |");
		return ikon;
	}
}