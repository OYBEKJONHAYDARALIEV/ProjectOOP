package app_controller.oop.oop_abstraction.interface_practice;

public class Uzbekistan implements Uzbek_Tojik_Contracts, Uzbek_Kazak_Contracts {

    private String countryName;
    private String countyArea;

    public Uzbekistan(String countryName, String countyArea) {
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

    @Override
    public void selling() {

    }


}
