import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bird {
    private HashMap<String, String> map = new HashMap<String, String>();
    private HashMap<String, Integer> maps = new HashMap<String, Integer>();
    private Scanner sc;

    public Bird(Scanner sc) {
        this.sc = sc;
    }

    public void add() {
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Name in Latin: ");
        String latin = sc.nextLine();

        map.put(name, latin);
        maps.put(name, 0);
    }

    public void observation() {
        System.out.println("Bird? ");
        String bird = sc.nextLine();

        // updates the value +1
        if (maps.containsKey(bird)) {
            maps.put(bird, maps.get(bird) + 1);
        } else {
            System.out.println("Not a bird!");
        }

    }

    public void all() {
        for (Map.Entry<String, String> mp : map.entrySet()) {
            System.out.println(mp.getKey() + " (" + mp.getValue() + "): " + printValues(mp.getKey()));
        }

    }

    public int printValues(String key) {

        if (maps.containsKey(key)) {
            return maps.get(key);
        } else
            return -1;
    }

    public void one() {
        System.out.println("Bird?");
        String bird = sc.nextLine();

        if (maps.containsKey(bird)) {
            System.out.println(bird + " (" + map.get(bird) + "): " + printValues(bird));
        } else {
            System.out.println("Not a bird!");
        }
    }
}