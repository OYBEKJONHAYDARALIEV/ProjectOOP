package app_controller.oop.oop_abstraction.interface_practice;

public class Tojikiston implements Uzbek_Tojik_Contracts {

    private String countryName;
    private String countyArea;

    public Tojikiston(String countryName, String countyArea) {
        this.countryName = countryName;
        this.countyArea = countyArea;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountyArea() {
        return countyArea;
    }

    @Override
    public void selfDefence() {

    }

    @Override
    public void noFight() {

    }

    @Override
    public void noRubbery() {

    }
}
