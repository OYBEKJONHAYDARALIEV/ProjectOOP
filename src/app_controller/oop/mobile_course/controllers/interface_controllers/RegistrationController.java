package app_controller.oop.mobile_course.controllers.interface_controllers;

import app_controller.oop.mobile_course.contracts.RegistrationContracts;
import app_controller.oop.mobile_course.data.CurrentUserProfileSingleton;
import app_controller.oop.mobile_course.data.RegistrationData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static app_controller.oop.mobile_course.utility.UtilMethods.*;

public class RegistrationController implements RegistrationContracts {

    private final static Scanner mainScanner = new Scanner(System.in);
    private final static ArrayList<RegistrationData> userList = new ArrayList<>(Arrays.asList(
            new RegistrationData("Oybek Haydaraliyev", "999", "QQ!!qq11"),
            new RegistrationData("Ozodbek Karimov", "888", "QQ!!qq11")));

    @Override
    public void signIn() {
        print("Dasturga kirish bo'limi !!");
        sleep(1000);

        String phoneNumber = getStringInput("Telefon raqamingizni kiriting", mainScanner);
        boolean phoneNumberFound = false;

        for (RegistrationData registrationData : userList) {
            if (registrationData.getPhoneNumber().equals(phoneNumber)) {
                phoneNumberFound = true;
                String password = getStringInput("Parol kiriting: ", mainScanner);
                if (registrationData.getPassword().equals(password)) {
                    print("Dasturga xush kelibsiz !!");
                    appMenu();
                    break;
                } else {
                    throwIncorrectPasswordException("Parolingiz to'g'ri tasdiqlanmadi");
                }
            }
        }

        if (!phoneNumberFound) {
            throwIncorrectPhoneNumberException("Ushbu : " + phoneNumber + " telefon raqamiga tegishli profil yaratilmagan: ");
        }

    }

    @Override
    public void signUp() {
        print("Ro'yxatdan o'tish bo'limi !!");
        sleep(1000);
        String fullName = getStringInput("To'liq ismingizni kiriting: ", mainScanner);
        String phoneNumber = getStringInput("Telefon raqamingizni kiriting: ", mainScanner);
        String password = getStringInput("Parol kiriting: ", mainScanner);

        if (isPasswordValid(password)) {
            String confirmPassword = getStringInput("Parolni yana bir bor tasdiqlang !", mainScanner);
            if (isPasswordConfirmed(password, confirmPassword)) {
                RegistrationData user = new RegistrationData(fullName, phoneNumber, confirmPassword);

                CurrentUserProfileSingleton currentUserProfileSingleton = CurrentUserProfileSingleton.getInstance();
                currentUserProfileSingleton.setFullName(fullName);
                currentUserProfileSingleton.setPhoneNumber(phoneNumber);
                currentUserProfileSingleton.setPassword(confirmPassword);

                userList.add(user);
                print("Ro'yxatdan muvaffaqiyatli o'tdingiz !!");
            } else {
                throwIncorrectPasswordException("Parolingiz to'g'ri tasdiqlanmadi");
            }
        } else {
            throwIncorrectPasswordException("Parol yetarlicha xavfsiz emas !, qaytadan urinib ko'ring");
        }
    }

    @Override
    public void forgotPassword() {
        print("Parolni tiklash bo'limi !!");
        sleep(1000);

        String phoneNumber = getStringInput("Telefon raqamingizni kiriting", mainScanner);

        for (RegistrationData registrationData : userList) {
            if (registrationData.getPhoneNumber().equals(phoneNumber)) {
                String name = getStringInput("Ismingizni kiriting: ", mainScanner);
                if (registrationData.getFullName().equals(name)) {
                    String newPassword = getStringInput("Yangi parolni kiriting: ", mainScanner);
                    String newConfirmedPassword = getStringInput("Yangi parolni yana bir marta kiriting: ", mainScanner);
                    if (isPasswordConfirmed(newPassword, newConfirmedPassword)) {
                        registrationData.setPassword(newConfirmedPassword);
                        print("Parolingi muvaffaqiyatli tasdiqlandi !!");
                    } else {
                        throwIncorrectPasswordException("Yangi parol to'gri tasdiqlanmadi, qaytadan urinib ko'ring");
                    }
                } else {
                    throwIncorrectNameException("Ushbu: " + name + " ismi ostida profil mavjud emas");
                }
            } else {
                throwIncorrectPhoneNumberException("Ushbu : " + phoneNumber + " telefon raqamiga tegishli profil yaratilmagan: ");
            }
        }
    }

    @Override
    public void usersList() {
        for (RegistrationData index : userList) {
            print(index);
        }
    }

}


