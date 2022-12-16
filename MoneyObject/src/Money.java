
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money plus = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return plus;

    }

    public boolean lessThan(Money compare) {
        return ((1.0 * this.euros) + (1.0 * this.cents / 100)) < ((1.0 * compare.euros) + (1.0 * compare.cents / 100));
    }

    public Money minus(Money compare) {

        int numero1 = 0;
        int numero2 = 0;
        double num1 = (1.0 * this.euros) + (1.0 * this.cents / 100);
        double num2 = (1.0 * compare.euros) + (1.0 * compare.cents / 100);
        double comparing = num1 - num2;

        if (comparing <= 0) {
            numero1 = 0;
            numero2 = 0;
        } else if (comparing < 1.0) {
            numero2 = (100 - compare.cents + this.cents) * -1;
            if (numero2 < 0) {
                numero2 *= -1;
            }
            numero2 -= 100;

        } else {
            if ((int) comparing % (this.euros - compare.euros) == 0) {
                numero1 = (int) comparing;
                numero2 = 0;
            } else {
                numero1 = (int) comparing;
                numero2 = (100 - compare.cents + this.cents);
                if (numero2 < 0) {
                    numero2 *= -1;
                }
            }
        }

        Money minus = new Money(numero1, numero2);
        return minus;

    }
    // Better implementation of the code above!
    /*
     * public Money minus(Money decreaser) {
     * 
     * int euros = this.euros - decreaser.euros();
     * int cents = this.cents - decreaser.cents();
     * 
     * if (cents < 0) {
     * 
     * cents = cents + 100;
     * 
     * euros = euros - 1;
     * 
     * }
     * 
     * // if the value becomes negative, return zero
     * 
     * if (euros < 0) {
     * 
     * return new Money(0, 0);
     * 
     * }
     * 
     * return new Money(euros, cents);
     * 
     * }
     * 
     */

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
