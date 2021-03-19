import java.util.*;

class Main {

    public static void main(String[] args) {

        int[] nil_akhir;            // deklarasi variabel array
        nil_akhir = new int[6];     // membuat objek array
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {

            System.out.print("Masukkan array ke "+ i +" = ");
            nil_akhir[i] = userInput.nextInt();
        }

        System.out.println("\nData Yang Diinput Ke Elemen Array\n");

        for (int i = 0; i < 6; i++) {

            System.out.print("Nilai Akhir Index " + i);
            System.out.println(" = " + nil_akhir[i]);
        }
    }
}