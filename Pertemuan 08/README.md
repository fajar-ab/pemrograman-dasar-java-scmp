# Pertemuan 8

### STMIK Citra Mandiri Padangsidimuan

**Parodi**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Sistem Informasi <br>
**Jumlah Sks**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;3SKS <br>
**Lembaran**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Job Sheet 8 <br>
**Matakuliah**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Bahasa Pemograman I Java<br>
**Topik_**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Enkapsulasi

### Tujuan

1. Dengan mengikuti perkuliahan ini mahasiswa diharapkan mampu memahami konsep _enkapsulasi_ dan _information hiding._
2. Dengan mengikuti perkuliahan ini mahasiswa diharapkan untuk mampu membuat program yang menggunakan _enkapsulasi_ dan _information hiding_.

### Tools

1. Personal Computer
2. IDE / Text Editor

## Teori Singkat

+ **Encapsulation** adalah **menyembunyikan attribute** suatu objek dari objek lain.
+ Attribute maupun method disembunyikan dengan cara memberikan modifier **`private`**.
+ Enkapsulasi adalah suatu cara untuk menyembunyikan informasi detail dari suatu class. Dua hal yang mendasar dalam enkapsulasi yakni : 
  - Information hiding.
  - Interface to access data.
+ **Information** Hiding adalah **menyembunyikan attribute** dan method suatu objek dari objek lain.
+ Sebelumnya kita dapat mengakses anggota class baik berupa atribut maupun method secara langsung dengan menggunakan objek yang telah kita buat. Hal ini dikarenakan akses kontrol yang diberikan kepada atribut maupun method yang ada di dalam class tersebut adalah `public`. Kita dapat menyembunyikan informasi dari suatu class sehingga anggota class tersebut tidak dapat diakses dari luar, caranya adalah hanya dengan memberikan akses kontrol `private` ketika mendeklarasikan atribut atau method. Proses ini disebut dengan information hiding. 

## Langkah Kerja

### Percobaan 1

Berikut ini kita akan membuat program yang fungsinya untuk menampilkan panjang dan lebar persegi panjang serta mencari luasnya dengan menggunakan konsep enkapsulasi. Project ini akan terdiri dari 2 file, yaitu file _MainPersegiPannjang.java_ dan _PersegiPanjang.java_.

Untuk membuat program tersebut, ikuti langkah berikut ini:
1. Buat Project baru dengan nama **Percobaan 1**.
2. Buat class file dengan nama [MainPersegiPanjang.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2008/Percobaan%201/src/main/persegipanjang/MainPersegiPanjang.java "Buka - Github").
3. Sesuaikan listing programnya seperti yang terlihat dibawah.
```java
	package main.persegipanjang;

	public class MainPersegiPanjang {
	    
	    public static void main(String[] args) {
			
			PersegiPanjang pp = new PersegiPanjang();

			pp.setPanjang(10);
			pp.setLebar(20);

			System.out.println("Panjang : " + pp.getPanjang());
			System.out.println("Lebar   : " + pp.getLebar());
			System.out.println("Luas    : " + pp.getLuas());    
	    }
	}
```
4. Jika terdeteksi tanda kesalahan pada listing program, untuk  sementara biarkan saja karena kita belum membuat class _PersegiPanjang_.
5. Buat file class Baru dengan nama [PersegiPanjang.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2008/Percobaan%201/src/main/persegipanjang/PersegiPanjang.java "Buka - Github") di package yang sama.
6. Selanjutnya sesuaikan juga listing programnya seperti yang terlihat dibawah.
```java
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
```
7. Maka otomatis kesalahan yang ada pada class MainPersegiPanjang akan hilang karena class PersegiPanjang telah selesai dibuat.
8. Compile dan jalankan project nya, sehingga hasilnya sebagai berikut: <br>
![Output - Percobaan 1](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P08%20-%2001.png "Output - Percobaan 1")

> 👉 Lihat kembali penamaan class dan penggunaan package yang di pakai dalam program di atas.


### Percobaan 2

Berikut ini adalah program untuk mencari jumlah gaji bersih dengan mengetahui jumlah gaji kotor dan jumlah potongannya dengan menggunakan konsep _enkapsulasi_.

Untuk membuat program tersebut, ikuti langkah berikut ini:
1. Buat Project dengan nama **Percobaan 2**.
2. Buat main class dengan nama [Encapsulation.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2008/Percobaan%202/src/com/percobaan2/Encapsulation.java "Buka - Github").
3. Sesuaikan listing program dengan yang terlihat dibawah.
```java
	package com.percobaan2;

	import java.text.DecimalFormat;

	public class Encapsulation {

		public static void main(String[] args) {
			
			// Mengeset tampilan hasil menjadi dua digit desimal
			DecimalFormat digitPresisi = new DecimalFormat("0.00");

			System.out.println("\nDEMO ENCAPSULASI");
			System.out.println("----------------");

			/* Membuat instans dari kelas hitungGaji untuk satu
			   pegawai, dan memanggil methd-methodnya  
			*/
			
			HitungGaji tony = new HitungGaji();
			tony.setGaji(2500000);
			tony.hitungGaji();

			System.out.println("Informasi Gaji Pegawai");
			System.out.println("\nBesar Gaji Kotor : " + digitPresisi.format(tony.getGajiKotor()));
			System.out.println("\nBesar Gaji yang dibawa plang : " + digitPresisi.format(tony.getGajiBersih()));

			// atau bisa pilih output di console seperti ini
			// ---------------------------------------------------------------------------------
			// System.out.printf("\nBesar Gaji Kotor             : %,.2f", tony.getGajiKotor());
			// System.out.printf("\nBesar Gaji yang dibawa plang : %,.2f", tony.getGajiBersih());
			// ---------------------------------------------------------------------------------
		}
	}

	class HitungGaji  {
		/*	Mendeklarasikan variabel-variabel internal kelas hitungGaji
			variabel potongan menyatakn dan untuk Asuransi kesehatan
			(Akses, iuran koperasi, cicilan kendaraan dan sebagainya)
			haya variabel gajiKotor dan gaji bersih yang dapat di akses
			oleh "lingkungan luar"
		*/

		private double gajiKotor, gajiSetelahPajak;
		public double gajiBersih;
		private double potongan = 75000.00d;

		public void setGaji(double gaji) {
			gajiKotor = gaji;
		}

		// Method untuk menghitung gaji bersih
		public void hitungGaji() {
			gajiSetelahPajak = gajiKotor - (0.2 * gajiKotor);
			gajiBersih = gajiSetelahPajak - potongan;
		}

		// Method yang mengembalikan gaji kotor
		public double getGajiKotor() {
			return gajiKotor;
		}

		// Method yang mengembalikan besar gaji bersih
		public double getGajiBersih() {
			return gajiBersih;
		}
	}
```
4. Compile dan jalankan project nya, sehingga hasilnya sebagai berikut: <br>
![Output - Percobaan 2](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P08%20-%2002.png "Output - Percobaan 2")

> 👉 Lihat kembali penamaan class dan penggunaan package yang di pakai dalam program di atas.

## Evaluasi dan Penugasan

Buatlah program untuk mencari jumlah harga yang harus dibayar jika diketahui:
+ Barang yang dibeli sebanyak 2 jenis dengan ketentuan sebagai berikut:
  - Barang pertama harganya 8.000.000,00
  - Barang kedua 2.500.000,00
  - Pembeli memperoleh diskon 10% karena belanja di atas 10.000.000,00
+ Program ini dapat dikerjakan dengan menggunakan program di percobaan kedua.

Langkah-langkah :<br>
1. Buatlah sebuah project baru dengan nama **Tugas**.
2. Sesuaikan sourcode nya seperti yang ada pada file [Main.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2008/Tugas/src/com/tugas/pertemuan8/Main.java "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar dibawah. <br>
![Output - Tugas](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P08%20-%2003.png "Output - Tugas")


> 👉 Lihat kembali penamaan **class** dan penggunaan **package** yang di pakai dalam beberapa program di atas.
