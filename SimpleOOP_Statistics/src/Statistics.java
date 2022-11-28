public class Statistics {
    private int count;
    private int sum;
    // private ArrayList<Integer> numbers;

    public Statistics() {
        // this.numbers = new ArrayList<>();

    }

    public void addNumber(int number) {
        this.sum += number;
        this.count += 1;
    }

    public int getCount() {
        return count;
    }

    public int sum() {

        return this.sum;

    }

    public double average() {
        if (count == 0) {
            return 0;
        }
        return 1.0 * this.sum / this.count;
    }

}
