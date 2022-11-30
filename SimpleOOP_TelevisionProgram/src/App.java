import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int time = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(name, time));
        }

        System.out.println("Program's maximum duration? ");
        int duration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram i : programs) {
            if (i.getDuration() <= duration) {
                System.out.println(i.toString());
            }
        }
    }
}
