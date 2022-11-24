import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int longest = 0;
        String name = "";

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("")) {
                break;
            }

            String[] pieces = word.split(",");

            if (pieces[0].length() > longest) {
                longest = pieces[0].length();
                name = pieces[0];

            }

            sum += Integer.valueOf(pieces[1]);
            count++;
        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of birth years: " + 1.0 * sum / count);
    }
}
