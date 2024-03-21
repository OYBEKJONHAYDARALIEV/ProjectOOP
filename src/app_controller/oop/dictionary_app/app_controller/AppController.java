package app_controller.oop.dictionary_app.app_controller;

import app_controller.oop.dictionary_app.dictionary_contract.DictionaryContract;
import app_controller.oop.dictionary_app.dictionary_controller.DictionaryController;
import java.util.Scanner;
import static app_controller.oop.dictionary_app.utility.DUtilityMethods.print;

public class AppController {

    private final static Scanner mainScanner = new Scanner(System.in);
    private final static DictionaryContract contract = new DictionaryController();


    public static void main(String[] args) {

        while (true) {
            print("""
                    1 -> Yangi lug'at qo'shish
                    2 -> Yangi siynonim qo'shish
                    3 -> Tarjimani o'zgartirish
                    4 -> Lug'atlar ro'yxatini chiqarish
                    5 -> Lug'at tarjimasini ko'rish
                    6 -> Lug'atni o'zgartirish
                    7 -> Lug'atni o'chirish
                    8 -> Tarjimani o'chirish
                    0 -> Dasturdan chiqish
                       """);

            switch (mainScanner.nextInt()) {
                case 0 -> System.exit(1);
                case 1 -> contract.addNewWord();
                case 2 -> contract.addSynonym();
                case 3 -> contract.editTranslation();
                case 4 -> contract.listOfWords();
                case 5 -> contract.getTranslation();
                case 6 -> contract.editWord();
                case 7 -> contract.deleteWord();
                case 8 -> contract.deleteTranslation();
            }
        }

    }

}
