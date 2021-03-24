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

### Contoh 1

Program berikut ini merupakan program untuk membangun class _kendaraan_. Pada class kendaraan mewaris ke tiga class, yaitu class _pesawat_, _mobil_, dan _kapal_.
1. Buatlah sebuah project baru dengan nama **Contoh 1**.
2. Buat file class _”kendaraan”_.javasesuaikan sourcode nya seperti yang ada pada file [_Konstruktor.java_]( "Buka Github") berikut.
3. Buat file java class baru dengan nama _”pesawat”_"di package transportasi.
4. Sesuaikan source code di file [_pesawat.java_]( "Buka Github").
5. Buat file java class baru dengan nama _”mobil”_ di package transportasi.
6. Sesuaikan source code di file [_mobil.java_]( "Buka Github").
7. Buat file java class baru dengan nama _“kapal”_ di package transportasi.
8. Sesuaikan source code di file [_kapal.java_]( "Buka Github").
9. Buat file java class baru dengan nama _“Transportasi”_ di package transportasi.
10. Sesuaikan source code di file [_Transportasi.java_]( "Buka Github").
3. Jalankan program, maka akan muncul tampilan seperti berikut ini: <br>
![Output - Contoh 1]( "Output - Contoh 1")

### Contoh 2

1. Buatlah sebuah project baru dengan nama **Contoh 2 - Polimorphism**.
2. Buat file class _” Polimorphism”_.javasesuaikan sourcode nya seperti yang ada pada file [_ Polimorphism.java_]( "Buka Github") berikut.
3. Jalankan file _Polimorphism.java_, maka akan muncul keluaran seperti gambar berikut ini: <br>
![Output - Polimorphism]( "Output - Polimorphism")

### Contoh 3

1. Buatlah sebuah project baru dengan nama **Contoh 3**.
2. Buat file class _”Poligon”_.javasesuaikan sourcode nya seperti yang ada pada file [_Poligon.java_]( "Buka Github") berikut.
3. Buat file java class baru dengan nama _”Lingkaran”_"di package tespoligon.
4. Sesuaikan source code di file [_Lingkaran.java_]( "Buka Github").
5. Buat file java class baru dengan nama _”SegiEmpat”_ di package tespoligon.
6. Sesuaikan source code di file [_SegiEmpat.java_]( "Buka Github").
7. Buat file java class baru dengan nama _“Segitiga”_ di package tespoligon.
8. Sesuaikan source code di file [_Segitiga.java_]( "Buka Github").
9. Buat file java class baru dengan nama _“TesPoligon”_ di package transportasi.
10. Sesuaikan source code di file [_TesPoligon.java_]( "Buka Github").
3. Jalankan program, maka akan muncul tampilan seperti berikut ini: <br>
![Output - Poligon]( "Output - Poligon")

## Evaluasi dan Penugasan

Buatlah sebuah program yang mengimplementasikan konsep polymorphisme dari sebuah class dengan nama class hewan. 

1. Buatlah sebuah project baru dengan nama **Pencarian Biner**, dengan class *Hewan*.
2. Sesuaikan sourcode nya seperti yang ada pada file [_Hewan.java_]( "Buka Github") berikut.
3. Jalankan program tersebut sehingga hasilnya seperti gambar berikut:
![Output - Hewan]( "Output - Hewan")
