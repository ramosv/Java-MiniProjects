import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner sc;

    public UserInterface(TodoList list, Scanner sc) {
        this.list = list;
        this.sc = sc;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = sc.nextLine();

            if (input.equals("stop"))
                break;
            else if (input.equals("add")) {
                System.out.println("To add: ");
                String add = sc.nextLine();
                this.list.add(add);
            } else if (input.equals("list")) {
                this.list.print();
            } else if (input.equals("remove")) {
                System.out.println("Which one is removed? ");
                int key = Integer.valueOf(sc.nextLine());
                this.list.remove(key);
            } else {
                continue;
            }
        }

    }
    // redundant code, it works tho.
    /*
     * public void add() {
     * System.out.println("To add: ");
     * String add = sc.nextLine();
     * this.list.add(add);
     * }
     * 
     * public void list() {
     * this.list.print();
     * }
     * 
     * public void remove() {
     * System.out.println("Which one is removed? ");
     * int key = Integer.valueOf(sc.nextLine());
     * this.list.remove(key);
     * }
     */

}