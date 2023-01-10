import java.util.ArrayList;

public class SingleRecipe {

    private String name;
    private String time;
    private String ingredients;

    public SingleRecipe(String name, String time, String ingre) {
        this.name = name;
        this.time = time;
        this.ingredients = ingre;
    }

    public void findName(String name) {

        String[] pieces = this.name.split("");
        if (this.name.contains(name)) {
            System.out.println(this.name + ", cooking time: " + this.time);
        } else {
            for (int x = 0; x < pieces.length; x++) {
                if (pieces[x].equals(name)) {
                    System.out.println(this.name + ", cooking time: " + this.time);

                }
            }
        }
    }

    public void findTime() {
        System.out.println(this.name + ", cooking time: " + this.time);

    }

    public String getIngredient() {
        return this.ingredients;
    }

    public void findIngredients(String ingre) {
        ArrayList<String> list = new ArrayList<>();
        String[] pieces = this.ingredients.split(" ");
        for (int x = 0; x < pieces.length; x++) {
            list.add(pieces[x]);
        }
        for (String x : list) {
            if (x.equals(ingre)) {
                System.out.println(this.name + ", cooking time: " + this.time);
            }
        }
    }

    public void printList() {

    }

    public int getTime() {
        int t = Integer.valueOf(this.time);
        return t;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }

}