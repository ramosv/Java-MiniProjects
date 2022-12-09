public class App {
    public static void main(String[] args) throws Exception {
        Counter testing = new Counter();
        Counter count = new Counter(100);

        testing.increase(50);
        testing.increase();
        testing.decrease(15);

        System.out.println(testing.value());

        count.decrease(14);
        count.decrease();
        count.increase(5);

        System.out.println(count.value());
    }
}
