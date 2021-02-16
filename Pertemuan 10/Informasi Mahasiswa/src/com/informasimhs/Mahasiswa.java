package com.informasimhs;

public class Mahasiswa {

   // Informasi tentang mahasiswa kelas A
	public void infoMahasiswa(int laki2, int perempuan, String kelas) {
		int jumlah = laki2 + perempuan;
		System.out.println(kelas + " , jumlah mahasiswa : " + jumlah);
	}

	// Informasi tentang mahasiswa sampai tahun 2008
	public void infoMahasiswa(int mhsLama, int mhsBaru, int mhsCuti, int angkatan) {
		int jumlah = mhsLama + mhsBaru + mhsCuti;
		System.out.println("Sampai tahun " + angkatan + " , jumlah mahasiswa : " + jumlah);
	}
}
