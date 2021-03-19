import java.util.*;

class Main {

    public static void main(String[] args) {

        int[][] data_jual = new int[3][3];
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("Masukkan Data Jual ke ["+ i +"] ["+ j +"] = ");
                data_jual[i][j] = userInput.nextInt();
            }
            System.out.println();
        }

        System.out.println("\nData Yang Diinput ke Elemen Array\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("Nilai Data Jual ["+ i +"] ["+ j +"]");
                System.out.println(" = " + data_jual[i][j]);
            }
            System.out.println();
        }
    }
}