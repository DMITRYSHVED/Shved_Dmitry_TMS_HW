package Lesson8_Task.task2;

public class Dentist extends Doctor {

    public Dentist(String jobTitle) {
        super(jobTitle);
    }

    @Override
    public void treat() {
        System.out.println("Лечу зубы");
    }
}
