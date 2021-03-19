class Main {

    public static void main(String[] args) {

        int[][] nil_akhir = {{150, 159, 230}, {100,125,150}, {210,125,156}};

        System.out.println("Data Yang Diinput ke Elemen Array \n");

        // //menampilkan data dari elemen array
        for(int i = 0; i < 3; i++) {        
            for(int j = 0; j < 3; j++) {

                System.out.print("Nilai Akhir Index ["+i+"] ["+j+"]");
                System.out.println(" = " + nil_akhir[i][j]);
            }    
        }        
    }        
}   