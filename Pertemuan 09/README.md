# Pertemuan 8

### STMIK Citra Mandiri Padangsidimuan

**Parodi**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Sistem Informasi <br>
**Jumlah Sks**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;3SKS <br>
**Lembaran**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Job Sheet 9 <br>
**Matakuliah**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Bahasa Pemograman I Java<br>
**Topik_**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Pewarisan

### Tujuan

1. Dengan mengikuti perkuliahan ini mahasiswa diharapkan mampu memahami konsep Pewarisan di Java OOP.
2. Dengan mengikuti perkuliahan ini mahasiswa diharapkan untuk mampu membuat program java yang menggunakan Pewarisan.

### Tools

1. Personal Computer
2. IDE / Text Editor

## Teori Singkat

**Pewarisan** _(inheritance)_ adalah suatu cara pembuatan class baru dengan menggunakan kembali class yang sudah didefinisikan sebelumnya dengan menambahkan atribut dan method baru. Sehingga dengan demikian class baru tersebut tetap memiliki variabel dan fungsi yang dimiliki oleh class sebelumnya. <br>
Gambar berikut ini menunjukkan hirarki class dosen. Class dosen tersebut memiliki turunan berupa class rektor, klass dekan dan klass kalab(kepala labor). Apabila dirancang ke dalam diagram class, akan nampak seperti gambar berikut:

### Langkah Kerja

### Percobaan 1

Program berikut ini akan mmbuktikan bahwa class MHS1 merupakan class anak karena class MHS1 bisa memanggil method `setNim()`, `setNama()`, `setJurusan`, `getNim()`, `getNama()`, `getJurusan()` padahal pada class MHS1 tidak memiliki method tersebut. Mengapa demikian?? karena class anak mendapat warisan method dan attribut dari class Mahasiswa.
1. Buat Project baru dengan nama **Percobaan 1**.
2. Buat class file dengan nama [_MHS1.java_]( "Buka - Github").

  > jika ada terdeteksi kesalahan, biarkan saja dulu, karena super classnya belum dibuat.

3. Selanjutnya buat _super class_, dengan _package_ yang sama.
4. Berikan nama class baru tersebut dengan nama [_Mahasiswa.java_]( "Buka - Github").
5. Compile dan jalankan project nya, sehingga hasilnya sebagai berikut: <br>
![Output - Percobaan 1]( "Output - Percobaan 1")

### Percobaan 2

Berikut ini kita akan membuat program yang memiliki class induk/superclass _(class dosen)_ yang memiliki atribut **nama**, **nik** dan **jurusan**. Method yang dimiliki oleh class dosen adalah view(). Class turunan dari class **dosen** ada tiga class. Pada class **rektor**, terdapat tambahan atribut berupa `th_mulai` dan `jabatan_ke`, serta method `viewRektor()`. Pada class **dekan** terdapat tambahan atribut `fakultas`, dan method `viewDekan()`. Pada class **kalab** terdapat tambahan atribut `laboratorium`, dan method `viewKalab()`.

1. Buat Project baru dengan nama **Percobaan 2**.
2. Buat class file dengan nama [_Dosen_uli_v1.java_]( "Buka - Github"), buka Github sesuaikan source code nya.
3. Buat class baru tersebut dengan nama [_rektor.java_]( "Buka - Github"), sesuaikan source code nya.
4. Buat class baru masih di package yang sama dengan nama [_dekan.java_]( "Buka - Github").
5. Buat class baru masih di package yang sama dengan nama [_kalap.java_]( "Buka - Github").
6. Buat class baru masih di package yang sama dengan nama [_dosen.java_]( "Buka - Github").
7. Jalankan file _Dosen_uli_v1.java_, maka akan muncul keluaran seperti gambar berikut ini: <br>
![Output - Percobaan 1]( "Output - Percobaan 1")

## Evaluasi dan Penugasan

Buatlah sebuah class kendaraan dengan turunnnya kendaraan darat,kendaraan laut, kemudian diturunkan lagi menjadi sepeda motor dan perahu layar.