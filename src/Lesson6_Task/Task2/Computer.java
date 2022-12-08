package Lesson6_Task.Task2;

public class Computer {

    double cost;
    String model;

    RAM ram;
    HDD hdd;

    public Computer() {
    }

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    public Computer(double cost, String model, RAM ram, HDD hdd) {
        this.ram = ram;
        this.hdd = hdd;
        this.cost = cost;
        this.model = model;
    }

    @Override
    public String toString() {
        return "\nКомпьютер " + model + "\nСтоимость " + cost + "\nRAM " + ram + "\nHDD " + hdd;
    }
}
