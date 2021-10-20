import java.text.NumberFormat;

public class SavingsAccount extends SimpleBankAccount {

    private double interestRate;

    public SavingsAccount() {
        balance = 0;
        interestRate = 0;
        accountId = "";
    }

    public SavingsAccount(double balance, String id, double interestRate) {
        this.balance = balance;
        accountId = id;
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        balance = balance * (1 + interestRate);
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        // display balance as currency
        String balanceStr = NumberFormat.getCurrencyInstance().format(balance);
        return super.toString() + "\nAPR: " + interestRate * 100 + "%\n";
    }

    @Override
    public boolean equals(Object obj) {
        SavingsAccount otherAccount = (SavingsAccount) obj;
        return (this.getAccountId().equals(otherAccount.getAccountId()) && this.getBalance() == otherAccount.getBalance() && this.getInterestRate() == otherAccount.getInterestRate());
    }

}
