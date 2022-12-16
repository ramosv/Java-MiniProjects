import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> list;
    private int max;

    public Hold(int max) {
        this.list = new ArrayList<>();
        this.max = max;
    }

    public void addSuitcase(Suitcase suitcase) {
        int sum = 0;
        for (Suitcase x : list) {
            sum += x.totalWeight();
        }
        if (suitcase.totalWeight() + sum > max) {

        } else {
            this.list.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase x : list) {
            x.printItems();
        }

    }

    public String toString() {
        int sum = 0;
        for (Suitcase x : list) {
            sum += x.totalWeight();
        }
        return this.list.size() + " suitcases " + "(" + sum + " kg)";
    }

}