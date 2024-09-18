package numberprinter;

public class PrintTwo implements Runnable {
    private final int number;

    public PrintTwo(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 2 == 0) {
            System.out.println(number + " is divisible by 2");
        }
    }
}
