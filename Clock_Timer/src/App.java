public class App {
    public static void main(String[] args) throws Exception {

        // Testing the Clock class

        /*
         * Clock clock = new Clock();
         * 
         * while (true) {
         * System.out.println(clock);
         * clock.advance();
         * try {
         * Thread.sleep(10);
         * } catch (Exception e) {
         * 
         * }
         * }
         */

        // Test Timer Class

        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();
            try {
                Thread.sleep(10);

            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}
