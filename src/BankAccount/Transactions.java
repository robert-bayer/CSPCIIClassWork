/**
 * Driver code for SimpleBankAccount class
 *
 * @author Robert Bayer
 * @version August 27, 2021
 */

package BankAccount;

public class Transactions {
    public static void main(String[] args){
        SimpleBankAccount checking;
        checking = new SimpleBankAccount();
        checking.deposit( 123.45 );
        checking.deposit( 221.98 );
        //System.out.println("Balance: " + checking.balance); //Not a public instance
        System.out.println("Balance: " + checking.getBalance());
        checking.withdraw(250.00); //nice dinner
        System.out.println( "Balance: " + checking.getBalance());

        SimpleBankAccount savings = new SimpleBankAccount();
        System.out.println("Balance (savings): " + savings.getBalance());
        savings.deposit(1234.56);
        System.out.println( "Balance (savings): " + savings.getBalance());
    }
}
