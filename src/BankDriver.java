public class BankDriver{ /**
 * Exercises the basic functionality of a Checking and SavingsAccount
 *
 * @author Hyrum D. Carroll
 * @version 0.3 (10/12/2020)
 */

public static final double INTEREST_RATE = 0.01;  // 1%

    public static void main( String[] args ){



        CheckingAccount checking = new CheckingAccount( 100.0, "checking123" );
        SavingsAccount savings = new SavingsAccount( 1000.0, "savings124", INTEREST_RATE );

        double monthlyExpenses = 756.34;
        int electricBillCheckNum = 2123;
        double electricBill = 60.34;
        int registationCheckNum = 2124;
        double registration = 50.00;
        double dinnerMoney = 55.32;
        double futureCar = 200.0;
        double textbook = 90.0;

        // checking account transactions
        checking.deposit( monthlyExpenses );
        checking.processCheck( electricBillCheckNum, electricBill );
        checking.withdraw( dinnerMoney );
        checking.processCheck( registationCheckNum, registration );
        System.out.print( checking.toString() );
        System.out.println( );

        // savings account transactions
        savings.deposit( futureCar );
        savings.applyInterest( );
        savings.withdraw( textbook );
        System.out.print( savings.toString() );
        System.out.println( );
    }

}
