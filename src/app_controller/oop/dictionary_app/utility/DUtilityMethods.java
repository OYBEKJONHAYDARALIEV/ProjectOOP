package app_controller.oop.dictionary_app.utility;

import java.util.Scanner;

public class DUtilityMethods {

    public static String getStringInput(String message, Scanner scanner ){
        print(message);
        return scanner.nextLine();
    }

    public static int getIntegerInput(String message, Scanner scanner ){
        print(message);
        return scanner.nextInt();
    }

    public static double getDoubleInput(String message, Scanner scanner ){
        print(message);
        return scanner.nextDouble();
    }

    public static <T> void print(T message){
        System.out.println(message);
    }

    public static boolean isNumeric(String str){
        try{
           Integer.parseInt(str);
           return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

}
