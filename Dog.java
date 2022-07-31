package lesson6;

public class Dog extends Animal {

    public Dog(String nickname, int run, int swim) {
        super(nickname, "Собака", run, swim);
    }


    public void swim(int distance) {
        int maxDistanceSwim = 10;
        if (getSwim() <= maxDistanceSwim) {
            System.out.println(getAnimals() + ": " + getNickname() + " проплыл " + getSwim() + " м.");
        } else {
            System.out.println(getAnimals() + ": " + getNickname() + " не может  больше плыть");

        }
    }
    public void run(int distance) {
        int maxDistanceRun = 500;
        if (getRun() <= maxDistanceRun) {
            System.out.println(getAnimals() + ": " + getNickname() + " пробежал " + getRun() + " м.");
        } else {
            System.out.println(getAnimals() + ": " + getNickname() + " больше бегать не может");


        }}}
