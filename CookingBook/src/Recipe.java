import java.util.ArrayList;

public class Recipe {
    private ArrayList<String> file;
    private ArrayList<SingleRecipe> all;

    public Recipe() {
        file = new ArrayList();
        all = new ArrayList();

    }

    public void readFile(String row) {
        file.add(row);

    }

    public void listPrint() {
        for (SingleRecipe x : all) {
            System.out.println(x);
        }
    }

    public void list() {
        file.add("");
        int count = 0;
        String name = "";
        String time = "";
        String ingredients = "";
        for (String x : file) {
            if (x.equals("")) {
                SingleRecipe single = new SingleRecipe(name, time, ingredients);
                all.add(single);
                count = 0;
                ingredients = "";

            } else if (count == 0) {
                name = x;
                count++;
            } else if (count == 1) {
                time = x;
                count++;
            } else if (count > 1) {
                ingredients += x + " ";
            }
        }

    }

    public void findName(String name) {
        for (SingleRecipe x : all) {
            x.findName(name);
        }
    }

    public void findTime(String time) {
        int t = Integer.valueOf(time);
        System.out.println("Recipes: ");
        for (SingleRecipe x : all) {
            if (x.getTime() <= t) {
                x.findTime();
            }

        }
    }

    public void findIngredient(String ingre) {

        System.out.println("Ingredient: ");

        for (SingleRecipe x : all) {
            x.findIngredients(ingre);

        }

    }

}