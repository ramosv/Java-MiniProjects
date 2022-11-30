import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Book> books = new ArrayList<Book>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int page = Integer.valueOf(sc.nextLine());
            System.out.println("Publication Year: ");
            int year = Integer.valueOf(sc.nextLine());

            books.add(new Book(name, page, year));
        }

        System.out.println("What information will be printed? ");
        String input = sc.nextLine();

        for (Book i : books) {
            if (input.equals("everything")) {
                System.out.println(i.toString());

            } else if (input.equals("name")) {
                System.out.println(i.getTitle());
            }

        }
    }
}
