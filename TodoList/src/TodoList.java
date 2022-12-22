import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String add) {

        this.list.add(add);
    }

    public void print() {
        int x = 1;

        for (String y : list) {
            System.out.println(x++ + ": " + y);
        }
    }

    public void remove(int x) {
        this.list.remove(x - 1);
    }

}