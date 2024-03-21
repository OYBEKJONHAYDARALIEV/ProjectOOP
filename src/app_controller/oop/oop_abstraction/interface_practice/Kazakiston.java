package app_controller.oop.oop_abstraction.interface_practice;

public class Kazakiston {

    private String countryName;
    private String countyArea;

    public Kazakiston(String countryName, String countyArea) {
        this.countryName = countryName;
        this.countyArea = countyArea;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountyArea() {
        return countyArea;
    }
}
