package app_controller.oop.ussd_mobile.utility;

import java.util.Scanner;

public class UtilMethods {

    public static String phoneNumberFormatter(String phoneNumber) {

        if (phoneNumber.startsWith("+")) phoneNumber = phoneNumber.substring(1);
        char[] phoneNumberChars = phoneNumber.toCharArray();
        return String.format("+%s%s%s(%s%s)%s%s%s-%s%s-%s%s",
                phoneNumberChars[0],
                phoneNumberChars[1],
                phoneNumberChars[2],
                phoneNumberChars[3],
                phoneNumberChars[4],
                phoneNumberChars[5],
                phoneNumberChars[6],
                phoneNumberChars[7],
                phoneNumberChars[8],
                phoneNumberChars[9],
                phoneNumberChars[10],
                phoneNumberChars[11]);

    }

    public static String getStringInput(String message, Scanner scanner ){
        System.out.print(message);
        return scanner.next();
    }

    public static int getIntegerInput(String message, Scanner scanner ){
        System.out.println(message);
        return scanner.nextInt();
    }

    public static double getDoubleInput(String message, Scanner scanner ){
        System.out.println(message);
        return scanner.nextDouble();
    }

}
