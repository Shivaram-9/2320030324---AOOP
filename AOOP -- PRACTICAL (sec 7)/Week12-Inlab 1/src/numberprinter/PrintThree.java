package numberprinter;

public class PrintThree implements Runnable {
    private final int number;

    public PrintThree(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3");
        }
    }
}
