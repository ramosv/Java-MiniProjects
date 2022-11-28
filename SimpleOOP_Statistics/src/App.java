import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers: ");

        while (true) {
            int input = Integer.valueOf(sc.nextLine());
            if (input == -1) {
                break;
            } else if (input % 2 == 0) {
                statistics.addNumber(input);
                even.addNumber(input);
            } else if (input % 2 != 0) {
                statistics.addNumber(input);
                odd.addNumber(input);
            }

        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());

    }
}
