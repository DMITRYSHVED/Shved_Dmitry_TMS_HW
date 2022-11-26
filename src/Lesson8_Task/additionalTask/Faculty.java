package Lesson8_Task.additionalTask;

import java.util.ArrayList;

public class Faculty {

    private String name;
    private int id;
    private ArrayList<Teacher> facultyTeachers = new ArrayList<>();
    private ArrayList<Subject> facultySubjects = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Teacher> getFacultyTeachers() {
        return facultyTeachers;
    }

    public ArrayList<Subject> getFacultySubjects() {
        return facultySubjects;
    }

    public void addTeacherToFaculty(Teacher... teachers) {
        for (int i = 0; i < teachers.length; i++) {
            if (facultyTeachers.contains(teachers[i])) {
                System.out.println("Уже есть такой преподователь");
                continue;
            }
            facultyTeachers.add(teachers[i]);
        }
    }

    public void addSubjectToFaculty(Subject... subjects) {
        for (int i = 0; i < subjects.length; i++) {
            if (facultySubjects.contains(subjects[i])) {
                System.out.println("Уже есть такой предмет");
                continue;
            }
            facultySubjects.add(subjects[i]);
        }
    }

    @Override
    public String toString() {
        return id + " Факульет: " + name;
    }
}
