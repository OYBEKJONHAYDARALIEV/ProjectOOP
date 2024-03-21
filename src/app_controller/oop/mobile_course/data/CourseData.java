package app_controller.oop.mobile_course.data;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Creator: Oybek Khaydaraliev
 * @Date: 3/19/2024
 * @File: CourseData.java
 */


@Data
@AllArgsConstructor
public class CourseData {

    private int courseId;
    private String courseDescription;
    private String courseName;
    private String dateOfCreation;
    private String teacherName;
    private String courseHours;
    private String coursePrice;
    private boolean isPurchase;

    private final List<String> courseFeedbacks = new ArrayList<>();


    @Override
    public String toString() {
        return "CourseData -> " +
               "courseId: " + courseId + "\n" +
               "courseDescription: " + courseDescription + "\n" +
               ", courseName: " + courseName + "\n" +
               ", dateOfCreation: " + dateOfCreation + "\n" +
               ", teacherName: " + teacherName + "\n" +
               ", courseHours: " + courseHours + "\n" +
               ", coursePrice: " + coursePrice + "\n" +
               ", isPurchase: " + isPurchase + "\n";
    }
}
