# Pertemuan 7

### STMIK Citra Mandiri Padangsidimuan

**Parodi**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Sistem Informasi <br>
**Jumlah Sks**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;3SKS <br>
**Lembaran**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Job Sheet 7 <br>
**Matakuliah**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Bahasa Pemograman I <br>
**Topik_**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;String

### Tujuan

1. Dengan mengikuti perkuliahan ini mahasiswa diharapkan mampu memahami konsep String di Java.
2. 2.Dengan mengikuti perkuliahan ini mahasiswa diharapkan untuk mampu membuat program yang penggunakan String di Java OOP.

### Tools

1. Personal Computer
2. IDE / Text Editor

## Teori Singkat

**String** merupakan deretan karakter. Pada java, string merupakan objek dari kelas _String_. Penulisan string dilakukan dengan mengapit data menggunakan tanda petik (ganda).

Contoh:
```java 
String judul = “Pemograman Berorientasi Objek”
```

### Mengetahui Panjang String

Untuk mengetahui panjang string dapat digunakan method `length()`. <br>
Ikuti langkah berikut untuk membuat contoh programnya:
1. Buatlah sebuah project baru dengan nama **Panjang String**, dengan class *PanjangString.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [PanjangString.java]( "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Panjang String]( "Output - Panjang String")

### Mengetahui Kesamaan Antara Dua String:

Untuk mengetahui kesamaan antara dua string dapat digunakan operator **`==`** atau method `equals(String)`. <br>
Ikuti langkah berikut untuk membuat contoh programnya:
1. Buatlah sebuah project baru dengan nama **Kesamaan String**, dengan class *KesamaanString.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [KesamaanString.java]( "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Kesamaan String]( "Output - Kesamaan String")

### Melakukan Pembandingan Karakter-Karakter Pada String

Untuk melakukan perbandingan karakter-karakter secara berurutan dari awal string dapat digunakan method `compareTo().` <br>
Ikuti langkah berikut untuk membuat contoh programnya:
1. Buatlah sebuah project baru dengan nama **PerbandinganString**, dengan class *PerbandinganString.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [PerbandinganString.java]( "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Perbandingan String]( "Output - Perbandingan String")

### Mendapatkan Karakter Pada Posisi Tertentu

Untuk mendapatkan karakter pada posisi tertentu dapat digunakan method `charAt(intPosisi)`. Posisi pertama bernilai integer 0, hingga posisi terakhir bernilai N-1 (dengan N adalah panjang string).
Program berikut ini menunjukkan penulisan kode program untuk menampilkan karakter pada posisi tertentu yang diberikan secara random dan diulang sebanyak sepuluh kali. <br>
Ikuti langkah berikut untuk membuat contoh programnya:
1. Buatlah sebuah project baru dengan nama **Posisi Karakter 1**, dengan class *PosisiKarakter.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [PosisiKarakter.java]( "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Posisi Karakter]( "Output - Posisis Karakter")

### Mendapatkan Posisi Karakter Pada String

Untuk mendapatkan posisi karakter pada string dapat dilakukan dengan dua cara sebagai berikut:
+ Apabila posisi awal pencarian tidak ditentukan, maka untuk mendapatkan posisi karakter pada string dapat digunakan method `indexOf(char Karakter)`. Apabila karakter tidak ditemukan, maka akan memberikan nilai -1.
+ Apabila posisi awal pencarian telah ditentukan, maka untuk mendapatkan posisi pada string dapat digunakan method `indexOf(char Karakter, int Awal)`. Nilai Awal merupakan bilangan integer yang menunjukkan posisi awal pencarian. Apabila karakter tidak ditemukan, maka akan diberikan nilai -1.

Ikuti langkah berikut untuk membuat contoh programnya:
1. Buatlah sebuah project baru dengan nama **Posisi Karakter 2**, dengan class *PosisiKarakter.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [PosisiKarakter.java]( "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Posisi Karakter]( "Output - Posisis Karakter")

### Melakukan Konversi Huruf Besar (Kapital) Ke Huruf Kecil Dan Sebaliknya

Untuk melakukan konversi huruf besar ke huruf kecil dapat digunakan method `toLowerCase()`. <br>
Untuk melakukan konversi huruf kecil ke huruf besar dapat digunakan method `toUpperCase()`.

Ikuti langkah berikut untuk membuat contoh programnya:
1. Buatlah sebuah project baru dengan nama **Konversi Karakter 2**, dengan class *KonversiKarakter.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [KonversiKarakter.java]( "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Konversi Karakter]( "Output - PKonversi Karakter")

### Melakukan Penyambungan Antar 2 atau Lebih String

Untuk melakukan penyambungan antar 2 atau lebih string, dapat digunakan operator **`+`**.  
Ikuti langkah berikut untuk membuat contoh programnya:
1. Buatlah sebuah project baru dengan nama **Penggabungan String**, dengan class *PenggabunganString.java*.
2. Sesuaikan sourcode nya seperti yang ada pada file [PenggabunganString.java]( "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut: <br>
![Output - Penggabungan String]( "Output - Penggabungan String")

## Evaluasi dan Penugasan

Buatlah sebuah program menggunakan string untuk menyelesaikan permasalahan berikut:
+ Terdapat daftar nama barang di sebuah toko komputer (cukup 10 jenis barang) yang belum tersusun urutannya.
+ Urutkanlah daftar nama barang tersebut dari A ke Z.
+ Dan untuk menseragamkan tulisan, ubahlah seluruh tulisannya menjadi huruf kapital.
  
Langkah-langkah :<br>
1. Buatlah sebuah project baru dengan nama **Tugas _(mengurutkan nama barang)_**.
2. Sesuaikan sourcode nya seperti yang ada pada file [Main.java]( "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar dibawah: <br>
![Output - Tugas]( "Output - Tugas")