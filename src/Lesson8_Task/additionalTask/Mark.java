package Lesson8_Task.additionalTask;

public class Mark {

    String subjectName;
    int mark;

    public Mark(String subjectName, int mark) {
        this.subjectName = subjectName;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "\tMark{" +
                "subjectName='" + subjectName + '\'' +
                ", mark=" + mark +
                '}';
    }
}
