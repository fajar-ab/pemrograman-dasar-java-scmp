# Pemograman-OOP-Java-SCM
Repo ini berisi kumpulan hasil pembelajaran, tugas dan proyek Pemograman 1 Java untuk mata perkuliahan semester 3 yang saya ikuti di STMIK Citra Mandiri Padangsidempuan.

## 🔧 Tools

### JDK

**JDK** *(Java Development Kit)* merupakan perangkat lunak yang digunakan untuk melakukan proses kompilasi dari kode java ke bytecode yang dapat dimengerti dan dapat dijalankan oleh **JRE** *(Java Runtime Envirotment)*. JDK harus terinstall pada komputer yang akan melakukan proses pembuatan aplikasi berbasis java, namun tidak wajib terinstall di komputer yang akan menjalankan aplikasi yang dibangun dengan java.

### Sublime Text 3

**Sublime text** merupakan suatu text editor yang digunakan untuk menulis sejumlah code serta mampu membuka berbagai macam jenis file. Sebetulnya untuk coding java sendiri, kita juga bisa menggukana **IDE** yang keren-keren seperti *NetBeans*, *Eclipse* dan *IntelliJ IDEA* yang khusus dibuat untuk pengembangan aplikasi berbasis java. Sublime Text 3 saya pilih karna text editor ini sangat ringan saat di gunakan dan juga untuk pembelajaran dasar pemograman java sudah cukup hanya menggunakan text editor.

- [Download](https://www.sublimetext.com/) dan instal **Sublime Text 3**
- **Build System** <br>
  Disini untuk proses build program java di sublime text supaya lebih mudah proses compaile dan run codingannya, Buat System Build sendiri untuk sublime text kita. Caranya dalam sublime text pergi ke menu **Tools>Build System>New Build System..** *klik* nanti muncul text bar baru copy-paste syntax dibawah. <br>
  ```
  {
  	"cmd": ["javac", "$file_name", "&&", "start", "cmd", "/k", "java", "$file_base_name"],
  	"file_regex": "^(...*?):([0-9]*):?([0-9]*)",
  	"path": "C:\\Program Files\\Java\\jdk-15.0.1\\bin",
  	"shell": true,
  	"variants":
  	[
  		{
  			"name": "Run",
  			"shell_cmd": "java \"${file_base_name}\"",
  		}
  	]
  }
  ```
  Simpan filenya dengan nama **Java Compile.sublime-build**. Sekarang tinggal di pakek, pilih sistem buildnya yang uda di buat tadi **C++ Compile** dan tekan di keyboard **Ctrl+B** programnyaakan ngecompile dan jalan langsung ke CMD.