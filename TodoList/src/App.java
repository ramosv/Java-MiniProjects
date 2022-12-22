import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
    }
}
