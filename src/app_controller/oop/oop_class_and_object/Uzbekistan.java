package app_controller.oop.oop_class_and_object;

public class Uzbekistan {

    final int viloyatlarSoni = 12;
    String madhiya;
    String konstitutsiya;
    double yerMaydoni;
    String aholiSoni;

    public Uzbekistan(String madhiya, String konstitutsiya, double yerMaydoni, String aholiSoni) {

        this.madhiya = madhiya;
        this.konstitutsiya = konstitutsiya;
        this.yerMaydoni = yerMaydoni;
        this.aholiSoni = aholiSoni;

    }


    public void goToSamarkhand() {
        System.out.println("Go to Samarkhand");
    }

    public void goToAndijon() {
        System.out.println("Go to Andijon");
    }


}
