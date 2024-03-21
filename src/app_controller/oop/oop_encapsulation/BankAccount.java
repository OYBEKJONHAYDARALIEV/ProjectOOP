package app_controller.oop.oop_encapsulation;

public class BankAccount {


    private String ownerName;
    private int accountNumber;
    private String accountPassword;


    public BankAccount(String ownerName, int accountNumber, String accountPassword) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "ownerName='" + ownerName + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountPassword='" + accountPassword + '\'' +
                '}';
    }
}
