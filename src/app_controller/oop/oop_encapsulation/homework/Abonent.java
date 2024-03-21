package app_controller.oop.oop_encapsulation.homework;

public class Abonent {
    private String ism;
    private String manzil;
    private int yosh;
    private String telefonRaqam;
    private String kompaniyaNomi;

    public Abonent(String ism, String manzil, int yosh, String telefonRaqam) {
        setIsm(ism);
        setManzil(manzil);
        setYosh(yosh);
        setTelefonRaqam(telefonRaqam);
    }


    public void setIsm(String ism) {

        if (!ism.isEmpty()) {
            String name = ism.trim();
            String firstLetter = name.substring(0, 1).toUpperCase();
            String otherLetters = name.substring(1);

            this.ism = firstLetter.concat(otherLetters);
        } else {
            throw new RuntimeException("Telefon raqam kiritilmagan !!");
        }
    }


    public void setManzil(String manzil) {
        this.manzil = manzil;
    }

    public void setYosh(int yosh) {
        this.yosh = yosh;
    }


    public void setTelefonRaqam(String telefonRaqam) {

        if (telefonRaqam.startsWith("+998")) {
            this.telefonRaqam = telefonRaqam;
        } else if (!telefonRaqam.startsWith("+998") && telefonRaqam.length() == 9) {
            this.telefonRaqam = "+998" + telefonRaqam;
        } else if (telefonRaqam.startsWith("998") && telefonRaqam.length() == 12 ){
            this.telefonRaqam = "+" + telefonRaqam;
        }

    }

    public int getYosh(){
        return yosh;
    }

    public String getKompaniyaNomi(){
        return kompaniyaniAjratish();
    }


    @Override
    public String toString() {
        return " Abonent ->  \n" +
                " ism ->  " + ism + "\n" +
                " manzil -> " + manzil + "\n" +
                " yosh -> " + yosh + "\n" +
                " telefonRaqam -> " + telefonRaqam + "\n" +
                " kompaniyaNomi -> " + kompaniyaniAjratish() + "\n";
    }

    private String kompaniyaniAjratish() {

        if (telefonRaqam.startsWith("+99890") || telefonRaqam.startsWith("+99891")) {
            return "BEELINE";
        } else if (telefonRaqam.startsWith("+99893") || telefonRaqam.startsWith("+99894")) {
            return "UCELL";
        }

        return "Kompaniya nomi kiritilmadi !!";
    }


}
