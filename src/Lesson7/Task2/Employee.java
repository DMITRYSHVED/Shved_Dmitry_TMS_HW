package Lesson7.Task2;

public class Employee implements JobPrintable {
    String jobTitle;

    public Employee(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void printJobTitle() {
        System.out.println("Я " + jobTitle);
    }
}
