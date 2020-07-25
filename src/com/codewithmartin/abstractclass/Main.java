package com.codewithmartin.abstractclass;

public class Main {
    public static void main(String[] args) {
        Person student1 = new Student("Martin", "male", 0);
        Person student2 = new Student("Michal", "male", 2147);
        Person student3 = new Student("Evicka", "female", 3257);

        student1.studying();
        student2.studying();
        student3.studying();
    }
}
