import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(reverse(number));

    }

    public static boolean reverse(int x) {
        int reversed = 0, original = x, remainder;

        while (x != 0) {
            remainder = x % 10;
            reversed = reversed * 10 + remainder;
            x /= 10;

        }
        System.out.println("Number: " + original);
        System.out.println("Reversed: " + reversed);
        if (original == reversed) {
            return true;
        }
        return false;
    }
}
