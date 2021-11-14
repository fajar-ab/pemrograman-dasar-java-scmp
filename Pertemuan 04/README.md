# Pertemuan 4

### STMIK Citra Mandiri Padangsidimuan

**Parodi**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Sistem Informasi <br>
**Jumlah Sks**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;3SKS <br>
**Lembaran**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Job Sheet 4 <br>
**Matakuliah**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Bahasa Pemograman I <br>
**Topik_**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Perulangan
### Tujuaan

1. Dengan mengikuti perkuliahan ini mahasiswa diharapkan mampu memahami konsep perulangan di OOP.
2. Dengan mengikuti perkuliahan ini mahasiswa diharapkan untuk mampu membuat program yang penggunakan perulangan di OOP.

### Tools

1. Personal Computer
2. IDE / Text Editor 

## Teori Singkat

### Perulangan (Loop)

- Misalnya kita akan menentukan kelulusan seorang mahasiswa untuk suatu matakuliah. Bagaimana bila kita ingin memproses data dari 100 atau 500 mahasiswa? Sangatlah tidak efisien bila kita menjalankan program sebanyak itu menuliskan blok statemen sejumlah itu. Dibutuhkan perulangan (loop) untuk menangani masalah ini.
- Perulangan dapat dilakukan dengan beberapa cara, misalnya:
	- Perulangan **for**
	- Perulangan **while**
	- Perulangaan **do..while**

#### 1. Perulangan **For**

- Bentuk **while** adalah yang paling sering digunakan. **for** akan mengulang suatu statement atau blok statement sejumlah yang dikehendaki, yakni bila kondisi akhir telah tercapai.
- Bentuk umum:
```java
for(kondisi awal; persyaratan/kondisi akhir; increment - decrement) {

	Block Statement...;

}
```

#### 2. Perulangan **While**

- bentuk ini akan terus mengulang statement/blok statement selama kondisi yang ditentukan belum tercapai.
- Sama seperti **for**, kondisi adalah ekspresi boolean atau fungsi yang dapat menghasilkan nilai boolean benar atau salah.
- Bentuk umum:
```java
while(kondisi) {

	Block Statement...;
}
```

#### 3. Perulangan **Do..While**

- Pada bentuk ini, keyword while diletakkan pada bagian akhir dari perulangan (setelah blok statement)
- Bentuk umum:
```java
do {

	Block Statement...;

} while(kondisi);
```

### Keyword **break** dan **continue**

- **Break** <br>
Berfungsi untuk menghentikan statement yang terletak pada bagian loop yang terdalam. Biasanya digunakan bersama dengan statement yang mengandung **if**.

- **Continue** <br> 
Keyword ini hanya menghentikan perulangan yang sedang berlangsung. Kendali program akan menuju akhir dari body loop.

## Langkah Kerja

> 👉 &nbsp; Lihat penamaan **class** dan penggunaan **package** yang di pakai dalam beberapa source code project.


### Contoh program perulangan For

1. Buatlah sebuah project baru dengan nama **Demo For** dengan class *DemoFor.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [DemoFor.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2004/Demo%20For/src/demofor/DemoFor.java "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Demo For](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P04%20-%2001.png "Output - Demo For")

### Contoh program perulangan While

1. Buatlah sebuah project baru dengan nama **Demo While** dengan class *DemoWhile.java*
2. Sesuaikan sourcode nya seperti yang ada pada file [DemoWhile.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2004/Demo%20While/src/demowhile/DemoWhile.java "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Demo While](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P04%20-%2002.png "Output - Demo While #1")
4. Ubah pernyataan: <br>
	- **counter = 0** menjadi **counter = 5**, 
	- pernyataan **while(counter <= 5)** dengan **while(counter >= 1)**, 
	- dan, **++counter** menjadi **--counter** 

```java
	int counter = 5;
	.....
	while(counter >= 1) {
		......
		--counter;
	}
```
5. Amati hasilnya <br>
![Output - Demo While](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P04%20-%2003.png "Output - Demo While #2")

### Contoh program perulangan Do..While

1. Buatlah sebuah project baru dengan nama Demo Do While
2. Sesuaikan sourcode nya seperti yang ada pada file [DemoDoWhile.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2004/Demo%20Do_While/src/demodowhile/DemoDoWhile.java "Buka Github") berikut.
3. Jalankan program, maka akan muncul tampilan seperti berikut ini: <br>
![Output - Demo While](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P04%20-%2004.png "Output - Demo While #1")

### Contoh program keyword **Break**

1. Buatlah sebuah project baru dengan nama **Demo Break** dengan class *DemoBreak.java*
2. Sesuaikan sourcode nya seperti yang ada pada file [DemoBreak.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2004/Demo%20Break/src/demobreak/DemoBreak.java "Buka Github") berikut.
3. Jalankan program, maka akan muncul tampilan seperti berikut ini: <br>
![Output - Demo While](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P04%20-%2005.png "Output - Demo While")

### Contoh program keyword Continue

1. Buatlah sebuah project baru dengan nama **Demo Continue** dengan class *DemoContinue.java*
2. Sesuaikan sourcode nya seperti yang ada pada file [DemoContinue.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2004/Demo%20Continue/src/democontinue/DemoContinue.java "Buka Github") berikut.
3. Jalankan program, maka akan muncul tampilan seperti berikut ini: <br>
![Output - Demo While](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P04%20-%2006.png "Output - Demo Continue")

### Contoh program perulangan lainnya - Bilangan Prima

1. Buatlah sebuah project baru dengan nama **Project (_BilanganPrima_)**
2. Sesuaikan sourcode nya seperti yang ada pada file [BilanganPrima.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2004/Project%20(BilanganPrima)/src/bilanganprima/BilanganPrima.java "Buka Github") berikut.
3. Jalankan program, maka akan muncul tampilan seperti berikut ini: <br>
![Output - Demo While](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P04%20-%2007.png "Output - Project BilanganPrima")

### Contoh program perulangan lainnya - Bilangan Genap

> program menampikan bilangan genap dari 1-10 menggunakan While loop.

1. Buatlah sebuah project baru dengan nama **Project (_BilanganGenap_)**
2. Sesuaikan sourcode nya seperti yang ada pada file [BilanganGenap.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2004/Project%20(BilanganGenap)/src/bilangangenap/BilanganGenap.java "Buka Github") berikut.
3. Jalankan program, maka akan muncul tampilan seperti berikut ini: <br>
![Output - Demo While](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P04%20-%2008.png "Output - Project BilanganGenap")

### Contoh program perulangan lainnya - Menjumlahkan bilangan bulat

1. Buatlah sebuah project baru dengan nama **Jumlah**
2. Sesuaikan sourcode nya seperti yang ada pada file [Jumlah.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2004/Project%20(jumlah)/src/jumlah/Jumlah.java "Buka Github") berikut.
3. Jalankan program, maka akan muncul tampilan seperti berikut ini: <br>
![Output - Demo While](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P04%20-%2009.png "Output - Project Jumlah")

## Evaluasi dan Penugasan

- **Buatlah sebuah program untuk menampilkan bilangan ganjil dari 100-186!**
	- Lihat Program [Tugas 1 - Main.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2004/Tugas%201/src/tugas1/Main.java "Buka Github").
	- Compile dan jalankan proramnya.
	- Maka. outputnya akan seperti yang dibawah. <br>
	![Output - Tugas 1](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P04%20-%2010.png "Output - Tugas 1")
- **Buatlah program rata-rata bilangan positif, dimana banyaknya data ditentukan dari data yang dimasukkan dengan keyboard, hasil output yang diinginkan sebagai berikut:**
![Output - Tugas 2](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P04%20-%2011.png "Output - Tugas 2")
	- Lihat Program [Tugas 2 - Main.java](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2004/Tugas%202/src/tugas2/Main.java "Buka Github").
	- Compile dan jalankan proramnya.
	- Maka. outputnya akan seperti diatas. <br>

<br><br>

## 📢 Perhatian
> 👉 &nbsp; Lihat kembali penamaan **class** dan penggunaan **package** yang di pakai dalam beberapa ource code project di atas.