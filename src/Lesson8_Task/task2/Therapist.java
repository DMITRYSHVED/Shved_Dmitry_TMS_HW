package Lesson8_Task.task2;

public class Therapist extends Doctor {

    public Therapist(String jobTitle) {
        super(jobTitle);
    }

    @Override
    public void treat() {
        System.out.println("Терапевт лечит");
    }
}
