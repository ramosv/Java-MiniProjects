import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a); // 10.00e
        System.out.println(b); // 3.50e
        System.out.println(c); // 6.50e

        c = c.minus(a);

        System.out.println(a); // 10.00e
        System.out.println(b); // 3.50e
        System.out.println(c); // 0.00e

        // HashMap<Integer,String> map = new HashMap<Integer,String>();
        // map.put(1,"I"); map.put(2, "2");
    }
}
