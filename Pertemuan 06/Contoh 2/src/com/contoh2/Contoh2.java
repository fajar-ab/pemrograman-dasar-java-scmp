package com.contoh2;

public class Contoh2 {
    
    public static void main(String[] args) {
    	int[][] nilai = {{50,60,70},{70,75,87},{89,90,90},{65,76,89},{65,70,80}};
    	int n = nilai.length;
    	char huruf;

    	for(int i = 0; i < n; i++){
    		int m = nilai[i].length;
    		double nilaiTotal = 0;
    		for(int j = 0; j < m; j++){
    			nilaiTotal += nilai[i][j];
    		}
    		double rata2 = nilaiTotal / m;
    		if(rata2 > 80.00){
    			huruf = 'A';
    		}else if(rata2 > 70.00){
    			huruf = 'B';
    		}else if(rata2 > 60.00){
    			huruf = 'B';
    		}else if(rata2 > 50.00){
    			huruf = 'B';
    		}else{
    			huruf = 'E';
    		}

    		System.out.printf("Nilai mahasiswa ke-%d = %.2f (%s)\n",(i+1), rata2, huruf);
    	}
    }
}
