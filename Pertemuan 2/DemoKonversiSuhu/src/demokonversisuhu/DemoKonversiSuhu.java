// Program Demo Konversi Suhu - Pertemuan 2

package demokonversisuhu;

class Temperatur {

	// Mendeklarasi vaariabel kelas
	int hasil;
	double celcius, fahrenheit;

	// Deklarasi kostanta kelass
	final double KONST_FAHR = 32.0;

	// Method konversi suhu dari celsius ke fahrenheit
	public double toFarenheit(double suhuCelcius) {
		fahrenheit = KONST_FAHR + (9.0/5.0) * suhuCelcius;
		return fahrenheit;
	}

	// Method konversi suhu dari fahrenheit ke celsius
	public double toCelcius(double suhuFahrenheit) {
		celcius = (suhuFahrenheit - KONST_FAHR) * (5.0/9.0);
		return celcius;
	}
}

public class DemoKonversiSuhu {
    
    public static void main(String[] args) {
    	// Mendeklarasi data
    	double suhuCelcius, suhuFahrenheit, hasilCelcius, hasilFahrenheit;

    	suhuCelcius = 37.0;
		suhuFahrenheit = 145.0;

		// Membuat objek "temp" dari kelas temperatur
		Temperatur tem = new Temperatur();

		// Mengkonversi suhu
		hasilFahrenheit = tem.toFarenheit(suhuCelcius);
		hasilCelcius = tem.toCelcius(suhuFahrenheit);

		// output
		System.out.println("\nPROGRAM DEMO KONVERSI SUHU");
		System.out.println("---------------------------");
		System.out.println("Suhu Celcius           = " + suhuCelcius  + " Derajat");
		System.out.println("Konversi ke Fahrenheit = " + hasilFahrenheit + " Derajat");
		System.out.println("Suhu Fahrenheit        = " + suhuFahrenheit + " Derajat");
		System.out.println("Konversi ke Celcius    = " + hasilCelcius + " Derajat");

    }
}
