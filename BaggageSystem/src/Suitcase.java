import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int weight;

    public Suitcase(int weight) {
        this.items = new ArrayList<>();
        this.weight = weight;
    }

    public void addItem(Item item) {

        int sum = 0;
        for (Item x : items) {
            sum += x.getWeight();
        }

        if (sum + item.getWeight() > this.weight) {

        } else {
            this.items.add(item);
        }
    }

    public void printItems() {

        for (Item x : items) {
            System.out.println(x);
        }
    }

    public Item heaviestItem() {

        if (items.isEmpty()) {
            return null;
        }
        Item x = this.items.get(0);
        for (Item y : items) {
            if (x.getWeight() < y.getWeight()) {
                x = y;
            }

        }
        return x;
    }

    public int totalWeight() {
        int sum = 0;
        for (Item x : items) {
            sum += x.getWeight();
        }
        return sum;

    }

    public String toString() {
        int sum = 0;
        for (Item x : items) {
            sum += x.getWeight();
        }
        if (items.isEmpty()) {
            return "no" + " items (" + sum + " kg)";
        }
        if (items.size() == 1) {
            return this.items.size() + " item (" + sum + " kg)";
        }
        return this.items.size() + " items (" + sum + " kg)";
    }
}