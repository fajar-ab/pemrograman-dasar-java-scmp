# Pertemuan 1

### A. Tujuaan

1. Dengan mengikuti perkuliahan ini mahasiswa diharapkan mampu menggunakan dan memahami pembuatan program sederhana.
2. Dengan mengikuti perkuliahan ini mahasiswa diharapkan mampu memahami konsep OOP.
3. Menggunakan IDE Netbeans.

### B. Alat dan Bahan

1. Personal Computer
2. Aplikasi Netbeans

# Teori Singkat

Tahun 1960, ditemukan suatu pembuatan program yang terstruktur (structured programming). Metode ini dikembangkan dari bahsa C dan Pascal. Dengan program yang terstruktur inilah untuk pertama kalinya kita mampu menulis program yang begitu sulit dengan lebih mudah.

## Definisi OOP

Object Oriented Programming (OOP) adalah suatu metode dalam pembuatan program, dengan tujuan untuk menyelesaikan kompleksnya berbagai masalah program yang terus meningkat. Sebagai contoh anggap kita memiliki sebuah departemen yang memiliki manager, sekretaris, petugas administrasi data dan lainnya. Misal manager tersebut ingin memperoleh data dari bagian administrasi untuk mengambilnya. Pada kasus tersebut seorang manager tidak harus mengetahui bagaimana cara mengambil data tersebut tetapi manager bisa mendapatkan data tersebut melalui objek petugas administrasi.

## Objek dan Kelas

Ide dasar pada OOP adalah mengkombinasikan data dan fungsi untuk mengakses data menjadi sebuah kesatuan unit yang dikenal dengan nama objek.

**Kelas** adalah kumpulan dari beberapa objek yang sama.

![Kelas](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Img/01.png)

Contoh **Objek :**

![]()

Dalam java, kelas didefinisikan menggunakan kata kunci class. Contoh kelas sederhana adalah sebagai berikut :
```java
class Manusia {
	String nama;
}

```
Pada kode diatas, kelas yang telah dibuat adalah kelas Manusia. Dan dimana merupakan atribut yang memiliki kelas Manusia tesebut. Contoh pembuatan objek untuk kelas manusia adalah sebagai berikut :
```java
// membuat objek manusia
Manusia manusia = new manusia ();
// Mengubah nama objek manusia
Manusia.nama = “ Melina Krisnawati “;

```

## Metode ( Method )

Dalam java terdapat dua buah metode
1. Fungsi merupakan metode yang memiliki nilai balik jika metode tersebut dipanggil, cara pembuatan sebuah fungsi adalah dengan cara menentukan nilai baliknya, lalu membuat nama metodenya.
2. Prosedur, merupakan metode yang tidak memiliki nilai balik, cara pembuatan prosedur sama dengan fungsi namun bedanya, nilai baliknya menggunakan kata kunci void.

Contoh :
```java
class Manusia {
	String nama;
	// fungsi
	String ambilNama() {
		// untuk mengembalikan nilai gunakan kata kunci return
		return nama;
	}
	// prosedur
	void hapusNama() {
		Nama = “”;
	}
} 
```
Pada kode diatas, kelas manusia memiliki 2 buah metode yaitu ambilNama() dan hapusNama(). Dimana ambilNama() merupakan sebuah fungsi karena mengembalikan nilai String, sedangkan hapusNama() merupakan prosedur karena tidak mengembalikan nilai. Saat membuat sebuah fungsi maka untuk mengembalikan nilainya, harus menggunakan kata kunci return, diikuti nilai yang akan dikembalikannya. Untuk megambil nilai balik dari fungsi dapat dilihat pada contoh berikut :
```java
Manusia manusia = new Manusia() ;
manusia.nama = “ Melina Krisnawati “;
// mengambil nilai dari fungsi
String nama = manusia.ambilNama();

```

## Parameter

Parameter merupakan data yang dapat ditambahkan dari luar metode, missal jika kita membuat sebuah metode untuk mengubah nama pada kelas Manusia, maka pasti kita memerlukan nama baru untuk menggantikan nama lama, oleh karena itu diperlukan sebuah parameter nama baru untuk menggantikan nama tersebut.

Contoh:
```java
class Manusia {
	String nama;
	//metode dengan parameter
	void ubahNama (String namaBaru) {
		Nama = namaBaru;
	}

	String ambilNama() {
		return nama;
	}

	Void hapusNama() {
		nama = “”;
	}
}

```

## Kata kunci This

Kata kunci this digunakan dalam sebuah kelas dan digunakan untuk menyatakan objek sekarang. Contoh missal saat kita membuat sebuah parameter yang sama dengan nama atribut yang ada dalam sebuah kelas, maka jika kita menggunakan parameter tersebut untuk mengubah atribut pada kelas, maka perubahan tidak akan terjadi.

```java
class Manusia {

	String nama;
	String alamat;

	void ubahData(String nama, String alamat) {
		this.nama = nama;
		this.alamat = alamat;
	}

	void ubahNama(String nama) {
		This.nama = nama;
	}
}
```
Saat program sebelumnya dijalankan kembali, maka hasilnya tidak akan null lagi.

## Visibilitas Private dan Public

- **Visibilitas** - Keterangan <br>
- **Private** - Hanya dapat diakses oleh kelas itu sendiri <br>
- **Public** - Dapat diakses oleh seluruh kelas <br>
- **Protected** - Hanya dapat diakses oleh kelas itu sendiri dan kelas turunannya. <br>
- **Tanpa Visibilitas** - Hanya dapat diakses oleh kelas – kelas yang berada pada satu paket. <br>
- **Tanpa Spesifikasi** - Jika konstruktor dideklarasikan tanpa spesifikasi apakah public, private atau protected, kelas tersebut hanya akan dapat diinstansiasi menjadi objek oleh kelas dalam package yang sama. 

## Konstruktor ( Constructor )

Konstruktor merupakan metode yang secara otomatis dipanggil ketika sebuah objek dipanggil. Konstruktor digunakan untuk melakukan instansiasi objek yang menggunakan kelas yang bersangkutan. Melakukan instansiasi adalah mengalokasikan sejumlah memori dari computer sesuatu kebutuhan struktur data yang digunakan. Keberadaan konstruktor dalam sebuah kelas java bersifat opsional, karena kelas abstrak misalnya tidak membutuhkan konstruktor karena tidak bisa diinstansiasi menjadi sebuah objek. Bahkan jika dideklarasikan sebagai kelas abstract.

Nama konstruktor haruslah sama dengan nama kelasnya. Contoh :
```java
public  class Sepeda {
	private String merk;
	private int gigi;

	public Sepeda() {
	this.gigi = 0;
	this.merk = “Federal”;
	}
	public Sepeda (int g, String m) {
	this.gigi = g;
	this.merk = m;
	}
	public int posisi_gigi() {
	return this.gigi;
	}
	public String merk_sepeda() {
	return this.merk;
	}
	
} 
```
Tampak ada dua konstruktor dari kelas sepeda tersebut, yakni:
```java
public Sepeda() {
	this.gigi = 0;
	this.merk = “Federal”;
}

public Sepeda(int g, String m) {
	 this.gigi = g;
	 this.merk = m;
}
```
Jadi konstruktor dari sebuah kelas boleh lebih dari satu. Fitur ini dikenal dengan sebutan constructor overloading, yakni dimungkinkannya lebih dari satu konstruktor dalam sebuah kelas java, bedanya hanya pada parameter – parameter konstuktornya saja. Melalui dua konstruktor tersebut, dengan enak kita dapat memilih cara manakah yang lebih cocok untuk dipakai instansiasi objek sepeda.
```java
// cara 1 instansiasi object Sepeda
Sepeda sepeda1 = new Sepeda();
//cara2 instansiasi object Sepeda
Sepeda sepeda2 = new Sepeda(2,”Vixie”);

```

## Keyword Bahasa Pemrograman Java 

Pada bab pengenalan java ini kita akan membahas mengenai dasar-dasar bahasa java. Kalau kita belajar bahasa Indonesia pasti yang pertama kita bahas adalah kosa-kata dan pembentukan kalimat seperti SPOK. Bahasa pemrograman Java tidak serumit bahasa indonesia yang mempunyai jutaan kosa kata, Java hanya mempunyai 44 buah kosa kata (Keyword). Semua Keywords ini adalah kepunyaanya bahasa Java, kita harus menggunakanya dengan benar dan tidak boleh digunakan untuk tujuan lain, misalnya sebagai nama variabel atau nama class.
Berikut ini adalah daftar 44 buah Keyword java :

<table style="text-align: center; vertical-align: middle;">
	<tr>
		<td>abstract</td>
		<td>bolean</td>
		<td>break</td>
		<td>byte</td>
		<td>case</td>
	</tr>
	<tr>
		<td>catch</td>
		<td>char</td>
		<td>class</td>
		<td>const</td>
		<td>continue</td>
	</tr>
	<tr>
		<td>default</td>
		<td>do</td>
		<td>double</td>
		<td>else</td>
		<td>extends</td>
	</tr>
	<tr>
		<td>final</td>
		<td>finally</td>
		<td>float</td>
		<td>for</td>
		<td>goto</td>
	</tr>
	<tr>
		<td>if</td>
		<td>implements</td>
		<td>import</td>
		<td>instanceof</td>
		<td>int</td>
	</tr>
	<tr>
		<td>interface</td>
		<td>long</td>
		<td>native</td>
		<td>new</td>
		<td>package</td>
	</tr>
	<tr>
		<td>private</td>
		<td>protected</td>
		<td>public</td>
		<td>return</td>
		<td>short</td>
	</tr>
	<tr>
		<td>static</td>
		<td>strictfp</td>
		<td>super</td>
		<td>switch</td>
		<td>synchronized</td>
	</tr>
	<tr>
		<td>this</td>
		<td>throw</td>
		<td>throws</td>
		<td>transient</td>
		<td>try</td>
	</tr>
	<tr>
		<td>void</td>
		<td>volatile</td>
		<td>while</td>
		<td>assert</td>
		<td>enum</td>
	</tr>
</table>
