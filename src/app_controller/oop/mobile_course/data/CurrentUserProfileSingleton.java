package app_controller.oop.mobile_course.data;

import lombok.Getter;
import lombok.Setter;

/**
 * @Creator: Oybek Khaydaraliev
 * @Date: 3/20/2024
 * @File: CurrentUserProfile.java
 */


@Setter
@Getter
public class CurrentUserProfileSingleton {
    private static CurrentUserProfileSingleton instance;

    private String fullName;
    private String phoneNumber;
    private String password;

    private CurrentUserProfileSingleton() {
        // Private constructor to prevent instantiation
    }

    public static CurrentUserProfileSingleton getInstance() {
        if (instance == null) {
            instance = new CurrentUserProfileSingleton();
        }
        return instance;
    }

    public void clearALlSavedData() {
        instance = null;
    }

}

