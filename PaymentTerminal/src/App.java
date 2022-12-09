public class App {
    public static void main(String[] args) throws Exception {
        PaymentTerminal coffeeShop = new PaymentTerminal();
        System.out.println(coffeeShop);

        PaymentCard viceCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + viceCard.balance() + " dollars");

        boolean wasSuccessful = coffeeShop.eatHeartily(viceCard);
        System.out.println("there was enough money: " + wasSuccessful);

        coffeeShop.addMoneyToCard(viceCard, 100);

        wasSuccessful = coffeeShop.eatHeartily(viceCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + viceCard.balance() + " dollars");

        System.out.println(coffeeShop);
    }
}
