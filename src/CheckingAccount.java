import java.text.NumberFormat;

public class CheckingAccount extends SimpleBankAccount{
    private int LastCheck;

    public CheckingAccount(){
        LastCheck = 0;
        balance = 0;
        accountId = "";
    }
    public CheckingAccount(double balance, String id){
        this.balance = balance;
        accountId = id;
    }

    public boolean processCheck(int checkNum, double amount) {
        if (checkNum == LastCheck) {
            return false;
        }
        else {
            balance -= amount;
            LastCheck = checkNum;
            return true;
        }
    }

    public int getLastCheck(){
        return LastCheck;
    }

    @Override
    public String toString( ) {
        // display balance as currency
        String balanceStr = NumberFormat.getCurrencyInstance().format(balance);
        return super.toString() + "\nLast Processed Check: " + LastCheck +"\n";
    }

    @Override
    public boolean equals(Object obj) {
        CheckingAccount otherAccount = (CheckingAccount) obj;
        return (this.getAccountId().equals(otherAccount.getAccountId()) && this.getBalance() == otherAccount.getBalance() && this.getLastCheck() == otherAccount.getLastCheck());
    }
}
