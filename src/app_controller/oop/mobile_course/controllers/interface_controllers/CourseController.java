package app_controller.oop.mobile_course.controllers.interface_controllers;

import app_controller.oop.mobile_course.contracts.CourseContracts;
import app_controller.oop.mobile_course.data.RegistrationData;

import java.util.ArrayList;
import java.util.Scanner;

import static app_controller.oop.mobile_course.utility.UtilMethods.*;

/**
 * @Creator: Oybek Khaydaraliev
 * @Date: 3/19/2024
 * @File: CourseController.java
 */


public class CourseController implements CourseContracts {
    private final static Scanner mainScanner = new Scanner(System.in);
    private final static ArrayList<RegistrationData> userList = new ArrayList<>();

    @Override
    public void viewProfile() {
        print("Profilga xush kelibsiz !");
        sleep(1000);
        profileMenu();
    }

    @Override
    public void allCourses() {
        print("Barcha kurslar bo'limi ");
        coursesMenu();
    }

    @Override
    public void recommendedCourses() {

    }

    @Override
    public void helpCenter() {

    }

    @Override
    public void myCourses() {

    }

    @Override
    public void searchCourses() {

    }

    @Override
    public void favouriteCourses() {

    }

}