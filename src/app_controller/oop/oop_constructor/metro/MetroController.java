package app_controller.oop.oop_constructor.metro;

import java.util.Scanner;

public class MetroController {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Iltimos vaqtni kiriting !!: (2.00)");
//        double time = scanner.nextDouble();



        Metro metro1 = new Metro("natolin", "mlochiny", 2.45, "M1");
        Metro metro2 = new Metro("imelin", "mlochiny", 2.30, "M1");
        Metro metro3 = new Metro("wierzbo", "mlochiny", 1.45, "M1");
        Metro metro4 = new Metro("arsenowska", "trocka", 50, "M2");
        Metro metro5 = new Metro("rondo onz", "trocka", 1.38, "M2");

        Metro myMetro = new Metro();

        System.out.println(metro1);


        Metro[] allMetros = {
                metro1,
                metro2,
                metro3,
                metro4,
                metro5,
        };

//        for (int i = 0; i < allMetros.length; i++) {
//            if (allMetros[i].yoldaYurishVaqti < time) {
//                System.out.println(i + 1 + ". = " + allMetros[i]);
//            }
//        }
    }

}
