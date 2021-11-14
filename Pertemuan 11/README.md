# Pertemuan 11

### STMIK Citra Mandiri Padangsidimuan

**Parodi**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Sistem Informasi <br>
**Jumlah Sks**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;3SKS <br>
**Lembaran**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Job Sheet 11 <br>
**Matakuliah**&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Bahasa Pemograman I Java<br>
**Topik_**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;Polimorfisme

### Tujuan

1. Dengan mengikuti perkuliahan ini mahasiswa diharapkan mampu menerapkan konsep **polimorfisme** dalam pemograman.

### Tools

1. Personal Computer
2. IDE / Text Editor

## Teori Singkat

**Polimorfisme** digunakan untuk menyatakan suatu nama yang merujuk pada beberapa fungsi yang berbeda _(Sinaga, 2004)_. Pada polimorfisme, rujukan dapat dilakukan pada berbagai tipe objek. Hal ini dilakukan karena setiap objek dimungkinkan diperhatikan hal-hal sebagai berikut _(Rickyanto, 2005)_:
- Method yang dipanggil harus melalui variabel dari super class.
- Method yang dipanggil juga harus merupakan method yang ada pada super class
- Signature method harus sama baik yang ada pada super class maupun di subclass
- Method access attribute pada subclass tidak boleh lebih terbatas daripada yang ada 

## Langkah Kerja

> 👉 &nbsp; Lihat penamaan **class** dan penggunaan **package** yang di pakai dalam beberapa source code project.


### Contoh 1

Program berikut ini merupakan program untuk membangun class _kendaraan_. Pada class kendaraan mewaris ke tiga class, yaitu class _pesawat_, _mobil_, dan _kapal_.
1. Buatlah sebuah project baru dengan nama **Contoh 1**.
2. Buat file class _”kendaraan”_. sesuaikan sourcode nya seperti yang ada pada file [_kendaraan.java_](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2011/Contoh%201/src/trasportasi/kendaraan.java "Buka Github") berikut.
3. Buat file java class baru dengan nama _”pesawat”_"di package transportasi.
4. Sesuaikan source code di file [_pesawat.java_](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2011/Contoh%201/src/trasportasi/pesawat.java "Buka Github").
5. Buat file java class baru dengan nama _”mobil”_ di package transportasi.
6. Sesuaikan source code di file [_mobil.java_](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2011/Contoh%201/src/trasportasi/mobil.java "Buka Github").
7. Buat file java class baru dengan nama _“kapal”_ di package transportasi.
8. Sesuaikan source code di file [_kapal.java_](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2011/Contoh%201/src/trasportasi/kapal.java "Buka Github").
9. Buat file java class baru dengan nama _“Transportasi”_ di package transportasi.
10. Sesuaikan source code di file [_Transportasi.java_](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2011/Contoh%201/src/trasportasi/Transportasi.java "Buka Github").
3. Jalankan program, maka akan muncul tampilan seperti berikut ini: <br>
![Output - Contoh 1](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P11%20-%2001.png "Output - Contoh 1")

### Contoh 2

1. Buatlah sebuah project baru dengan nama **Contoh 2 - Polimorphism**.
2. Buat file class _” Polimorphism”_. sesuaikan sourcode nya seperti yang ada pada file [_Polimorphism.java_](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2011/Contoh%202%20-%20Polimorphism/src/polimorphism/Polimorphism.java "Buka Github") berikut.
3. Jalankan file _Polimorphism.java_, maka akan muncul keluaran seperti gambar berikut ini: <br>
![Output - Polimorphism](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P11%20-%2002.png "Output - Polimorphism")

### Contoh 3

1. Buatlah sebuah project baru dengan nama **Contoh 3**.
2. Buat file class _”Poligon”_. sesuaikan sourcode nya seperti yang ada pada file [_Poligon.java_](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2011/Contoh%203%20-%20Poligon/src/tespoligon/Poligon.java "Buka Github") berikut.
3. Buat file java class baru dengan nama _”Lingkaran”_"di package tespoligon.
4. Sesuaikan source code di file [_Lingkaran.java_](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2011/Contoh%203%20-%20Poligon/src/tespoligon/Lingkaran.java "Buka Github").
5. Buat file java class baru dengan nama _”SegiEmpat”_ di package tespoligon.
6. Sesuaikan source code di file [_SegiEmpat.java_](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2011/Contoh%203%20-%20Poligon/src/tespoligon/SegiEmpat.java "Buka Github").
7. Buat file java class baru dengan nama _“Segitiga”_ di package tespoligon.
8. Sesuaikan source code di file [_Segitiga.java_](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2011/Contoh%203%20-%20Poligon/src/tespoligon/Segitiga.java "Buka Github").
9. Buat file java class baru dengan nama _“TesPoligon”_ di package transportasi.
10. Sesuaikan source code di file [_TesPoligon.java_](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2011/Contoh%203%20-%20Poligon/src/tespoligon/TesPoligon.java "Buka Github").
3. Jalankan program, maka akan muncul tampilan seperti berikut ini: <br>
![Output - Poligon](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P11%20-%2003.png "Output - Poligon")

## Evaluasi dan Penugasan

Buatlah sebuah program yang mengimplementasikan konsep polymorphisme dari sebuah class dengan nama class hewan. 

1. Buatlah sebuah project baru dengan nama **Tugas**, dengan class *Hewan*.
2. Sesuaikan sourcode nya seperti yang ada pada file [_Hewan.java_](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Pertemuan%2011/Tugas/src/com/tugas/Hewan.java "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut:
![Output - Hewan](https://github.com/Fajar-ab/Pemograman-Dasar-JAVA-SCM/blob/master/Image/%23P11%20-%2004.png "Output - Hewan")

<br><br>

## 📢 Perhatian
> 👉 &nbsp; Lihat kembali penamaan **class** dan penggunaan **package** yang di pakai dalam beberapa ource code project di atas.