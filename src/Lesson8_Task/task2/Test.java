package Lesson8_Task.task2;

/**
 * Создать программу для имитации работы клиники.
 * Пусть в клинике будет три врача: хирург, терапевт и дантист.
 * Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
 * Так же предусмотреть класс «Пациент» и класс «План лечения».
 * Создать объект класса «Пациент» и добавить пациенту план лечения.
 * Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
 * Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
 * Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
 * Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.
 */

public class Test {
    public static void main(String[] args) {

        Clinic clinic = new Clinic();
        Doctor surgeon = new Surgeon("Хирург");
        Doctor dentist = new Dentist("Стоматолог");
        Doctor therapist = new Therapist("Терапевт");
        Patient firstPatient = new Patient("Иван", clinic.createPatientId(), clinic.createTreatmentPlanCode());
        Patient secondPatient = new Patient("Богдан", clinic.createPatientId(), clinic.createTreatmentPlanCode());
        Patient thirdPatient = new Patient("Илья", clinic.createPatientId(), clinic.createTreatmentPlanCode());
        Patient fourthPatient = new Patient("Александр", clinic.createPatientId(), clinic.createTreatmentPlanCode());

        clinic.doctorHire(surgeon);
        clinic.doctorHire(dentist);
        clinic.doctorHire(therapist);

        clinic.addPatient(firstPatient);
        clinic.addPatient(secondPatient);
        clinic.addPatient(thirdPatient);
        clinic.addPatient(fourthPatient);

        clinic.assignDoctorToPatient(firstPatient);
        clinic.assignDoctorToPatient(secondPatient);
        clinic.assignDoctorToPatient(thirdPatient);
        clinic.assignDoctorToPatient(fourthPatient);

        clinic.showDoctorsInfo();
        clinic.showPatientsInfo();
    }
}
