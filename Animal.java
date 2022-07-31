package lesson6;

public abstract class Animal {
    private String nickname;
    private String animals;
    private int run;
    private int swim;


    public Animal(String nickname, String animals, int run, int swim) {
        this.nickname = nickname;
        this.animals = animals;
        this.run = run;
        this.swim = swim;

    }

    public Animal() {

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public String getAnimals() {
        return animals;
    }

    public void setAnimals(String animals) {
        this.animals = animals;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public String toString() {
        return String.format(animals, nickname, run, swim);
    }

    public void printInfo() {
        System.out.println(this);
    }

    public void swim(int distance) {}
    public void run(int distance) {}
}
