package Lesson8_Task.additionalTask;

import java.util.ArrayList;

public class Teacher {

    private String name;
    private String surname;
    private String patronymic;
    TeacherSpecialization teacherSpecialization;
    private int id;

    ArrayList<Subject> teacherSubjects = new ArrayList<>();
    ArrayList<Faculty> teacherFaculties = new ArrayList<>();

    public Teacher(String name, String surname, String patronymic, TeacherSpecialization teacherSpecialization) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.teacherSpecialization = teacherSpecialization;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getId() {
        return id;
    }

    public void addSubjectToTeacher(Subject... subjects) {
        for (int i = 0; i < subjects.length; i++) {
            if (teacherSubjects.contains(subjects[i])) {
                System.out.println("Уже есть такой предмет");
                continue;
            }
            teacherSubjects.add(subjects[i]);
        }
    }

    public void addFacultyToTeacher(Faculty... faculties) {
        for (int i = 0; i < faculties.length; i++) {
            if (teacherFaculties.contains(faculties[i])) {
                System.out.println("Уже есть такой факультет");
                continue;
            }
            teacherFaculties.add(faculties[i]);
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + surname + " " + patronymic + "  специальность: " + teacherSpecialization;
    }
}
