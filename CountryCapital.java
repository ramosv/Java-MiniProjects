import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;

public class Program {

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
    private String name;
    private String capital;

    public String getName() {

        return name;
    }

    public String setName(string i) {
        name = i;
    }

    public String getCapital() {
        return capital;
    }

    public String setCapital(string i) {
        capital = i;
    }

}