public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean equals(Object compare) {

        if (this == compare)
            return true;
        if (!(compare instanceof SimpleDate))
            return false;

        SimpleDate comparing = (SimpleDate) compare;

        if (this.day == comparing.day && this.month == comparing.month && this.year == comparing.year)
            return true;

        return false;
    }

}
