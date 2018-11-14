package ru.lityuchii.profession;

public class Doctor extends Profession {

String speciality;

    public Doctor(String name, String profession, String speciality) {
        super(name, profession);
        this.speciality = speciality;
        Doctor doc = new Doctor("Tom", "doctor", "dentist");
    }

    class Diagnose {
        String name;
        public Diagnose(String name){
            this.name = name;
        }

    }

    class Patient {
        String name;
    }

    public Diagnose heal(Patient patient) {
        return new Diagnose("caries");
        }
    }

