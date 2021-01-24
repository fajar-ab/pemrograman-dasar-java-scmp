package com.percobaan1;

public class MHS1 {

	public static void main(String[] args) {

		System.out.println("Mahasiswa 1 ");
		Mahasiswa mahasiswa_1 = new Mahasiswa();
		mahasiswa_1.setNim(1901001);
		mahasiswa_1.setNama("Udin");
		mahasiswa_1.setJurusan("Sistem Informasi");

		System.out.println("Nim     : " + mahasiswa_1.getNim());
		System.out.println("Nama    : " + mahasiswa_1.getNama());
		System.out.println("Jurusan : " + mahasiswa_1.getJurusan());

		System.out.println("\nMahasiswa 2 ");
		Mahasiswa mahasiswa_2 = new Mahasiswa();
		mahasiswa_2.setNim(1901002);
		mahasiswa_2.setNama("Rino");
		mahasiswa_2.setJurusan("Teknik Informatika");

		System.out.println("Nim     : " + mahasiswa_2.getNim());
		System.out.println("Nama    : " + mahasiswa_2.getNama());
		System.out.println("Jurusan : " + mahasiswa_2.getJurusan());

		System.out.println("\nMahasiswa 3 ");
		Mahasiswa mahasiswa_3 = new Mahasiswa();
		mahasiswa_3.setNim(1901003);
		mahasiswa_3.setNama("Susi");
		mahasiswa_3.setJurusan("Teknik Industri");

		System.out.println("Nim     : " + mahasiswa_3.getNim());
		System.out.println("Nama    : " + mahasiswa_3.getNama());
		System.out.println("Jurusan : " + mahasiswa_3.getJurusan());
	}
}