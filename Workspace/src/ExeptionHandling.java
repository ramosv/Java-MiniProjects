import java.util.*;

public class ExeptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int int1 = sc.nextInt();
            int int2 = sc.nextInt();

            int answer = int1 / int2;
            System.out.println(answer);

        } catch (ArithmeticException e1) {
            System.out.println("Error: Cannot divide by 0");

        } catch (InputMismatchException e2) {
            System.out.println("Error: invalid input");

        }

    }

}