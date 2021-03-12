// Program Demo Break - Pertemuan 4

package demobreak;

public class DemoBreak {
    
    public static void main(String[] args) {
    	int counter = 0;

    	System.out.println("\nPROGRAM DEMO BREAK");
    	System.out.println("-------------------");

    	while(counter < 100) {
    		counter++;
    		if(counter == 7) break;
    	}

    	System.out.println("Counter terakhir adalah: " + counter);
    }
}
