class Main {

    public static void main(String[] args) {    

        double[] nil_akhir = {56.5, 66.7, 87.6, 98,5, 78.9, 85.4};

        System.out.println("\nData Yang Diinput ke Elemen Array\n");

        //menampilkan data dari elemen array
        for(int i = 0; i < 6; i++){

            System.out.print("Nilai Akhir Index " + i);
            System.out.println(" = " + nil_akhir[i]);
        }    
    }    
}