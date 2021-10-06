package InvestmentCalculator;

public class CalculatorDriver {

    public static void main(String[] args) {
        InvestCalc myInvestment = new InvestCalc(30000, 0.2, 25, 500);

        System.out.println("Your investment will be worth: " + myInvestment.investSimulate());
    }
}
