import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String file = scanner.nextLine();

        Recipe list = new Recipe();

        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                list.readFile(row);
            }
            list.list();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Commands: ");
        System.out.println("list - lists of recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {
            String input = scanner.nextLine();
            System.out.println("Enter command: ");
            if (input.equals("stop"))
                break;
            else if (input.equals("list")) {
                list.listPrint();
            } else if (input.equals("find name")) {
                System.out.println("Searched word: ");
                String next = scanner.nextLine();
                list.findName(next);
            } else if (input.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                String next = scanner.nextLine();
                list.findTime(next);
            } else if (input.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String next = scanner.nextLine();
                list.findIngredient(next);
            }
        }

    }

}
