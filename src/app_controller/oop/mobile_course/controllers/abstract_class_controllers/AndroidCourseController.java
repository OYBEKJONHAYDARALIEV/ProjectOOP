package app_controller.oop.mobile_course.controllers.abstract_class_controllers;

import app_controller.oop.mobile_course.contracts.BaseCourse;
import app_controller.oop.mobile_course.data.CourseData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static app_controller.oop.mobile_course.utility.UtilMethods.*;

/**
 * @Creator: Oybek Khaydaraliev
 * @Date: 3/20/2024
 * @File: AndroidCourseController.java
 */


public class AndroidCourseController extends BaseCourse {


    private final static List<CourseData> allAndroidCourses = new ArrayList<>(Arrays.asList(
            new CourseData(1, "6 oylik to'liq Android kursi, bunda siz 21 ta real loyiha yaratasiz..... ", "Android Bootcamp", "2020.02.02", "Shakhzod Ilkhomov", "42", "300$", false),
            new CourseData(2, "7 oylik to'liq Android kursi, bunda siz 21 ta real loyiha yaratasiz..... ", "Android Bootcamp", "2020.02.02", "Shakhzod Ilkhomov", "42", "300$", false),
            new CourseData(3, "1 yillik to'liq Android kursi, bunda siz 21 ta real loyiha yaratasiz..... ", "Android Bootcamp", "2020.02.02", "Shakhzod Ilkhomov", "42", "300$", false)

    ));

    private final static Scanner mainScanner = new Scanner(System.in);

    @Override
    public void courseInfo() {

        print("Android");

        for (CourseData index : allAndroidCourses) {
            print(index);
        }

    }

    @Override
    public void shareCourse() {
        print("Bu imkoniyat yaqin orada qo'shiladi !");
    }


    @Override
    public void leaveFeedbackForThisCourse() {
        int userFeedbackOption = getIntegerInput("Kurs uchun fikringizi qoldirmoqchimisiz ?\n1 -> Albatta qoldirmoqchiman\n0 -> Orqaga qaytish", mainScanner);
        switch (userFeedbackOption) {
            case 0 -> androidMenu();
            case 1 -> {
                Scanner scanner = new Scanner(System.in);
                int courseId = getIntegerInput("Iltimos kurs ID-sini kiriting: ", scanner);
                boolean doesFeedbackFound = false;
                for (CourseData courseData : allAndroidCourses) {
                    if (courseData.getCourseId() == courseId) {
                        Scanner scanner1 = new Scanner(System.in);
                        doesFeedbackFound = true;
                        String feedBack = getStringInput("Marxamat fikringizni qoldiring: ", scanner1);
                        courseData.getCourseFeedbacks().add(feedBack);
                        print("Fikringizgiz uchun rahmat !");
                    }
                }
                if (!doesFeedbackFound) {
                    print("Bunday ID ostida kurs mavjud emas !!");
                    leaveFeedbackForThisCourse();
                }
            }
        }
    }


    @Override
    public void showALlFeedbacks() {
        print("Barcha fikrlar: ");
        for (CourseData index : allAndroidCourses) {
            print(index.getCourseFeedbacks());
        }
    }
}
