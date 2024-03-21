package app_controller.oop.mobile_course.controllers.interface_controllers;

import app_controller.oop.mobile_course.contracts.ProfileContracts;
import app_controller.oop.mobile_course.data.CurrentUserProfileSingleton;

import java.util.Scanner;

import static app_controller.oop.mobile_course.utility.UtilMethods.*;

/**
 * @Creator: Oybek Khaydaraliev
 * @Date: 3/19/2024
 * @File: ProfileController.java
 */


public class ProfileController implements ProfileContracts {
    private final static Scanner mainScanner = new Scanner(System.in);
    private final static CurrentUserProfileSingleton savedUserDatas = CurrentUserProfileSingleton.getInstance();

    @Override
    public void editName() {
        print("Ismni o'zgartirish bo'limi !");
        print("Ismingiz: " + savedUserDatas.getFullName());
        sleep(500);

        String newFullName = getStringInput("Yangi ismni kiriting: ", mainScanner);
        print("0 -> Orqaga qaytish");
        if (newFullName.isEmpty()) {
            throwIncorrectNameException("Yangi ism uchun hech narsa kiritilmadi ");
        } else if (newFullName.equals("0")) {
            appMenu();
        } else {
            savedUserDatas.setFullName(newFullName);
            print("Yangi ismga muvaffaqiyatli o'zgartirildi !");
        }
    }

    @Override
    public void editPhoneNumber() {
        print("Telefon raqamni o'zgartirish bo'limi !");
        print("Telefon raqamingiz: " + savedUserDatas.getPhoneNumber());
        sleep(500);

        String newPhoneNumber = getStringInput("Yangi telefon raqamini kiriting: ", mainScanner);
        if (newPhoneNumber.isEmpty()) {
            throwIncorrectNameException("Yangi telefon raqam uchun hech narsa kiritilmadi ");
        } else {
            savedUserDatas.setPhoneNumber(newPhoneNumber);
            print("Yangi telefon raqam muvaffaqiyatli o'zgartirildi !");
        }
    }

    @Override
    public void changePassword() {
        print("Parolni o'zgartirish bo'limi !");
        print("Parolingiz: " + savedUserDatas.getPassword());
        sleep(500);

        String newPassword = getStringInput("Yangi parolni kiriting: ", mainScanner);

        if (isPasswordValid(newPassword)) {
            String confirmPassword = getStringInput("Parolni yana bir bor tasdiqlang !", mainScanner);
            if (isPasswordConfirmed(newPassword, confirmPassword)) {
                savedUserDatas.setPassword(newPassword);
                print("Yangi parol muvaffaqiyatli o'zgartirildi !");
            } else {
                throwIncorrectPasswordException("Parolingiz to'g'ri tasdiqlanmadi");
            }
        } else {
            throwIncorrectPasswordException("Parol yetarlicha xavfsiz emas !, qaytadan urinib ko'ring");
        }

    }

    @Override
    public void signOut() {
        int logOutInput = getIntegerInput("Profildan rostdan ham chiqmoqchimisiz ?\n1 -> Xa profildan chiqilsin\n2 -> Bekor qilinsin", mainScanner);
        switch (logOutInput) {
            case 1 -> registrationMenu();
            case 2 -> appMenu();
        }
    }

    @Override
    public void deleteAccount() {
        int deleteAccountInput = getIntegerInput("Profilni rostdan ham o'chirmoqchimisiz ?\n1 -> Xa profil o'chirilsin\n2 -> Bekor qilinsin", mainScanner);
        switch (deleteAccountInput) {
            case 1 -> {
                int deleteAccountDoubleCheckInput = getIntegerInput("Agar profilni o'chirsangiz, barcha malumotlaringiz o'chirilib tashlanadi.\nDavom ettirilsinmi ?\n1 -> Xa davom ettirilsin\n2 -> Bekor qilinsin", mainScanner);
                switch (deleteAccountDoubleCheckInput) {
                    case 1 -> {

                        savedUserDatas.clearALlSavedData();
                        print("Profilingiz muvaffaqiyatli o'chirildi !");
                        registrationMenu();
                    }
                    case 2 -> appMenu();

                }
            }
            case 2 -> {

            }
        }
    }

}
