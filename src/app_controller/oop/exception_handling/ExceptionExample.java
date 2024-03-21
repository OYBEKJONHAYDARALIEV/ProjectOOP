package app_controller.oop.exception_handling;

import java.util.ArrayList;
import static app_controller.oop.dictionary_app.utility.DUtilityMethods.print;

public class ExceptionExample {


    private static final ArrayList<PizzaHut> pizzaHutList = new ArrayList<>();


    public static void main(String[] args) {


        PizzaHut peperonniPizza = new PizzaHut("Peperonni", "Chelmska 7", 30, "Oybek", "001120");
        PizzaHut margeritaPizza = new PizzaHut("Margerita", "Bruna 4", 40, "Usmonkhuja", "032220");
        PizzaHut manoPizza = new PizzaHut("Mano", null, 20, "John", "22220");


        pizzaHutList.add(peperonniPizza);
        pizzaHutList.add(margeritaPizza);
        pizzaHutList.add(manoPizza);

        for (PizzaHut index: pizzaHutList){
           try{
               print(index);
           }catch (Exception e){
               print("Xatolik");
           }
        }


    }

}
