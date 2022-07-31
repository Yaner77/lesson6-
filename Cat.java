package lesson6;

public class Cat extends Animal {

    public Cat(String nickname, int run, int swim) {
        super(nickname, "Кот", run, swim);

    }

    public void swim(int distance) {
        int maxDistanceSwim = 0;
        if (getSwim() < maxDistanceSwim) ;
        else System.out.println(getAnimals() + ": " + getNickname() + " не умеет плавать ");

    }

    public void run(int distance) {
        int maxDistanceRun = 200;
        if (getRun() <= maxDistanceRun) {
            System.out.println(getAnimals() + ": " + getNickname() + " пробежал " + getRun() + " м.");
        } else {
            System.out.println(getAnimals() + ": " + getNickname() + " больше бегать не может");
        }

    }
}