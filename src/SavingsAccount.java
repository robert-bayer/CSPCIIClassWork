import java.text.NumberFormat;

public class SavingsAccount extends SimpleBankAccount{

    private double interestRate;

    public SavingsAccount(){
        balance = 0;
        interestRate = 0;
        accountId = "";
    }
    public SavingsAccount(double balance, String id, double interestRate){
        this.balance = balance;
        accountId = id;
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        balance = balance * (1 + interestRate);
    }

    public String toString( ) {
        // display balance as currency
        String balanceStr = NumberFormat.getCurrencyInstance().format(balance);
        return "Savings Account:\nBalance for account " + accountId + ": " + balanceStr + "\nAPR: " + interestRate * 100 +"%\n";
    }
}
