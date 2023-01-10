import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.platform.console.shadow.picocli.CommandLine.Help.Column;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        int games = 0;
        int win = 0;
        int losses = 0;

        try (Scanner sc = new Scanner(Paths.get(file))) {

            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                String[] pieces = row.split(",");
                int h = Integer.valueOf(pieces[2]);
                int a = Integer.valueOf(pieces[3]);

                if (pieces[0].equals(team)) {
                    games++;
                    if (h > a) {
                        win++;
                    } else {
                        losses++;
                    }
                } else if (pieces[1].equals(team)) {
                    games++;
                    if (h > a) {
                        losses++;
                    } else {
                        win++;
                    }

                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + losses);
    }
}
