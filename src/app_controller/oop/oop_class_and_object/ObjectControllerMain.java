package app_controller.oop.oop_class_and_object;

import java.util.Arrays;

@SuppressWarnings("SpellCheckingInspection")
public class ObjectControllerMain {

    public static void main(String[] args) {


        // HEAP -> new keyword

//        String hey = "Hey";
//        char h = 'H';
//        char e = 'e';
//        char y = 'y';
//
//        char[] hey1 = {h, e, y};
//        System.out.println(Arrays.toString(hey1));

        Uzbekistan oybek  =  new Uzbekistan("Serquyosh....","Uzb kons", 44.44000, "37 million" );
//        System.out.println(  oybek.madhiya =   );
//        System.out.println(  oybek.aholiSoni = );
//        System.out.println(  oybek.konstitutsiya  =  );
//        System.out.println(  oybek.yerMaydoni =   );
//        System.out.println(  oybek.viloyatlarSoni );

        oybek.goToAndijon();
        oybek.goToSamarkhand();

        System.out.println("---------------------------------------");

        Uzbekistan ozodbek  =  new Uzbekistan("Serquyosh hur o'lkam....","38 million",44.47000,"Uzb konsitut" );

//        System.out.println(  ozodbek.madhiya =   );
//        System.out.println(  ozodbek.aholiSoni = );
//        System.out.println(  ozodbek.konstitutsiya  =  );
//        System.out.println(  ozodbek.yerMaydoni =   );
//        System.out.println(  ozodbek.viloyatlarSoni);

        ozodbek.goToAndijon();
        ozodbek.goToSamarkhand();

        String string = "usb"; // literal string -> string pool

        String string1 = new String("hiidie"); // with new keyword -> heap


        String string2 = new String("Hello");


        int a = 5;

        // variable -> ( o'zgaruvchi ) -> is container to hold data -> [ int a ]
        // variable name -> [ a ]
        // data type -> [ int ]
        // data types -> byte, short, int, float, long , double, boolean, char
        // data -> [ 5 ]
        // assignment operator -> [ = ]




        // method 2
        // 1. void -> keyword
        // 2. return type

        // method overloading

        hi("HI");
        hi(89);

        // method overriding





        //  what is class ?   ->  is blueprint for creating object -> maniken
        //  what is object ?  ->  is instance of class  -> xar xil kiyimlar



        // default values or initial values
        // int, short, byte, long  -> 0
        // double, float -> 0.0
        // boolean -> false
        // char -> /n0000
        // String -> null

    }

    public static void hi(String string){

    }

    public static void hi(int string){

    }

}
