/**
 * Title		: Program Demo Konversi Suhu - Pertemuan 2
 * Deskripsi	: Penggunaan kostanta dalam program
 *				  
 * 
 */

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

		// Mecetak hasil ke console
		System.out.println("\nPROGRAM DEMO KONVERSI SUHU");
		System.out.println("---------------------------");
		System.out.printf("Suhu Celcius           = %.2f Derajat\n", suhuCelcius);
		System.out.printf("Konversi ke Fahrenheit = %.2f Derajat\n", hasilFahrenheit);
		System.out.printf("Suhu Fahrenheit        = %.2f Derajat\n", suhuFahrenheit);
		System.out.printf("Konversi ke Celcius    = %.2f Derajat\n", hasilCelcius);

    }
}
