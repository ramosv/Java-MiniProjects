import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public boolean cookingTimeMax(int max) {
        return this.time <= max;
    }

    public boolean nameContains(String name) {
        return this.name.contains(name);
    }

    public boolean containsIngredient(String ingredient) {
        return this.ingredients.contains(ingredient);

    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
}
