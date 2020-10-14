package com.program1;

public class Operasi {
    
    int nilai1;
    int nilai2;
    int hasil1;
    float hasil2;

    public Operasi(int nilai1, int nilai2) {

    	this.nilai1 = nilai1;
    	this.nilai2 = nilai2;
    }

    int getNialiPenjumlahan(){

    	hasil1 = nilai1 + nilai2;
    	return hasil1;
    } 

    int getNilaiPengurangan() {

    	hasil1 = nilai1 - nilai2;
    	return hasil1;
    }

    float getNilaiPembagian() {

    	hasil2 = (float)nilai1 / (float)nilai2;
    	return hasil2;
    }

    int gitNilaiPerkalian() {

    	hasil1 = nilai1 * nilai2;
    	return hasil1;
    }
}