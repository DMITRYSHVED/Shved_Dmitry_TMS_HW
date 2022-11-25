package Lesson8_Task.additionalTask;

public class UniversityStaff {
    University university = new University();
    TeacherSpecialization mathSpecialization = new TeacherSpecialization("Math");
    TeacherSpecialization langSpecialization = new TeacherSpecialization("Lang");
    TeacherSpecialization peSpecialization = new TeacherSpecialization("PE");
    Faculty facultyOfEconomy = new Faculty("Экономический");
    Faculty facultyOfLaw = new Faculty("Права");
    Faculty facultyOfInformatics = new Faculty("Информатики");
    Faculty facultyOfInternationalRelations = new Faculty("Менжнар. отн.");
    Faculty facultyOfPhysicalEducation = new Faculty("Физкультуры");
    Teacher firstTeacher = new Teacher("Наталья", "Гилева", "Николаевна", mathSpecialization);
    Teacher secondTeacher = new Teacher("Ольга", "Ерчак", "Владимировна", langSpecialization);
    Teacher thirdTeacher = new Teacher("Владимир", "Свитин", "Федорович", peSpecialization);
    Teacher fourthTeacher = new Teacher("Валерий", "Тарелко", "Васильевич", mathSpecialization);
    Subject economy = new Subject("Экономика", 72);
    Subject math = new Subject("Математика", 72);
    Subject law = new Subject("Право", 36);
    Subject pe = new Subject("Физ-ра", 64);
    Subject language = new Subject("Язык", 72);

    private void addAllToUniversity() {
        university.addFaculty(facultyOfEconomy, facultyOfInformatics, facultyOfLaw,
                facultyOfInternationalRelations, facultyOfPhysicalEducation);
        university.addTeacher(thirdTeacher, firstTeacher, secondTeacher, fourthTeacher);
        university.addSubject(language, pe, math, law, economy);
    }

    private void addAllToFaculties() {
        facultyOfEconomy.addTeacherToFaculty(firstTeacher, fourthTeacher);
        facultyOfInformatics.addTeacherToFaculty(firstTeacher, fourthTeacher);
        facultyOfLaw.addTeacherToFaculty(secondTeacher);
        facultyOfInternationalRelations.addTeacherToFaculty(secondTeacher);
        facultyOfPhysicalEducation.addTeacherToFaculty(thirdTeacher);
        facultyOfEconomy.addSubjectToFaculty(economy, math);
        facultyOfLaw.addSubjectToFaculty(law);
        facultyOfInformatics.addSubjectToFaculty(math);
        facultyOfInternationalRelations.addSubjectToFaculty(language);
        facultyOfPhysicalEducation.addSubjectToFaculty(pe);
    }

    private void addAllToTeachers() {
        firstTeacher.addFacultyToTeacher(facultyOfEconomy, facultyOfInformatics);
        secondTeacher.addFacultyToTeacher(facultyOfInternationalRelations, facultyOfLaw);
        thirdTeacher.addFacultyToTeacher(facultyOfPhysicalEducation);
        fourthTeacher.addFacultyToTeacher(facultyOfEconomy, facultyOfInformatics);
        firstTeacher.addSubjectToTeacher(economy, math);
        secondTeacher.addSubjectToTeacher(law, language);
        thirdTeacher.addSubjectToTeacher(pe);
        fourthTeacher.addSubjectToTeacher(economy, math);
    }

    public void run() {
        addAllToUniversity();
        addAllToFaculties();
        addAllToTeachers();

        while (true) {
            if (university.getFunction() == 0) {
                break;
            }
            university.showStudentInfo();
        }
    }
}
