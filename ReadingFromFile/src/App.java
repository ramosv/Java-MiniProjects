import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                String row = sc.nextLine();

                String[] pieces = row.split(",");

                System.out.println(pieces[0] + " age:" + pieces[1] + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
