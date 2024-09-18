package numberprinter;

public class PrintFour implements Runnable {
    private final int number;

    public PrintFour(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 4 == 0) {
            System.out.println(number + " is divisible by 4");
        }
    }
}
