package Lesson8_Task.additionalTask;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class University {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Subject> subjects = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();
    int studentId = 0;
    int function;

    public void addFaculty(Faculty... faculties) {
        for (int i = 0, j = 0; i < faculties.length; i++) {
            if (this.faculties.contains(faculties[i])) {
                System.out.println("Уже есть такой факультет");
                continue;
            }
            faculties[i].setId(j);
            this.faculties.add(faculties[i]);
            j++;
        }
    }

    public void addTeacher(Teacher... teachers) {
        for (int i = 0, j = 0; i < teachers.length; i++) {
            if (this.teachers.contains(teachers[i])) {
                System.out.println("Уже есть такой преподователь");
                continue;
            }
            teachers[i].setId(j);
            this.teachers.add(teachers[i]);
            j++;
        }
    }

    public void addSubject(Subject... subjects) {
        for (int i = 0, j = 0; i < subjects.length; i++) {
            if (this.subjects.contains(subjects[i])) {
                System.out.println("Уже есть такой предмет");
                continue;
            }
            subjects[i].setId(j);
            this.subjects.add(subjects[i]);
            j++;
        }
    }

    private void addStudent() {
        Student student = new Student();
        student.inputName();
        student.inputSurname();
        student.inputPatronymic();
        student.inputCourse();
        student.setCourse(random.nextInt(1, 5));
        student.setFaculty(faculties.get(random.nextInt(5)));
        student.setId(studentId);
        student.addStudentSubject(student.getFaculty());
        students.add(student);
        studentId++;
    }

    private void deleteStudent() {
        int delete;
        System.out.println("Введите порядковый номер студента, которого нужно отчислить:");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число попробуй еще");
            scanner.next();
        }
        delete = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (delete == students.get(i).getId()) {
                students.remove(students.get(i));
            }
        }
    }

    private void findStudent(String name, String surname, String patronymic) {
        for (Student student : students) {
            if (student.getName().equals(name) && student.getSurname().equals(surname) &&
                    student.getPatronymic().equals(patronymic)) {
                System.out.println(student);
            }
        }
        System.out.println();
    }

    private void findStudent(String name, String surname, String patronymic, int facultyId) {
        for (Student student : students) {
            if (student.getName().equals(name) && student.getSurname().equals(surname) &&
                    student.getPatronymic().equals(patronymic) && student.getFaculty().getId() == facultyId) {
                System.out.println(student);
            }
        }
        System.out.println();
    }

    private void findStudent(String name, String teacherName, String teacherSurname, String teacherPatronymic) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.get(i).faculty.facultyTeachers.size(); j++) {
                if (students.get(i).getName().equals(name) &&
                        students.get(i).faculty.facultyTeachers.get(j).getName().equals(teacherName) &&
                        students.get(i).faculty.facultyTeachers.get(j).getSurname().equals(teacherSurname) &&
                        students.get(i).faculty.facultyTeachers.get(j).getPatronymic().equals(teacherPatronymic)) {
                    System.out.println(students.get(i));
                }
            }
        }
        System.out.println();
    }

    private void findStudentMethod() {

        String studentName;
        String studentSurname;
        String studentPatronymic;
        int facultyId;
        String teacherName;
        String teacherSurname;
        String teacherPatronymic;

        System.out.println("1- поиск студента по ФИО  2- поиск студента по ФИО и факультету\n" +
                "3- поиск студента по имени и преподавателю");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число попробуй еще");
            scanner.next();
        }
        function = scanner.nextInt();
        switch (function) {
            case 1:
                System.out.println("Введите имя:");
                studentName = scanner.next();
                System.out.println("Введите фамилию:");
                studentSurname = scanner.next();
                System.out.println("Введите отчество:");
                studentPatronymic = scanner.next();
                findStudent(studentName, studentSurname, studentPatronymic);
                break;
            case 2:
                showFacultiesInfo();
                System.out.println("Введите имя:");
                studentName = scanner.next();
                System.out.println("Введите фамилию:");
                studentSurname = scanner.next();
                System.out.println("Введите отчество:");
                studentPatronymic = scanner.next();
                System.out.println("Введите порядковый номер факультета:");
                facultyId = scanner.nextInt();
                findStudent(studentName, studentSurname, studentPatronymic, facultyId);
                break;
            case 3:
                System.out.println("Введите имя студента:");
                studentName = scanner.next();
                System.out.println("Введите имя преподавателя:");
                teacherName = scanner.next();
                System.out.println("Введите фамилию преподавателя:");
                teacherSurname = scanner.next();
                System.out.println("Введите отчество преподавателя:");
                teacherPatronymic = scanner.next();
                findStudent(studentName, teacherName, teacherSurname, teacherPatronymic);
                break;
            default:
                break;
        }
    }

    private String putMark(int currentStudentId, int subjectId) {
        String subjectName = null;
        for (int i = 0; i < students.get(currentStudentId).studentSubjects.size(); i++) {
            if (students.get(currentStudentId).studentSubjects.get(i).getId() == subjectId) {
                subjectName = students.get(currentStudentId).studentSubjects.get(i).getName();
                break;
            }
        }
        return subjectName;
    }

    public int getFunction() {
        System.out.println("1- прием студента   2- отчисление студента  4- работать со студентом\n" +
                "3- поиск студента   0- выход из программы");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число попробуй еще");
            scanner.next();
        }
        function = scanner.nextInt();
        switch (function) {
            case 1:
                addStudent();
                return 1;
            case 2:
                deleteStudent();
                return 2;
            case 3:
                findStudentMethod();
                return 3;
            case 4:
                workWithStudent();
                return 4;
            case 0:
                return 0;
            default:
                return -1;
        }
    }

    public void showStudentInfo() {
        System.out.println("Список студентов университета");
        System.out.printf("%-10s%-15s%-15s%-15s%-15s%-15s", "№", "Имя", "Фамилия", "Отчество", "Факультет", "Курс");
        System.out.println();
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    private void showFacultiesInfo() {
        System.out.println("Список факультетов");
        for (Faculty faculty : faculties) {
            System.out.println("\t" + faculty);
        }
    }

    private void showTeachersInfo(int currentStudentId) {
        System.out.println();
        System.out.println("Список преподавателей");
        for (int i = 0; i < students.get(currentStudentId).faculty.facultyTeachers.size(); i++) {
            System.out.println("\t" + students.get(currentStudentId).faculty.facultyTeachers.get(i));
        }
    }

    private void showSubjectInfo(int currentStudentId) {
        System.out.println();
        System.out.println("Список предметов");
        for (int i = 0; i < students.get(currentStudentId).studentSubjects.size(); i++) {
            System.out.println("\t" + students.get(currentStudentId).studentSubjects.get(i));
        }
    }

    private void putMarkMethod(int currentStudentId) {
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
        Mark markToAdd = new Mark(putMark(currentStudentId, subjectId), mark);
        if (markToAdd.subjectName != null) {
            students.get(currentStudentId).studentMarks.add(markToAdd);
        }
    }

    private void showMarksInfo(int currentStudentId) {
        System.out.println("Оценки студента " + students.get(currentStudentId).getName());
        for (int i = 0; i < students.get(currentStudentId).studentMarks.size(); i++) {
            System.out.println(students.get(currentStudentId).studentMarks.get(i));
        }
    }

    private void workWithStudent() {
        int currentStudentId;
        while (true) {
            System.out.println("Введите айди студента, с которым хотите поработать: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Нужно число попробуй еще");
                scanner.next();
            }
            currentStudentId = scanner.nextInt();
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getId() == currentStudentId) {
                    currentStudentId = i;
                    break;
                }
            }
            if (currentStudentId > students.size()) {
                System.out.println("Нет студента с таким айди");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println();
            System.out.printf("%-10s%-15s%-15s%-15s%-15s%-15s", "№", "Имя", "Фамилия", "Отчество", "Факультет", "Курс");
            System.out.println();
            System.out.println(students.get(currentStudentId));
            System.out.println("1- список преподавателей  2- список предметов  4- оценки студента\n" +
                    "0- выход                  3- получить оценку");
            while (!scanner.hasNextInt()) {
                System.out.println("Нужно число попробуй еще");
                scanner.next();
            }
            function = scanner.nextInt();
            if (function == 1) {
                showTeachersInfo(currentStudentId);
            } else if (function == 2) {
                showSubjectInfo(currentStudentId);
            } else if (function == 3) {
                showSubjectInfo(currentStudentId);
                putMarkMethod(currentStudentId);
            } else if (function == 4) {
                showMarksInfo(currentStudentId);
            } else {
                break;
            }
        }
    }
}
