package ODEV2;

public class Main {
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("Nisa Çetinel", 1000);
        savings.displayInfo();
        savings.calculateInterest();

        System.out.println("----------------------");


        BankAccount checking = new CheckingAccount("Yağız Çetinel", 2000);
        checking.displayInfo();
        checking.calculateInterest();
    }
}
