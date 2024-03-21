package app_controller.oop.builder_pattern;

import static app_controller.oop.dictionary_app.utility.DUtilityMethods.print;

public class Customer {

    public static void main(String[] args) {

        MumtozRestaurant john = new MumtozRestaurant.Builder()
                .manti("yes")
                .palov("yes")
                .build();

        MumtozRestaurant oybek = new MumtozRestaurant.Builder()
                .kabob("yes")
                .palov("yes")
                .build();

        print(john);
        print(oybek);


    }

}
