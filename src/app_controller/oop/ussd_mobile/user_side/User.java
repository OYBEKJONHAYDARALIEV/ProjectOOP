package app_controller.oop.ussd_mobile.user_side;

import app_controller.oop.ussd_mobile.utility.UtilMethods;

public class User {
    private final String name;
    private final String phoneNumber;
    private final String companyName;
    private final double balance;

    public User(String name, String phoneNumber, String companyName, double balance) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
        this.balance = balance;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "User -> " +
                "name='" + name + '\'' +
                ", phoneNumber='" +  UtilMethods.phoneNumberFormatter(phoneNumber) + '\'' +
                ", companyName='" + companyName + '\'' +
                ", balance=" + balance;
    }
}
