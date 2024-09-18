package numberprinter;

public class PrintNumber implements Runnable {
    private final int number;

    public PrintNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 2 != 0 && number % 3 != 0 && number % 4 != 0 && number % 5 != 0) {
            System.out.println(number + " is not divisible by 2, 3, 4, 5");
        }
    }
}
