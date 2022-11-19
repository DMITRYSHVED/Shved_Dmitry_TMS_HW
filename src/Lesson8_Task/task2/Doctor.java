package Lesson8_Task.task2;

public abstract class Doctor {

    String jobTitle;

    public Doctor(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void treat() {
    }

    @Override
    public String toString() {
        return "\tВрач: " + jobTitle;
    }
}
