public class App {
    public static void main(String[] args) throws Exception {
        Fitbyte fitbyte = new Fitbyte(30, 60);

        double percentage = 0.5;

        while (percentage < 1.0) {
            double target = fitbyte.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage += 0.1;
        }

    }
}
