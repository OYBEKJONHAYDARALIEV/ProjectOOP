package app_controller.oop.oop_encapsulation;


public class BankAccountController {
    public static void main(String[] args) {


        BankAccount oybek = new BankAccount("oybekjon", 987834898, "ozaodekjonbek");


         oybek.setOwnerName("Oybek");
         oybek.setAccountNumber(5483732);
         oybek.setAccountPassword("gwefqy7wq384");


        System.out.println(   oybek.getOwnerName()   );
        System.out.println(   oybek.getAccountNumber()   );
        System.out.println(   oybek.getAccountPassword()   );

        System.out.println(oybek);

    }
}
