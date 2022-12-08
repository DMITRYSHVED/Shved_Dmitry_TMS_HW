package Lesson8_Task.additionalTask;

public class Subject {

    private String name;
    private int studyHours;
    private int id;

    public Subject(String name, int studyHours) {
        this.name = name;
        this.studyHours = studyHours;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " предмет: " + "<" + name + ">" + " кол-во учебных часов: " + "<" + studyHours + ">";
    }

    public String getName() {
        return name;
    }

    public int getStudyHours() {
        return studyHours;
    }

    public int getId() {
        return id;
    }
}
