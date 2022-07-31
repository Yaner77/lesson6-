package lesson6;

public class Main {
    private static int distance;

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 100, 0);
        Dog dog = new Dog("Бобик", 500, 8);

        // cat.printInfo();
        cat.swim(distance);
        cat.run(distance);
        // dog.printInfo();
        dog.swim(distance);
        dog.run(distance);
    }
}
