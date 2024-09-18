package numberprinter;

import java.lang.Thread;

public class NumberPrinterMain {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            int number = i;

            // Creating threads for each function
            Thread t2 = new Thread(new PrintTwo(number));
            Thread t3 = new Thread(new PrintThree(number));
            Thread t4 = new Thread(new PrintFour(number));
            Thread t5 = new Thread(new PrintFive(number));
            Thread tPrint = new Thread(new PrintNumber(number));

            // Starting threads
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            tPrint.start();

            // Ensuring all threads finish before moving to the next number
            try {
                t2.join();
                t3.join();
                t4.join();
                t5.join();
                tPrint.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
