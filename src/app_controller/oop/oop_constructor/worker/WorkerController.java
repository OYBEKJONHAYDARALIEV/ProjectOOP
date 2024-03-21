package app_controller.oop.oop_constructor.worker;

import java.util.Scanner;

public class WorkerController {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Iltimos yosh kiriting !!:");
        int yosh = scanner.nextInt();

        Worker ozodbek = new Worker("Ozodbek", "karimov", 20, "Freelancer", 2024);
        Worker oybek = new Worker("oybek", "umarov", 21, "Android developer", 2022);
        Worker asad = new Worker("asad", "aliev", 24, "banker", 2023);
        Worker umar = new Worker("umar", "zotorov", 29, "oqtuvchi", 2019);
        Worker ali = new Worker("ali", "qundozov", 27, " bekorchi", 2021);

        Worker[] allWorkers = {
                ozodbek,
                oybek,
                asad,
                umar,
                ali,
        };

        for (int i = 0; i < allWorkers.length; i++) {
            if (yosh < allWorkers[i].yoshi) {
                System.out.println(i + 1 + ". = " + allWorkers[i]);
            }
        }


    }

}
