package com.codewithmartin.abstractclass;

public class Student extends Person {
    private int studentId;

    public Student(String name, String gender, int studentId) {
        super(name, gender);
        this.studentId = studentId;
    }

    @Override
    public void studying() {
        if (this.studentId == 0) {
            System.out.println(this + " Not studying ...");
        } else {
            System.out.println(this + " Studying ...");
        }
    }
}
