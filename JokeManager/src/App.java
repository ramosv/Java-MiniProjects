import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }
}
