# Pertemuan 5

### STMIK Citra Mandiri Padangsidimuan

**Parodi**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Sistem Informasi <br>
**Jumlah Sks**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;3SKS <br>
**Lembaran**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Job Sheet 5 <br>
**Matakuliah**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Bahasa Pemograman I <br>
**Topik_**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Array
### Tujuaan

1. Dengan mengikuti perkuliahan ini mahasiswa diharapkan mampu memahami konsep array di OOP.
2. Dengan mengikuti perkuliahan ini mahasiswa diharapkan untuk mampu membuat program yang penggunakan array di OOP.

### Tools

1. Personal Computer
2. IDE / Text Editor

## Teori Singkat

### Array Satu Dimensi

Variabel Larik atau lebih dikenal dengan ARRAY adalah adalah Tipe terstruktur yang terdiri dari sejumlah komponen-komponen yang mempunyai tipe yang sama. Sebelum digunakan, variabel array perlu dideklarasikan terlebih dahulu. Cara mendeklarasikan variabel array sama seperti deklarasi variabel yang lainnya, hanya saja diikuti oleh suatu indek yang menunjukan jumlah maksimum data yang disediakan.

Deklarasi Array Bentuk Umum pendeklarasian array :

	tipe_data[] nama_variabel_array;

	nama_var_array = new tipe_data[ukuran];

Atau bisa juga secara langsung seperti dibawah ini :

	tipe_data[] nama_var_array = new tipe_data[ukuran];

> **Keterangan**
>
> **Type Data**&nbsp; : &nbsp;Untuk menyatakan type data yang digunakan. <br>
> **Ukuran**.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;Untuk menyatakan jumlah maksimum elemen array.

Berikut contoh pendeklarasian array dan membuat objek array :

	int[] nil_akhir;

	nil_akhir = new int[6];

Contoh Pendeklarasian Array sekaligus membuat objek :
 
	int[] nil_akhir = New int[6];
	 ↑        ↑             ↑
	 │        │             └─ • Jumlah Elemen Array
	 │        └─ • Nama Array
	 └─ • Tipe data elemen array

Pada pendeklarasian diatas, variabel `nil_akhir` sebagai `array-of-int`, banyak elemen yang dapat ditampung sebanyak 6 (enam) elemen. <br>
Suatu array dapat digambarkan sebagai kotak panjang yang berisi kotak-kotak kecil didalam kotak panjang tersebut.

![Array](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P05%20-%2001.png "Array")

> Subscript atau Index array pada Java, selalu dimulai dari Nol (0).

### Mengakses Array Satu Dimensi

Suatu array, dapat diakses dengan menggunakan _subscript_ atau _indexnya_. 

Bentuk umum pengaksesan dengan bentuk :

	nama_var_array[nomor_index_array];

Contoh : 

	Nil_Akhir[3];

	Nil_Akhir[1];

Sebagai contoh program memasukan data kedalam elemen array dan mengambil data dari dalam elemen array, secara selengkapnya seperti dibawah ini :

```java
import java.util.*;

class Main {

    public static void main(String[] args) {

        int[] nil_akhir;            // deklarasi variabel array
        nil_akhir = new int[6];     // membuat objek array
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {

            System.out.print("Masukkan array ke "+ i +" = ");
            nil_akhir[i] = userInput.nextInt();
        }

        System.out.println("\nData Yang Diinput Ke Elemen Array\n");

        for (int i = 0; i < 6; i++) {

            System.out.print("Nilai Akhir Index " + i);
            System.out.println(" = " + nil_akhir[i]);
        }
    }
}
```
Output yang dihasilkan dari program diatas, seperti dibawah ini : <br>
![Output](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P05%20-%2002.png "Output - Latihan 1")

**Inisialisasi** adalah memberikan nilai awal terhadap suatu variabel. Bentuk pendefinisian suatu array dapat dilihat dari contoh berikut :

	tipe_data[] nama_array = { nilai array };

Contoh:

	double[] nilai = {56.5, 66.7, 87.45, 98,5, 78.9 };

Sebagai contoh program memasukan data kedalam elemen array dengan cara inisialisasi objek array dan mengambil data dari dalam elemen array, secara selengkapnya seperti dibawah ini:

```java
class Main {

    public static void main(String[] args) {    

        double[] nil_akhir = {56.5, 66.7, 87.6, 98,5, 78.9, 85.4};

        System.out.println("\nData Yang Diinput ke Elemen Array\n");

        //menampilkan data dari elemen array
        for(int i = 0; i < 6; i++){

            System.out.print("Nilai Akhir Index " + i);
            System.out.println(" = " + nil_akhir[i]);
        }    
    }    
}
```
Output yang dihasilkan dari program diatas, seperti dibawah ini : <br>
![Output](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P05%20-%2003.png "Output - Latihan 2")

### Array Dua Dimensi

Array dimensi dua tersusun dalam bentuk baris dan kolom, dimana indeks pertama menunjukan baris dan indeks kedua menunjukan kolom. Array dimensi dua dapat digunakan seperti pendatan penjualan, pendataan nilai dan lain sebagainya. <br>
Sebagai contoh pendeklarasian dan pengaksesan data, kita gunakan adalah pengolahan data penjualan, berikut dapat anda lihat pada tabel berikut : 

<table>
	<tr>
		<td rowspan="2"> <center><b>No</b></center></td>
		<td colspan="3"><center><b>Tahun Penjualan</b></center></td>
	</tr>
	<tr>
		<td>2001</td>
		<td>2002</td>
		<td>2003</td>
	</tr>
	<tr>
		<td>1</td>
		<td><i>150</i></td>
		<td><i>159</i></td>
		<td><i>230</i></td>
	</tr>
	<tr>
		<td>2</td>
		<td><i>100</i></td>
		<td><i>125</i></td>
		<td><i>150</i></td>
	</tr>
	<tr>
		<td>3</td>
		<td><i>210</i></td>
		<td><i>125</i></td>
		<td><i>156</i></td>
	</tr>
</table>

Jika anda lihat dari tabel diatas maka dapat dituliskan kedalam array dimensi dua berikut 

	int[][] data_jual = new int[3][3];
	 ↑          ↑               ↑  ↑
	 │          │               │  └─ • Jumlah Kolom
	 │          │               └─ • Jumlah Baris
	 │          └─ • Nama variabel Array
	 └─ • Tipe data elemen array

Sebagai contoh program memasukan data kedalam elemen array berdimensi dua dan mengambil data dari dalam elemen array berdimensi dua, secara selengkapnya seperti dibawah ini :
```java
import java.util.*;

class Main {

    public static void main(String[] args) {

        int[][] data_jual = new int[3][3];
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("Masukkan Data Jual ke ["+ i +"] ["+ j +"] = ");
                data_jual[i][j] = userInput.nextInt();
            }
            System.out.println();
        }

        System.out.println("\nData Yang Diinput ke Elemen Array\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("Nilai Data Jual ["+ i +"] ["+ j +"]");
                System.out.println(" = " + data_jual[i][j]);
            }
            System.out.println();
        }
    }
}
```
Output yang dihasilkan dari program diatas, seperti dibawah ini : <br>
![Output](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P05%20-%2004.png "Output - Latihan 3")

Suatu array, dapat diakses dengan menggunakan subscript atau indexnya. Bentuk umum pengaksesan dengan bentuk :

	int[][] nil_akhir = {{150, 159, 230}, {100,125,150}, {210,125,156}};

Sebagai contoh program memasukan data kedalam elemen array dengan cara inisialisasi objek array dan mengambil data dari dalam elemen array, secara selengkapnya seperti dibawah ini:
```java
class Main {

    public static void main(String[] args) {

        int[][] nil_akhir = {{150, 159, 230}, {100,125,150}, {210,125,156}};

        System.out.println("Data Yang Diinput ke Elemen Array\n");

        // //menampilkan data dari elemen array
        for(int i = 0; i < 3; i++) {        
            for(int j = 0; j < 3; j++) {

                System.out.print("Nilai Akhir Index ["+i+"] ["+j+"]");
                System.out.println(" = " + nil_akhir[i][j]);
            }    
        }        
    }        
}    	
```
Output yang dihasilkan dari program diatas, seperti dibawah ini : <br>
![Output](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P05%20-%2005.png "Output - Latihan 4")

## Langkah Kerja

### Contoh program Array Matriks

1. Buatlah sebuah project baru dengan nama **Array Matriks**, dengan class *ArrayMatriks.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [ArrayMatriks.java]( "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut:
![Output - Array Matriks](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P05%20-%2006.png "Output - Array Matriks")

### Contoh program Array Sorting

1. Buatlah sebuah project baru dengan nama **Array Sorting**, dengan class *ArraySorting.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [ArraySorting.java]( "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut:
![Output - Array Sorting](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P05%20-%2007.png "Output - Array Sorting")

### Contoh program Array Searching

1. Buatlah sebuah project baru dengan nama **Array Searching**, dengan class *ArraySearching.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [ArraySearching.java]( "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut:
![Output - Array Searching](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P05%20-%2008.png "Output - Array Searching #1")
![Output - Array Searching](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P05%20-%2009.png "Output - Array Searching #2")

### Contoh program Pencarian Biner

1. Buatlah sebuah project baru dengan nama **Pencarian Biner**, dengan class *PencarianBiner.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [PencarianBiner.java]( "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut:
![Output - Pencarian Biner](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P05%20-%2010.png "Output - Pencarian Biner #1")
![Output - Pencarian Biner](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P05%20-%2011.png "Output - Pencarian Biner #2")

> 👉 Lihat kembali penamaan class dan penggunaan package yang di pakai dalam beberapa program di atas.
