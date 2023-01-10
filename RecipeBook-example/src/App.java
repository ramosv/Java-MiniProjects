
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.IntConsumer;

import javax.sound.sampled.SourceDataLine;
import javax.xml.catalog.CatalogResolver;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        System.out.println("File to read: ");
        String file = sc.nextLine();

        try (Scanner fileReader = new Scanner(new File(file))) {

            while (fileReader.hasNextLine()) {
                String name = fileReader.nextLine();
                int time = Integer.valueOf(fileReader.nextLine());
                Recipe recipe = new Recipe(name, time);

                // add recipe to the list above
                recipes.add(recipe);

                // add ingredients
                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.isEmpty())
                        break;
                    recipe.addIngredient(ingredient);
                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e);

        }

        System.out.println("Commands: \n" +
                "list - list the receipes \n" +
                "stop - stops the program \n" +
                "find name - searches recipes by name \n" +
                "find cooking time - searches recipes by cooking time \n" +
                "find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("Enter command: ");
            String input = sc.nextLine();
            if (input.equals("stop"))
                break;
            if (input.equals("list")) {
                System.out.println("Recepies: ");
                for (Recipe x : recipes) {
                    System.out.println(x);
                }
            }
            if (input.equals("find name")) {
                System.out.println("Searched word: ");
                String word = sc.nextLine();
                for (Recipe x : recipes) {
                    if (x.nameContains(word)) {
                        System.out.println(x);
                    }
                }
            }
            if (input.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int max = Integer.valueOf(sc.nextLine());

                for (Recipe x : recipes) {
                    if (x.cookingTimeMax(max)) {
                        System.out.println(x);
                    }
                }
            }
            if (input.equals("find ingredient")) {
                String word = sc.nextLine();
                System.out.println("ingredient to search: ");
                for (Recipe x : recipes) {
                    if (x.containsIngredient(word)) {
                        System.out.println(x);
                    }
                }
            }
        }
    }
}
