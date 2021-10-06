package BankAccount;

/**
 * Simple Bank Account
 *
 * @author Robert bayer
 * @version August 27, 2021
 */

public class SimpleBankAccount {

    //instance variable
    private double balance;

    /**
     * Constructor for objects of class BankAccount.SimpleBankAccount
     */
    public SimpleBankAccount(){
        balance = 0;
    }

    /**
     * Add money to the balance
     *
     * @param amount the amount to deposit
     * @return void
     */
    public void deposit(double amount){
        balance += amount;
    }

    /**
     * Remove money from the balance
     *
     * @param amount the amount to withdraw
     * @return true (success) or false (failure)
     */
    public boolean withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get the balance
     *
     * @return the balance
     */
    public double getBalance(){
        return balance;
    }
}

