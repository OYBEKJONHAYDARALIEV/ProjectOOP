package app_controller.oop.mobile_course.utility;

import app_controller.oop.mobile_course.contracts.BaseCourse;
import app_controller.oop.mobile_course.contracts.CourseContracts;
import app_controller.oop.mobile_course.contracts.ProfileContracts;
import app_controller.oop.mobile_course.contracts.RegistrationContracts;
import app_controller.oop.mobile_course.controllers.abstract_class_controllers.*;
import app_controller.oop.mobile_course.controllers.interface_controllers.CourseController;
import app_controller.oop.mobile_course.controllers.interface_controllers.ProfileController;
import app_controller.oop.mobile_course.controllers.interface_controllers.RegistrationController;
import app_controller.oop.mobile_course.data.CurrentUserProfileSingleton;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilMethods {
    public static String getStringInput(String message, Scanner scanner) {
        print(message);
        return scanner.nextLine();
    }

    public static int getIntegerInput(String message, Scanner scanner) {
        print(message);
        return scanner.nextInt();
    }

    public static double getDoubleInput(String message, Scanner scanner) {
        print(message);
        return scanner.nextDouble();
    }

    public static <T> void print(T message) {
        System.out.println(message);
    }

    public static boolean isPasswordConfirmed(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }

    public static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            print("Xatolik yuz berdi: " + e.getMessage());
        }
    }

    public static void throwIncorrectPasswordException(String message) {
        try {
            throw new IncorrectPasswordException("Parol noto'g'ri xatoligi !!");
        } catch (RuntimeException e) {
            print(message + ": " + e.getMessage());
        }
    }


    public static void throwIncorrectPhoneNumberException(String message) {
        try {
            throw new IncorrectPhoneNumberException("Telefon raqam noto'g'ri xatoligi !!");
        } catch (RuntimeException e) {
            print(message + ": " + e.getMessage());
        }
    }

    public static void throwIncorrectNameException(String message) {
        try {
            throw new IncorrectPhoneNumberException("Ism noto'g'ri xatoligi !!");
        } catch (RuntimeException e) {
            print(message + ": " + e.getMessage());
        }
    }


    public static boolean isPasswordValid(String password) {

        if (password.isEmpty()) {
            throwIncorrectPasswordException("Bo'sh joy kiritish mumkin emas");
            return false;
        } else if (password.length() < 5) {
            return false;
        } else return isPasswordStrong(password);
    }

    public static boolean isPasswordStrong(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSymbol = false;
        boolean hasNumber = false;

        for (int i = 0; i < password.length(); i++) {
            char passwordChar = password.charAt(i);
            if (Character.isUpperCase(passwordChar)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(passwordChar)) {
                hasLowerCase = true;
            } else if (!Character.isLetterOrDigit(passwordChar)) {
                hasSymbol = true;
            } else if (Character.isDigit(passwordChar)) {
                hasNumber = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasSymbol && hasNumber;
    }


    public static void registrationMenu() {
        Scanner scanner = new Scanner(System.in);
        RegistrationContracts registrationContracts = new RegistrationController();
        while (true) {
            print("""
                     +------------------------------------+
                    |                                      |
                    |       1 -> Dasturga kirish           |
                    |       2 -> Ro'yxatdan o'tish         |
                    |       3 -> Parolni unutdingizmi ?    |
                    |                                      |
                     +-----------------------------------+
                    """);

            try {
                switch (scanner.nextInt()) {
                    case 1 -> registrationContracts.signIn();
                    case 2 -> registrationContracts.signUp();
                    case 3 -> registrationContracts.forgotPassword();
                    case 4 -> registrationContracts.usersList();
                    default -> System.out.println("Noto'g'ri tanlov !!");
                }
            } catch (InputMismatchException e) {
                misMatchedInput(scanner, 1);
            }
        }
    }

    public static void appMenu() {
        Scanner scanner = new Scanner(System.in);
        CourseContracts courseContracts = new CourseController();
        while (true) {
            print("""
                       +------------------------------------+
                    |                                          |
                    |       1 -> Profilni ko'rish              |
                    |       2 -> Barcha kurslar                |
                    |       3 -> Tavsiya etiladigan kurslar    |
                    |       4 -> Yordam markazi                |
                    |       5 -> Menim kurslarim               |
                    |       6 -> Kurslarni qidirish            |
                    |       7 -> Yoqtirilgan kurslar           |
                    |       0 -> Dasturni yopish               |
                    |                                          |
                       +------------------------------------+
                    """);


            try {
                switch (scanner.nextInt()) {
                    case 0 -> System.exit(1);
                    case 1 -> courseContracts.viewProfile();
                    case 2 -> courseContracts.allCourses();
                    case 3 -> courseContracts.recommendedCourses();
                    case 4 -> courseContracts.helpCenter();
                    case 5 -> courseContracts.myCourses();
                    case 6 -> courseContracts.searchCourses();
                    case 7 -> courseContracts.favouriteCourses();
                }
            } catch (InputMismatchException e) {
                misMatchedInput(scanner, 2);
            }
        }
    }

    public static void misMatchedInput(Scanner scanner, int menuType) {

        scanner.nextLine();

        int integerInput = getIntegerInput("Siz noto'g'ri tanlov kiritdingiz. Dasturni yopmoqchimisiz ?\n1 -> Dasturni yopish\n2 -> Davom ettirish", scanner);

        switch (integerInput) {
            case 1 -> System.exit(1);
            case 2 -> {
                switch (menuType) {
                    case 1 -> registrationMenu();
                    case 2 -> appMenu();
                    case 3 -> profileMenu();
                    case 4 -> coursesMenu();
                }
            }
        }

    }

    public static void profileMenu() {
        Scanner scanner = new Scanner(System.in);
        ProfileContracts profileContracts = new ProfileController();
        while (true) {
            print("Ismingiz: " + CurrentUserProfileSingleton.getInstance().getFullName() + "\n" + "Telefon raqamingiz: " + CurrentUserProfileSingleton.getInstance().getPhoneNumber());
            print("""
                        +------------------------------------+
                    |                                           |
                    |       1 -> Ismni o'zgartish               |
                    |       2 -> Telefon raqamni o'zgartirish   |
                    |       3 -> Parolni o'zgartirish           |
                    |       4 -> Profildan chiqish              |
                    |       5 -> Profilni o'chirib tashlash     |
                    |       0 -> Asosiy oynaga qaytish          |
                    |                                           |
                        +------------------------------------+
                    """);

            try {
                switch (scanner.nextInt()) {
                    case 0 -> appMenu();
                    case 1 -> profileContracts.editName();
                    case 2 -> profileContracts.editPhoneNumber();
                    case 3 -> profileContracts.changePassword();
                    case 4 -> profileContracts.signOut();
                    case 5 -> profileContracts.deleteAccount();
                }
            } catch (InputMismatchException e) {
                misMatchedInput(scanner, 3);
            }
        }
    }


    public static void coursesMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            print("""
                        +------------------------------------+
                    |                                             |
                    |       1 -> Android kurslarni ko'rish        |
                    |       2 -> IOS kurslar ko'rish              |
                    |       3 -> Flutter kurslarni ko'rish        |
                    |       4 -> FullStackWeb kurslarni ko'rish   |
                    |       5 -> QA Tester kurslarni ko'rish      |
                    |       0 -> Orqaga qaytisn                   |
                    |                                             |
                        +------------------------------------+    
                    """);


            try {
                switch (scanner.nextInt()) {
                    case 0 -> appMenu();
                    case 1 -> androidMenu();
                    case 2 -> iosMenu();
                    case 3 -> flutterMenu();
                    case 4 -> fullStackWebMenu();
                    case 5 -> qaTesterMenu();
                }
            } catch (InputMismatchException e) {
                misMatchedInput(scanner, 3);
            }
        }
    }

    public static void generalCourseMenu(BaseCourse courseController, String courseName) {
        Scanner scanner = new Scanner(System.in);
        print(courseName + " kursi: ");
        try {
            while (true) {
                print("""
                        +------------------------------------+
                    |                                           |
                    |       1 -> Kurs haqida malumot            |
                    |       2 -> Kursni ulashish                |
                    |       3 -> Kurs haqida fikirlar           |
                    |       4 -> Barcha fikrlarni ko'rish       |
                    |       0 -> Orqaga qaytisn                 |
                    |                                           |
                        +------------------------------------+    
                    """);
                switch (scanner.nextInt()) {
                    case 0 ->  coursesMenu();
                    case 1 ->  courseController.courseInfo();
                    case 2 ->  courseController.shareCourse();
                    case 3 ->  courseController.leaveFeedbackForThisCourse();
                    case 4 -> courseController.showALlFeedbacks();
                }
            }
        } catch (InputMismatchException e) {
            misMatchedInput(scanner, 4);
        }
    }

    public static void androidMenu() {
        BaseCourse androidCourseController = new AndroidCourseController();
        generalCourseMenu(androidCourseController, "Android");
    }

    public static void iosMenu() {
        BaseCourse iosCourseController = new IOSCourseController();
        generalCourseMenu(iosCourseController, "iOS");
    }

    public static void flutterMenu() {
        BaseCourse flutterCourseController = new FlutterCourseController();
        generalCourseMenu(flutterCourseController, "Flutter");
    }

    public static void fullStackWebMenu() {
        BaseCourse fullStackWebCourseController = new FullStackWebCourseController();
        generalCourseMenu(fullStackWebCourseController, "Full Stack Web");
    }

    public static void qaTesterMenu() {
        BaseCourse qaTesterCourseController = new QATesterCourseController();
        generalCourseMenu(qaTesterCourseController, "QA Tester");
    }






}
