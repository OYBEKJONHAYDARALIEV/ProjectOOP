package app_controller.oop.oop_inheritance;

public class Father {

    protected String companies;
    String cars;
    private String houses;

    public Father(String companies, String cars, String houses) {
        this.companies = companies;
        this.cars = cars;
        this.houses = houses;
    }

    void companyControlling() {
        System.out.println("Controlling the comapany");
    }

    void houseControlling() {
        System.out.println("Controlling the house");
    }

    void carsOwenering() {
        System.out.println("Ownering the house");
    }


    public static void main(String[] args) {


        Child child = new Child("wrwe", "werrw", "wrrwr", "English", "French");
        System.out.println(child);

    }
}
