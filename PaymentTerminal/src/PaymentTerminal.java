public class PaymentTerminal {

    private double money;
    private int affordableMeals;
    private int expensiveMeals;

    public PaymentTerminal() {
        // register starts with 1000 dollars.
        this.money = 1000;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum <= 0) {

        }
        this.money += sum;
        card.addMoney(sum);

    }

    public double eatAffordably(double payment) {
        if (payment < 2.50) {
            return payment;
        } else if (payment >= 2.50) {
            this.money += 2.50;
            this.affordableMeals++;
            return payment - 2.50;
        }

        return -1;

    }

    public double eatHeartily(double payment) {

        if (payment < 4.30) {
            return payment;
        } else if (payment >= 4.30) {
            this.money += 4.30;
            this.expensiveMeals++;
            return payment - 4.30;
        }

        return -1;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() < 2.5) {
            return false;
        }
        this.affordableMeals++;
        card.takeMoney(2.5);
        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() < 4.30) {
            return false;
        }
        this.expensiveMeals++;
        card.takeMoney(4.30);
        return true;

    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + expensiveMeals;
    }

}
