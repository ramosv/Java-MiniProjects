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

        int totalSale1 = newSale.discount(9999);
        int totalSale2 = secondSale.discount(9999);
        System.out.println(totalSale1 + " " + totalSale2);
    }

}

class customerSale {

    public int discount(int cost) {
        cost = cost - (cost * 10) / 100;
        return cost;
    }
}