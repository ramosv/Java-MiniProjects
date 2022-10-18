public class OverrideDiscount {

    public static void main(String[] args) {

        customerSale newSale = new customerSale();
        customerSale secondSale = new customerSale() {
            @Override
            public int discount(int c) {
                c = c - (c * 20) / 100;
                return c;

            }
        };
        // give the second sale of the day a discount by using @Override

        int totalSale1 = newSale.discount(9999);
        int totalSale2 = secondSale.discount(9999);
        System.out.println(totalSale1, totalSale2);

    }
}

class customerSale {
    // int cost;

    public int discount(int cost) {
        cost = cost - (cost * 10) / 100;
        return cost;
    }

}