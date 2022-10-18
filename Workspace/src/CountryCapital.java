public class CountryCapital {
    public static void main(String[] args) {

        Country chile = new Country();
        Country france = new Country();

        france.setName("France");
        france.setCapital("Paris");
        chile.setName("Chile");
        chile.setCapital("Santiago");

        System.out.println(chile.getName());
        System.out.println(chile.getCapital());

        System.out.println(france.getName());
        System.out.println(france.getCapital());

    }
}

class Country {

    private String country;
    private String capital;

    public String getName() {
        return country;
    }

    public void setName(String i) {
        country = i;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String i) {
        capital = i;

    }
}