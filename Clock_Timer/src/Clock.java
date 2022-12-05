import java.time.Clock;
import java.util.Locale;

public class Clock {

    private ClockHand hour;
    private ClockHand minute;
    private ClockHand second;

    public Clock() {
        this.hour = new ClockHand(24);
        this.minute = new ClockHand(60);
        this.second = new ClockHand(60);
    }

    public void advance() {
        this.second.advance();
        if (this.second.getValue() == 0) {
            this.minute.advance();
            if (this.minute.getValue() == 0) {
                this.hour.advance();
            }
        }

    }

}