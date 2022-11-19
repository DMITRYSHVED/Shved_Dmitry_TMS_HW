package Lesson8_Task.task2;

public class Surgeon extends Doctor {


    public Surgeon(String jobTitle) {
        super(jobTitle);
    }

    @Override
    public void treat() {
        System.out.println("Хирург лечит");
    }
}
