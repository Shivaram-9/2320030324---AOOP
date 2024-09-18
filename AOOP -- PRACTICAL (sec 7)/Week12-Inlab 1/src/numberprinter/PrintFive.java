package numberprinter;

public class PrintFive implements Runnable {
    private final int number;

    public PrintFive(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        }
    }
}
