import java.util.*;

class Game {
    HashMap<String, Integer> bowling;

    Game() {
        bowling = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, Integer score) {
        bowling.put(name, score);
    }

    public void winner() {
        // name = key - name.getKey() or map.keySet() for all keys > use foreach loop
        // score = value - score.getValue() or map.values() for all values > use foreach
        // look

        int max = 0;
        for (int x : bowling.values()) {
            if (max < x) {
                max = x;
            }
        }
        for (Map.Entry<String, Integer> entry : bowling.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println("Winner is: " + entry.getKey() + " with " + max + " points");
            }
        }

    }

}

public class Bowling {

    public static void main(String[] args) {

        Game firstGame = new Game();
        Scanner sc = new Scanner(System.in);

        // modify for number of players in game
        for (int x = 0; x < 3; x++) {
            String info = sc.nextLine();
            String[] values = info.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            firstGame.addPlayer(name, points);

        }
        firstGame.winner();
        sc.close();

    }

}
