package ODEV2;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.05; // %5 faiz hesaplama
        System.out.println("Vadeli hesap faizi: $" + interest);
    }
}
