# Pertemuan 8

### STMIK Citra Mandiri Padangsidimuan

**Parodi**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Sistem Informasi <br>
**Jumlah Sks**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;3SKS <br>
**Lembaran**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Job Sheet 9 <br>
**Matakuliah**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Bahasa Pemograman I Java<br>
**Topik_**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Pewarisan

### Tujuan

1. Dengan mengikuti perkuliahan ini mahasiswa diharapkan mampu memahami konsep _konstruktor_, _destriktor_, _overriding_, _overloading_ di java.
2. Dengan mengikuti perkuliahan ini mahasiswa diharapkan untuk mampu membuat program yang menggunakan _konstruktor_, _destriktor_, _overriding_, _overloading_ di java.

### Tools

1. Personal Computer
2. IDE / Text Editor

## Teori Singkat

### 1. Konstruktor

+ Fungsi khusus yang namanya sama dengan nama class.
+ Digunakan untuk inisialisasi.
+ Dipanggil otomatis pertama kali saat instansiasi objek.
+ Tidak mengembalikan nilai.
+ Konstruktor dapat dioverloading.

### 2. Destruktor

+ Fungsi khusus yang namanya sama dengan nama class tetapi diawali dengan simbol `'~'`.
+ Digunakan untuk membebaskan memori.
+ Dipanggil secara otomatis pada saat objek dihancurkan.
+ Tidak mengembalikan nilai.
+ Tidak berparameter.
+ Tidak dapat dioverloading.
+ Destruktor hanya terlihat jika instansiasi objeknya menggunakan alokasi memori dinamis.
+ Java mempunyai fasilitas GARBAGE COLLECTION sehingga tidak perlu untuk membuat destruktor secara eksplisit.

### 3. Overriding

Adalah suatu cara untuk mendefinisikan ulang method yang ada pada class induk apabila class anak menginginkan adanya informasi yang lain. Overriding dilakukan dengan cara menulis ulang method yang ada pada class induk dengan syarat bahwa namadan parameter fungsi tersebut harus sama (tidak boleh diubah). Meskipun fungsi telah ditulis ulang oleh class anak, fungsi yang asli pada class induk masih dapat dipanggil di class anak dengan menggunakan class super.

### 4. Overloading

+ Adalah penulisan beberapa fungsi (dua atau lebih) yang memiliki nama yang sama. Pada bahasan overloading dikenal istilah signature. Signature adalah sebuah fungsi parameter lengkap dengan tipe datanya yang terdapat dalam fungsi tersebut. Misalnya terdapat sebuah fungsi berikut:
```java
public int jumlahMahasiswa (int laki2, int perempuan, String kelas);
```
+ Suatu fungsi dikatakan di-overload jika terdapat beberapa fungsi dengan nama yang sama namun memiliki signature yang berbeda-beda, sebagai contoh:
```java
public void infoMahasiswa (int laki2, int perempuan, String kelas) { 
	...
}
public void infoMahasiswa (int mhsLama, int mhsBaru, int mhsCuti, int angkatan) {
	...
}
```

## Langkah Kerja

### Contoh Konstruktor

1. Buatlah sebuah project baru dengan nama **Konstruktor** dengan class *Konstruktor.java*
2. Sesuaikan sourcode nya seperti yang ada pada file [Konstruktor.java]( "Buka Github") berikut.
3. Jalankan program, maka akan muncul tampilan seperti berikut ini: <br>
![Output - Konstruktor]( "Output - Konstruktor")

### Contoh Overriding

1. Buatlah sebuah project baru dengan nama **Overriding**
2. Buat class file dengan nama [_Dosen_uli_v2.java_]( "Buka - Github"), buka Github sesuaikan source code nya.
3. Buat class baru tersebut dengan nama [_rektor.java_]( "Buka - Github"), sesuaikan source code nya.
4. Buat class baru masih di package yang sama dengan nama [_dekan.java_]( "Buka - Github").
5. Buat class baru masih di package yang sama dengan nama [_kalap.java_]( "Buka - Github").
6. Buat class baru masih di package yang sama dengan nama [_dosen.java_]( "Buka - Github").
7. Jalankan file _Dosen_uli_v2.java_, maka akan muncul keluaran seperti gambar berikut ini: <br>
![Output - Overriding]( "Output - Overriding")

### Contoh Overloading

1. Buatlah sebuah project baru dengan nama **Overloading**
2. Buat class file dengan nama [_InformasiMhs_]( "Buka - Github"), buka Github sesuaikan source code nya.
3. Buat class baru tersebut dengan nama [_Mahasiswa.java_]( "Buka - Github") di package yang sama, sesuaikan source code nya.
4. Jalankan program, maka akan muncul tampilan seperti berikut ini: <br>
![Output - Overloading]( "Output - Overloading")
