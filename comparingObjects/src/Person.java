public class Person {
    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compare) {
        if (this == compare)
            return true;
        if (!(compare instanceof Person))
            return false;

        Person comparing = (Person) compare;

        if (this.name.equals(comparing.name) && this.birthday.equals(comparing.birthday)
                && this.height == comparing.height && this.weight == comparing.weight) {
            return true;
        }

        return false;
    }
}