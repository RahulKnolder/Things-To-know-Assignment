package bankAccountBalance;

import java.util.Scanner;

public class BankAccount {
    private double balance;
    private static double interestRate;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public double calculateInterest() {
        double dailyInterestRate = interestRate / 365;
        double interestEarned = balance * dailyInterestRate;
        return interestEarned;
    }

    public static void main(String[] args) {
        Scanner readName = new Scanner(System.in);

        BankAccount account = new BankAccount(10000);
        BankAccount.setInterestRate(0.025);
        double interestEarned = account.calculateInterest();
        System.out.printf("Interest earned: $%.2f\n", interestEarned);
    }
}
