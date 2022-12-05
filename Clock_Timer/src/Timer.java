public class Timer {

    public ClockHand hundred;
    public ClockHand seconds;

    public Timer() {
        hundred = new ClockHand(100);
        seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundred.advance();
        if (this.hundred.getValue() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.hundred;
    }

}
