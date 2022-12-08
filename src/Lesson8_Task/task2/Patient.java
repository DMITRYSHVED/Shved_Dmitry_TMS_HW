package Lesson8_Task.task2;

public class Patient {

    String patientName;
    int patientId;
    Doctor attendingDoctor;
    TreatmentPlan treatmentPlan;

    public Patient(String patientName, int patientId, TreatmentPlan treatmentPlan) {
        this.patientName = patientName;
        this.treatmentPlan = treatmentPlan;
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return "\tПациент: <" + patientId + "> Имя: <" + patientName + "> Лечащий врач: <" + attendingDoctor.jobTitle + "> План лечения: <" + treatmentPlan.treatmentPlanCode + ">";
    }
}
