import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Bird bird = new Bird(scan);

        while (true) {
            System.out.println("?");
            String input = scan.nextLine();
            if (input.equals("Quit"))
                break;
            else if (input.equals("Add")) {
                bird.add();
            } else if (input.equals("Observation")) {
                bird.observation();
            } else if (input.equals("All")) {
                bird.all();
            } else if (input.equals("One")) {
                bird.one();
            }

        }

    }
}
