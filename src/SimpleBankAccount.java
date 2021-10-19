import java.text.NumberFormat;

public class SimpleBankAccount{ /**
 * Simple representation of a bank account
 *
 * @author Hyrum D. Carroll
 * @version 0.5 (10/12/2020)
 */

    // fields (instance variables)
    protected double balance;
    protected String accountId;

    /**
     * Constructor for objects of class SimpleBankAccount
     */
    public SimpleBankAccount(){
        balance = 0.0;
        accountId = "";
    }

    /**
     * Constructor for objects of class SimpleBankAccount
     */
    public SimpleBankAccount( double bal, String id ){
        balance = bal;
        accountId = id;
    }

    /**
     * Add money to the balance
     *
     * @param  amount the amount to deposit
     * @return void
     */
    public void deposit( double amount ){
        balance += amount;
    }

    /**
     * Remove money from the balance
     *
     * @param  amount the amount to withdraw
     * @return true (success) or false (failure)
     */
    public boolean withdraw( double amount ){
        if( balance - amount >= 0 ){
            balance -= amount;
            return true;
        }else{
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

    /**
     * Set account ID
     *
     * @param id account ID
     */
    public void setAccountId(String id){
        accountId = id;
    }


    /**
     * Get the account ID
     *
     * @return the account ID
     */
    public String getAccountId(){
        return accountId;
    }

    /**
     * Produces a string representation of the balance
     * @return The balance (with a label)
     */
    public String toString( ){
        // display balance as currency
        String balanceStr = NumberFormat.getCurrencyInstance().format( balance );
        return "Balance for account " + accountId + ": " + balanceStr + "\n";
    }

}
