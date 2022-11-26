package Lesson8_Task.additionalTask;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Student {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private String name;
    private String surname;
    private String patronymic;
    Faculty faculty;
    private int course;
    private int id;

    ArrayList<Subject> studentSubjects = new ArrayList<>();
    ArrayList<Mark> studentMarks = new ArrayList<>();
    ArrayList<Teacher> studentTeachers = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
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

    public Faculty getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }

    public void inputName() {
        System.out.println("Введите имя студента:");
        setName(scanner.next());
    }

    public void inputSurname() {
        System.out.println("Введите фамилию студента:");
        setSurname(scanner.next());
    }

    public void inputPatronymic() {
        System.out.println("Введите отчество студента:");
        setPatronymic(scanner.next());
    }

    public void inputCourse() {
        setCourse(random.nextInt(5));
    }

    @Override
    public String toString() {
        System.out.printf("%-10s%-15s%-15s%-15s%-15s%-15s", id, name, surname, patronymic, faculty.getName(), course);
        return "";
    }

    public void addStudentSubject(Faculty faculty) {
        studentSubjects.addAll(faculty.facultySubjects);
    }

    public void addStudentTeachers(Faculty faculty){
        studentTeachers.addAll(faculty.facultyTeachers);
    }

    public String gradeMark(int subjectId) {
        String subjectName = null;
        for (int i = 0; i < studentSubjects.size(); i++) {
            if (studentSubjects.get(i).getId() == subjectId) {
                subjectName = studentSubjects.get(i).getName();
                break;
            }
        }
        return subjectName;
    }

    public void gradeMarkMethod(){
        int subjectId;
        int mark;
        System.out.println("Введите порядковый номер предмета, по которому хотите поставить оценку");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число попробуй еще");
            scanner.next();
        }
        subjectId = scanner.nextInt();
        System.out.println("Введите оценку, которую хотите поставить студенту: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число попробуй еще");
            scanner.next();
        }
        mark = scanner.nextInt();
        Mark markToAdd = new Mark(gradeMark(subjectId), mark);
        if (markToAdd.subjectName != null) {
            studentMarks.add(markToAdd);
        }
    }

    public void showTeachersInfo() {
        System.out.println();
        System.out.println("Список преподавателей");
        for (int i = 0; i < studentTeachers.size(); i++) {
            System.out.println("\t" + studentTeachers.get(i));
        }
    }

    public void showSubjectsInfo() {
        System.out.println();
        System.out.println("Список предметов");
        for (int i = 0; i < studentSubjects.size(); i++) {
            System.out.println("\t" + studentSubjects.get(i));
        }
    }

   public void showMarksInfo() {
        System.out.println("Оценки студента " + getName());
        for (int i = 0; i < studentMarks.size(); i++) {
            System.out.println(studentMarks.get(i));
        }
    }
}
