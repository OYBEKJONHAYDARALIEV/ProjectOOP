package app_controller.oop.oop_encapsulation.practice;

public class PersonalDatas {

    private String personalName;
    private String personalBringings;
    private String personalPasswords;

    public PersonalDatas(String personalName, String personalBringings, String personalPasswords) {
        this.personalName = personalName;
        this.personalBringings = personalBringings;
        this.personalPasswords = personalPasswords;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public String getPersonalBringings() {
        return personalBringings;
    }

    public void setPersonalBringings(String personalBringings) {
        this.personalBringings = personalBringings;
    }

    public String getPersonalPasswords() {
        return personalPasswords;
    }

    public void setPersonalPasswords(String personalPasswords) {
        this.personalPasswords = personalPasswords;
    }

    @Override
    public String toString() {
        return "PersonalDatas{" +
                "personalName='" + personalName + '\'' +
                ", personalBringings='" + personalBringings + '\'' +
                ", personalPasswords='" + personalPasswords + '\'' +
                '}';
    }
}
