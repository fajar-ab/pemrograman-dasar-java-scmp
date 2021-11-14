# Pertemuan 6

### STMIK Citra Mandiri Padangsidimuan

**Parodi**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Sistem Informasi <br>
**Jumlah Sks**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;3SKS <br>
**Lembaran**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Job Sheet 6 <br>
**Matakuliah**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Bahasa Pemograman I <br>
**Topik_**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Array (Lanjutan)

### Tujuan

1. Dengan mengikuti perkuliahan ini mahasiswa diharapkan mampu memahami konsep array di OOP.
2. Dengan mengikuti perkuliahan ini mahasiswa diharapkan untuk mampu membuat program yang penggunakan array di OOP.

### Tools

1. Personal Computer
2. IDE / Text Editor

## Teori Singkat

+ **Array** adalah suaty entitas _(kesatuan)_ yang beranggotakan elemen-elemen / variabel bertipe data sama dan dapat diakses dengan memanggil nama array beserta indeks elemennya.
+ **Variabel Array** dideklarasikan dengan dua cara: <br>
	`int [] deretBilangan;` <br>
	`int deretBilangan[];`
+ **Mengurutkan Elemen Array _(Sorting)_** <br>
  Misalnya ada array: {2,1,17,89,4,5} dan anda diminta untuk mengurutkan data mulai dari yang terkecil sampai terbesar sehingga menjadi {1,2,4,5,17,89}.
+ **Mencari Elemen Array _(Searching)_** <br>
  Ada 2 algoritma untuk mencari elemen array, yaitu:
  - Pencarian **Linear** _(Linear Search)_
  	+ Algoritma ini akan mencari elemen berdasarkan suatu kunci _(key)_, yang berupa bilangan atau karakter yang diinginkan
  - Pencarian **Biner** _(Binary Search)_
  	+ Merupakan perbaikan dari konsep sebelumnya _(pencarian linier)_ karena lebih efisien. Dengan algoritma ini, kita tidak perlu memeriksa semua elemen sehingga menghemat waktu pencarian.

## Langkah Kerja

> 👉 &nbsp; Lihat penamaan **class** dan penggunaan **package** yang di pakai dalam beberapa source code project.

### Contoh 1

Program berikut ini menunjukkan aplikasi variabel penjualan yang bertipe array dimana setiap elemen bertipe integer
1. Buatlah sebuah project baru dengan nama **Contoh 1**, dengan class *Contoh1.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [Contoh1.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2006/Contoh%201/src/com/contoh1/Contoh1.java "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Contoh 1](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P06%20-%2001.png "Output - Contoh 1")

### Contoh 2

Diketahui daftar nilai matakuliah Pratikum Bahasa Pemrograman II untuk 5 mahasiswa sebagaimana yang terlihat pada tabel berikut:
<table>
	<tr>
		<td rowspan="2"><center><b>Mahasiswa ke</b></center></td>
		<td colspan="3"><center><b>Nilai</b></center></td>
	</tr>
	<tr>
		<td><center><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tugas&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></center></td>
		<td><center><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;UTS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></center></td>
		<td><center><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;UAS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></center></td>
	</tr>
	<tr>
		<td><center>1</center></td>
		<td><center>50</center></td>
		<td><center>60</center></td>
		<td><center>70</center></td>
	</tr>
	<tr>
		<td><center>2</center></td>
		<td><center>70</center></td>
		<td><center>75</center></td>
		<td><center>87</center></td>
	</tr>
	<tr>
		<td><center>3</center></td>
		<td><center>89</center></td>
		<td><center>90</center></td>
		<td><center>90</center></td>
	</tr>
	<tr>
		<td><center>4</center></td>
		<td><center>65</center></td>
		<td><center>76</center></td>
		<td><center>89</center></td>
	</tr>
	<tr>
		<td><center>5</center></td>
		<td><center>65</center></td>
		<td><center>70</center></td>
		<td><center>80</center></td>
	</tr>
</table>

Selanjutnya akan dicari nilai akhir untuk setiap mahasiswa yang merupakan nilai rata-rata dari ketiga komponen penilaian (Rata2, Tugas, UTS, UAS). Selanjutnya, pemberian nilai dengan huruf diberikan dengan ketentuan konversi sebagai berikut:
<table>
	<tr>
		<td><center><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Nilai&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></center></td>
		<td><center><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Huruf&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></center></td>
	</tr>
	<tr>
		<td><center>Nilai &gt; 80</center></td>
		<td><center>A</center></td>
	</tr>
	<tr>
		<td><center>70 &lt; Nilai &le; 80</center></td>
		<td><center>B</center></td>
	</tr>
	<tr>
		<td><center>60 &lt; Nilai &le; 70</center></td>
		<td><center>C</center></td>
	</tr>
	<tr>
		<td><center>50 &lt; Nilai &le; 60</center></td>
		<td><center>D</center></td>
	</tr>
	<tr>
		<td><center>Nilai &lt; 50</center></td>
		<td><center>E</center></td>
	</tr>
</table>

Langkah-langkah :<br>
1. Buatlah sebuah project baru dengan nama **Contoh 2**, dengan class *Contoh2.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [Contoh2.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2006/Contoh%202/src/com/contoh2/Contoh2.java "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Contoh 2](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P06%20-%2002.png "Output - Contoh 2")

### Contoh 3

Langkah-langkah :<br>
1. Buatlah sebuah project baru dengan nama **Contoh 3**, dengan class *Contoh3.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [Contoh3.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2006/Contoh%203/src/com/contoh3/Contoh3.java "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Contoh 3](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P06%20-%2003.png "Output - Contoh 3")

### Contoh 4

Langkah-langkah :<br>
1. Buatlah sebuah project baru dengan nama **Contoh 4**, dengan class *Contoh4.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [Contoh4.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2006/Contoh%204/src/com/contoh4/Contoh4.java "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Contoh 4](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P06%20-%2004.png "Output - Contoh 4")

### Contoh 5

Langkah-langkah :<br>
1. Buatlah sebuah project baru dengan nama **Contoh 5**, dengan class *Contoh5.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [Contoh5.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2006/Contoh%205/src/com/contoh5/Contoh5.java "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Contoh 5](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P06%20-%2005.png "Output - Contoh 5 #1")
![Output - Contoh 5](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P06%20-%2006.png "Output - Contoh 5 #2")

### Contoh 6

Langkah-langkah :<br>
1. Buatlah sebuah project baru dengan nama **Contoh 6**, dengan class *Contoh6.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [Contoh6.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2006/Contoh%206/src/com/contoh6/Contoh6.java "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Contoh 6](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P06%20-%2007.png "Output - Contoh 6")

## Evaluasi dan Penugasan

Buatlah sebuah program untuk mencari nilai matematika mahasiswa (yang terdiri dari 10 mahasiswa) tertinggi dan terendah dari 10 data nilai yang diinputkan ketika program dijalankan, contoh tampilan hasinya adalah seperti yang terlihat pada gambar berikut: <br>
![Output - Tugas](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P06%20-%2008.png "Output - Tugas")

Langkah-langkah :<br>
1. Buatlah sebuah project baru dengan nama **Tugas**.
2. Sesuaikan sourcode nya seperti yang ada pada file [Main.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2006/Contoh%206/src/com/contoh6/Contoh6.java "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar diatas.

<br><br>

## 📢 Perhatian
> 👉 &nbsp; Lihat kembali penamaan **class** dan penggunaan **package** yang di pakai dalam beberapa ource code project di atas.