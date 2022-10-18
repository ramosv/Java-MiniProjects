public class CarPolymorphism {
    public static void main(String[] args) {

        car normal = new car();
        normal.run();
        normal.fuel();

        car electric = new electricCar();
        car hybrid = new hybridCar();

        electric.run();
        electric.fuel();
        hybrid.run();
        hybrid.fuel();

    }

}

class car {

    public void run() {
        System.out.println("Starting");
    }

    public void fuel() {
        System.out.println("This car runs on fossil fuels");
    }

}

class electricCar extends car {
    public void fuel() {
        System.out.println("This car runs on electricity");
    }

}

class hybridCar extends car {
    public void fuel() {
        System.out.println("This car runs on both gas and electricity");
    }
}