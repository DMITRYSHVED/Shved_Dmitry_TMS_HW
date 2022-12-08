package Lesson8_Task.additionalTask;

public class TeacherSpecialization {

    String specialization;  //Math - экономика информатика  Lang - право междунар отн  PE - физра

    public TeacherSpecialization(String specialization) {
        String teacherSpecialization;
        if (specialization.equals("Math")) {
            teacherSpecialization = "Математик";
        }else if(specialization.equals("Lang")){
            teacherSpecialization = "Гуманитарий";
        }
        else {
            teacherSpecialization = "Физкультурник";
        }
        this.specialization = teacherSpecialization;
    }

    @Override
    public String toString() {
        return specialization;
    }
}
