package app_controller.oop.ussd_mobile.main_controller;

import app_controller.oop.ussd_mobile.user_side.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import static app_controller.oop.ussd_mobile.utility.Constants.*;
import static app_controller.oop.ussd_mobile.utility.UtilMethods.*;

public class MainController {
    private static final ArrayList<User> allSubscribers = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        addFakeSubscribers();
        startApp();
    }

    private static void startApp() throws InterruptedException {
        System.out.println("   Bugungi sana: " + LocalDate.now());
        Thread.sleep(1000);
        System.out.println("✬ MOBIL ALOQA OPERATORLARI ✬");
        mainMenu();
    }

    private static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("1 - Abonentlar ro'yxati");
            System.out.println("2 - Abonentlar qo'shish");
            System.out.println("3 - Abonentlar o'chirish");
            System.out.println("4 - Abonent qidirish");
            System.out.println("5 - Dasturdan chiqish");
            System.out.println("-----------------------------");
            System.out.print("Iltimos, tanlang: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case MENU_LIST_SUBSCRIBERS -> listSubscribers();
                case MENU_ADD_SUBSCRIBER -> addSubscriber();
                case MENU_DELETE_SUBSCRIBER -> deleteSubscriber();
                case MENU_SEARCH_SUBSCRIBER -> searchSubscriber();
                case MENU_EXIT -> exitApp();
                default -> System.out.println("Noto'g'ri tanlov. Iltimos, qayta urinib ko'ring.");
            }
        }
    }

    private static void listSubscribers() {
        System.out.println("----- Barcha Abonentlar -----");
        for (User subscriber : allSubscribers) {
            System.out.println(subscriber);
        }
    }

    private static void addSubscriber() {
        Scanner addUserScanner = new Scanner(System.in);
        String name = getStringInput("Abonent ismini kiriting: ", addUserScanner);
        String phoneNumber = getStringInput("Abonent telefon raqamini kiriting: ", addUserScanner);
        int companyChoice = getIntegerInput(
                "Abonent kompaniya turini tanlang: \n 1 - Beeline \n 2 - Ucell \n 3 - Uzmobile",
                addUserScanner
        );
        String companyName = "";
        switch (companyChoice) {
            case 1 -> companyName = "Beeline";
            case 2 -> companyName = "Ucell";
            case 3 -> companyName = "Uzmobile";
        }
        double balance = getDoubleInput("Abonent balansini kiriting: (Masalan: 20.0)", addUserScanner);
        allSubscribers.add(new User(name, phoneNumber, companyName, balance));
        System.out.println("Abonent muvaffaqiyatli qo'shildi !");
    }

    private static void deleteSubscriber() {
        Scanner deleteUserScanner = new Scanner(System.in);
        String phoneNumber = getStringInput("O'chiriladigan abonentning telefon raqamini kiriting: ", deleteUserScanner);
        if (phoneNumber.startsWith("+")) phoneNumber = phoneNumber.substring(1);
        User subscriberToDelete = null;
        for (User subscriber : allSubscribers) {
            String currentPhone = subscriber.getPhoneNumber();
            if (currentPhone.startsWith("+")) currentPhone = currentPhone.substring(1);
            if (currentPhone.equals(phoneNumber)) {
                subscriberToDelete = subscriber;
                break;
            }
        }
        if (subscriberToDelete == null) {
            System.out.println("Siz kiritgan telefon raqami ostida hech qanday abonent topilmadi !!");
        } else {
            int choice = getIntegerInput("1 - xa, abonent o'chirilsin !\n2 - yo'q, o'chirilmasin !", deleteUserScanner);
            switch (choice) {
                case 1:
                    allSubscribers.remove(subscriberToDelete);
                    System.out.println("Abonent muvaffaqiyatli o'chirildi !!");
                    break;
                case 2:
                    System.out.println("O'chirish bekor qilindi.");
                    break;
                default:
                    System.out.println("Noto'g'ri tanlov. O'chirish bekor qilindi.");
                    break;
            }
        }
    }

    private static void searchSubscriber() {
        Scanner searchUserScanner = new Scanner(System.in);
        String phoneNumber = getStringInput("Qidirilayotgan abonentning telefon raqamini kiriting: ", searchUserScanner);
        if (phoneNumber.startsWith("+")) phoneNumber = phoneNumber.substring(1);
        User foundSubscriber = null;
        for (User subscriber : allSubscribers) {
            String currentPhone = subscriber.getPhoneNumber();
            if (currentPhone.startsWith("+")) currentPhone = currentPhone.substring(1);
            if (currentPhone.equals(phoneNumber)) {
                foundSubscriber = subscriber;
                break;
            }
        }
        if (foundSubscriber == null) {
            System.out.println("Siz kiritgan telefon raqami ostida hech qanday abonent topilmadi !!");
        } else {
            System.out.println("Foydalanuvchi topildi: ");
            System.out.println(foundSubscriber);
        }
    }

    private static void addFakeSubscribers() {
        allSubscribers.add(new User("Ozodbek", "+998902084639", "Beeline", 90.90));
        allSubscribers.add(new User("Oybek", "+998998999999", "Ucell", 45.0));
        allSubscribers.add(new User("Usmonxo'ja", "+998905656666", "Uzmobile", 22.90));
    }

    private static void exitApp() {
        System.out.println("Dasturimizdan foydalanganingiz uchun rahmat, Salomat bo'ling !!");
        System.exit(0);
    }

}
