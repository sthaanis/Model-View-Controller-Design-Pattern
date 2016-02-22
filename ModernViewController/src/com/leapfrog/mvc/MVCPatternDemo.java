/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvc;

import com.leapfrog.mvc.controller.StudentController;
import com.leapfrog.mvc.model.Student;
import com.leapfrog.mvc.view.StudentView;

/**
 *
 * @author User
 */
public class MVCPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
