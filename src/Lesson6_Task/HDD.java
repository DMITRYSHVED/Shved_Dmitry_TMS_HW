package Lesson6_Task;

public class HDD {
    String name;
    int volume;
    boolean type;

    public HDD() {
    }
    @Override
    public String toString() {
        String type = this.type ? "Внешний" : "Внутренний";
        return name + " " + volume + " " + type;
    }

    public HDD(String name, int volume, boolean type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }
}
