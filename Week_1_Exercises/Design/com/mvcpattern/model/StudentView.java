package com.mvcpattern.view;

import com.mvcpattern.model.Student;

public class StudentView {
    public void displayStudentDetails(Student student) {
        System.out.println("Student Details:");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
    }
}
