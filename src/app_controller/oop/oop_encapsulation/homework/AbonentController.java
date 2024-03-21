package app_controller.oop.oop_encapsulation.homework;

public class AbonentController {

    public static void main(String[] args) {


        Abonent abonent1 = new Abonent("oybekjn", " manakStreet", 27, "+998906211522");
        Abonent abonent2 = new Abonent("oybekjon", " manakStreet", 20, "+998976211522");
        Abonent abonent3 = new Abonent("Mello", " manakStreet", 25, "+998906211522");
        Abonent abonent4 = new Abonent("oybekon", " manakStreet", 24, "+998936211522");
        Abonent abonent5 = new Abonent("oybkjon", " manakStreet", 21, "+998916211522");

        Abonent[] abonents = {abonent1, abonent2, abonent3, abonent4, abonent5};
        Address address1 = new Address("Toshkent shahri", "Chilonzor", "Hello", 345);
        Address address2 = new Address("Andijon shaxri", "Mozor", "Hello", 345);
        Address address3 = new Address("Fargona shaxri", "Gulzor", "Hello", 345);
        Address address4 = new Address("Sirdaryo shaxri", "Changalzor", "Hello", 345);
        Address address5 = new Address("Qashqadaro shaxri", "Paxtazor", "Hello", 345);

        Address[] addresses = {address1, address2, address3, address4, address5};

        shartliVazifa(abonents, addresses);

    }

    public static void shartliVazifa(Abonent[] abonents, Address[] addresses) {

        boolean isAbonentFound = false;

        for (Address address : addresses){
            for (Abonent abonent : abonents){
                if (address.getViloyat().equals("Toshkent shahri")) {
                    if (address.getTuman().equals("Chilonzor")) {
                        if (abonent.getYosh() >= 25) {
                            if (abonent.getKompaniyaNomi().equalsIgnoreCase("BEELINE")) {
                                System.out.println(address + "\n" + abonent);
                                isAbonentFound = true;
                                break;
                            }
                        }
                    }
                }
            }

            if (isAbonentFound){
                break;
            }

        }
    }
}




