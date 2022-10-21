
public class TrackingCustomerData {
    public static void main(String[] args) {

        customerSale customerOne = new customerSale("FistName", "SecondName", 25, 2343);

        customerOne.saveCustomerInfo();
    }
}

class customerSale {
    String firstName;
    String secondName;
    int age;
    int roomNumber;

    public customerSale() {
    };

    public customerSale(String first, String second, int a, int room) {
        this.firstName = first;
        this.secondName = second;
        this.age = a;
        this.roomNumber = room;

    }

    public void saveCustomerInfo() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Second name: " + this.secondName);
        System.out.println("Age: " + this.age);
        System.out.print("Room number: " + this.roomNumber);

    }
}
