package Lesson6_Task.Task2;

public class RAM {

    String name;
    int volume;

    public RAM() {
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return name + " " + volume;
    }
}
