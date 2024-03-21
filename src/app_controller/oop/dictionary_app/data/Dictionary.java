package app_controller.oop.dictionary_app.data;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private String translation;

    private final List<String> synonyms = new ArrayList<>();

    public Dictionary(String translation) {
        this.translation = translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public List<String> getSynonyms() {
        return synonyms;
    }

    @Override
    public String toString() {
        return "Translate: " + translation + ". Synonyms: " + synonyms;
    }
}
