package app_controller.oop.oop_encapsulation;

import app_controller.oop.builder_pattern.Motor;
import app_controller.oop.builder_pattern.MumtozRestaurant;
import app_controller.oop.oop_inheritance.Father;

@SuppressWarnings("SpellCheckingInspection")
public class EncapsulationExample extends Father {

    String a;

    public EncapsulationExample(String companies, String cars, String houses, String a) {
        super(companies, cars, houses);
        this.a = a;
    }

    public static void main(String[] args) {


        /**

         Encapsulation -> capsula -> wrapping class datas with "private" modifier, and
         give us clear control over them.

         1) "private" -> instance variables

         2) setter method for that "private" instance variable

         What is setter ? -> is "public" void method that take data as parametr
         and set this data to "private" instance variable

         3) getter method for get specific "private" instance variable

         What is getter ? -> is "public" return type method that return you "private"
         instance variable as "public"


         Getter va Setter yozish developer-ga bog'liq, yani:

         1 -> vazifa faqat malamotni o'zgartish bo'lsa  -> setter method -> write-only
         2 -> vazifa faqat malamotni olish bo'lsa -> getter method -> read-only


         * */
        Motor motor =new Motor();
        motor.setSilindr("xuyna");

    }


}
