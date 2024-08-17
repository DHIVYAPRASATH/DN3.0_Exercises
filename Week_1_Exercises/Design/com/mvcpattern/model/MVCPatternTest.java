package com.mvcpattern.main;

import com.mvcpattern.model.Student;
import com.mvcpattern.view.StudentView;
import com.mvcpattern.controller.StudentController;

public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a student object (Model)
        Student student = new Student("1", "John Doe", "A");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller to manage the student model and view
        StudentController controller = new StudentController(student, view);

        // Update the view to show initial student details
        controller.updateView();

        // Update student details via the controller
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B+");

        // Update the view to reflect the changes
        controller.updateView();
    }
}
