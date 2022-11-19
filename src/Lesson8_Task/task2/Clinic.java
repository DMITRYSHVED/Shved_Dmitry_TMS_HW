package Lesson8_Task.task2;

import java.util.Random;

public class Clinic {

    Random random = new Random();
    int choseDoctor;
    Doctor[] doctors = new Doctor[3];
    Patient[] patients = new Patient[100];

    public int createPatientId() {
        return random.nextInt(1000000);
    }

    public TreatmentPlan createTreatmentPlanCode() {
        TreatmentPlan treatmentPlan = new TreatmentPlan(random.nextInt(4));
        return treatmentPlan;
    }

    public void doctorHire(Doctor doctor) {
        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i] != null) {
                if (doctors[i].jobTitle.equals(doctor.jobTitle)) {
                    System.out.println("Больше" + doctor.jobTitle + "ов не требуется");
                    break;
                } else if (i == doctors.length - 1) {
                    System.out.println("Врачей больше не требуется");
                    break;
                }
            } else {
                doctors[i] = doctor;
                break;
            }
        }
    }

    public void addPatient(Patient patient) {
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null) {
                if (patients[i].patientId == patient.patientId) {
                    System.out.println("Пациент уже зарегистрирован в этой больнице");
                    break;
                } else if (i == patients.length - 1) {
                    System.out.println("Нет свободных мест");
                    break;
                }
            } else {
                patients[i] = patient;
                break;
            }
        }
    }

    public void assignDoctorToPatient(Patient patient) {
        if (patient.treatmentPlan.treatmentPlanCode == 1) {
            for (int i = 0; i < doctors.length; i++) {
                if (doctors[i].jobTitle.equals("Хирург")) {
                    choseDoctor = i;
                    break;
                }
            }
            patient.attendingDoctor = doctors[choseDoctor].jobTitle;
            doctors[choseDoctor].treat();
        } else if (patient.treatmentPlan.treatmentPlanCode == 2) {
            for (int i = 0; i < doctors.length; i++) {
                if (doctors[i].jobTitle.equals("Стоматолог")) {
                    choseDoctor = i;
                    break;
                }
            }
            patient.attendingDoctor = doctors[choseDoctor].jobTitle;
            doctors[choseDoctor].treat();
        } else {
            for (int i = 0; i < doctors.length; i++) {
                if (doctors[i].jobTitle.equals("Терапевт")) {
                    choseDoctor = i;
                    break;
                }
            }
            patient.attendingDoctor = doctors[choseDoctor].jobTitle;
            doctors[choseDoctor].treat();
        }
    }

    public void showDoctorsInfo() {
        System.out.println("Список врачей:");
        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i] != null) {
                System.out.println(doctors[i]);
            }
        }
    }

    public void showPatientsInfo() {
        System.out.println("Список пациентов:");
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null) {
                System.out.println(patients[i]);
            }
        }
    }
}
