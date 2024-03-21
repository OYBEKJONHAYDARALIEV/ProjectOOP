package app_controller.oop.dictionary_app.dictionary_controller;

import app_controller.oop.dictionary_app.data.Dictionary;
import app_controller.oop.dictionary_app.dictionary_contract.DictionaryContract;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static app_controller.oop.dictionary_app.utility.DUtilityMethods.*;


public class DictionaryController implements DictionaryContract {

    private final static Scanner mainScanner = new Scanner(System.in);
    private final static Map<String, Dictionary> map = new HashMap<>();


    @Override
    public void addNewWord() {
        String newWord = getStringInput("Yangi lug'at kiriting: ", mainScanner);
        String translation = getStringInput("Lug'atni tarjimasini kiriting: ", mainScanner);
        String synonym = getStringInput("Lug'at uchun siynonim kiriting: (Agar yo'q bo'lsa 0 ni kiriting) ", mainScanner);
        if (isNumeric(synonym)) {
            Dictionary myDictionary = new Dictionary(translation);
            map.put(newWord, myDictionary);
            print("Lug'at muaffaqiyatli kiritildi !");
        } else {
            Dictionary myDictionary = new Dictionary(translation);
            map.put(newWord, myDictionary);
            Dictionary dictionary = map.get(newWord);
            dictionary.getSynonyms().add(synonym);
            print("Lug'at siynonim bilan muaffaqiyatli kiritildi !");
        }
    }

    @Override
    public void addSynonym() {
        String word = getStringInput("Lug'atni kiriting: ", mainScanner);

        if (map.containsKey(word)) {
            String synonym = getStringInput("Lug'at uchun siynonim kiriting: ", mainScanner);
            Dictionary dictionary = map.get(word);
            dictionary.getSynonyms().add(synonym);
            print("Siynonim muaffaqiyatli kiritildi !");
        } else {
            print("Bunday lug'at topilmadi !!");
        }

    }

    @Override
    public void editTranslation() {
        String word = getStringInput("Lug'atni kiriting: ", mainScanner);
        if (map.containsKey(word)) {
            String newTranslation = getStringInput("Lug'at uchun yangi tarjima kiriting: ", mainScanner);
            Dictionary dictionary = map.get(word);
            dictionary.setTranslation(newTranslation);
            print("Yangi tarjima muaffaqiyatli kiritildi !");
        } else {
            print("Bunday lug'at topilmadi !!");
        }
    }

    @Override
    public void listOfWords() {
       /*       Set<String> set = map.keySet();
        for (String index : set){
            message(index + " -> " + map.get(index));
        }*/

        map.forEach((key, value) -> print(key + " -> " + value));

    }

    @Override
    public void getTranslation() {
        String word = getStringInput("Lug'atni kiriting: ", mainScanner);
        if (map.containsKey(word)) {
            Dictionary dictionary = map.get(word);
            print(dictionary);
        } else {
            print("Bunday lug'at topilmadi !!");
        }
    }

    @Override
    public void editWord() {
        String word = getStringInput("Lug'atni kiriting: ", mainScanner);
        if (map.containsKey(word)) {
            String newWord = getStringInput("Yangi lug'atni kiriting: ", mainScanner);
            Dictionary dictionary = map.get(word);
            map.put(newWord, dictionary);
            map.remove(word);
        } else {
            print("Bunday lug'at topilmadi !!");
        }
    }

    @Override
    public void deleteWord() {
        String word = getStringInput("Lug'atni kiriting: ", mainScanner);
        if (map.containsKey(word)) {
            map.remove(word);
        } else {
            print("Bunday lug'at topilmadi !!");
        }
    }

    @Override
    public void deleteTranslation() {
        String word = getStringInput("Lug'atni kiriting: ", mainScanner);
        if (map.containsKey(word)) {
            Dictionary dictionary = map.get(word);
            dictionary.setTranslation(null);
        } else {
            print("Bunday lug'at topilmadi !!");
        }
    }
}
