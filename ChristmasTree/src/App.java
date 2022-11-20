public class App {
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");

    }

    public static void printSpaces(int number) {
        // int num = number-1;

        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {
        int count = 1;
        // int space = size-1;

        while (0 < size) {
            printSpaces(--size);
            printStars(count++);
            // size--;
        }
    }

    public static void christmasTree(int height) {
        int count = height;
        // int mid = height*2;

        for (int i = 1; i <= height * 2; i += 2) {
            printSpaces(--count);
            printStars(i);

        }
        printSpaces(height - 2);
        System.out.println("***");
        printSpaces(height - 2);
        System.out.print("***");
        System.out.println("");

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
