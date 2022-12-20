import java.rmi.server.SocketSecurityException;
import java.util.Dictionary;
import java.util.Scanner;

import javax.swing.SpringLayout;

public class TextUI {

    private Scanner sc;
    private SimpleDictionary dicto;

    public TextUI(Scanner sc, SimpleDictionary dicto) {
        this.sc = sc;
        this.dicto = dicto;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String in = sc.nextLine();
            if (in.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (in.equals("add")) {
                System.out.println("Word: ");
                String word = sc.nextLine();
                System.out.println("Translation: ");
                String trans = sc.nextLine();
                dicto.add(word, trans);
            } else if (in.equals("search")) {
                System.out.println("To be translated: ");
                String toTrans = sc.nextLine();
                System.out.println("Translation: " + dicto.translate(toTrans));
            } else {
                System.out.println("Unknown command");
            }
        }
    }

}

    // BETTER IMPLIMENTATION USING METHODS / Cleaner code

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }

            userCommand(input);
            System.out.println("");

        }
        System.out.println("Bye bye!");
    }

    public void userCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.println("Word: ");
        String word = sc.nextLine();
        System.out.println("Translation: ");
        String trans = sc.nextLine();
        dicto.add(word, trans);

    }

public void search()
{
    System.out.println("To be translated: ");
    String word = sc.nextLine();

    System.out.println("To be translated: ");
                String toTrans = sc.nextLine();
                System.out.println("Translation: " + dicto.translate(toTrans));

}