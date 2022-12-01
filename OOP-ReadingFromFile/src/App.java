
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                String[] arr = row.split(",");
                int age = Integer.valueOf(arr[1]);

                persons.add(new Person(arr[0], age));

            }
        } catch (Exception e) {
            System.out.println("Error: " + e);

        }

        return persons;

    }
}
