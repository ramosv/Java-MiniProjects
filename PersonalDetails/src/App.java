import java.util.Scanner;

/*
Problem: 
Write a program that reads names and birth years from the user until an empty line is entered. The name and birth year are separated by a comma.

After that the program prints the longest name and the average of the birth years. If multiple names are equally longest, you can print any of them. You can assume that the user enters at least one person.

TEST DATA
 *  sebastian,2017
    lucas,2017
    lily,2017
    hanna,2014
    gabriel,2009
 * 
 */

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
