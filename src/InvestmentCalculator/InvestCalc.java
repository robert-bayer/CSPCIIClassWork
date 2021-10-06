package InvestmentCalculator;

public class InvestCalc {

    double initAmount = 0.0;
    double returnRate = 0.0;
    int timeLength = 1;
    double addContrib = 0.0;
    double Total = 0.0;

    public InvestCalc(double initAmount, double returnRate, int timeLength, double addContrib) {                         //Constructor for Calculator that takes in all variables

        this.initAmount = initAmount;
        this.returnRate = returnRate;
        this.timeLength = timeLength;
        this.addContrib = addContrib;

    }

    public InvestCalc(double initAmount, double returnRate, int timeLength) {                                            //Constructor if no additional Contributions

        this.initAmount = initAmount;
        this.returnRate = returnRate;
        this.timeLength = timeLength;
        addContrib = 0.0;
    }

    public double investSimulate() {
        Total = initAmount;
        double monthReturn = returnRate / 12;
        for (int i = 0; i < timeLength; i++) {
            for (int j = 0; j < 12; j ++) {
                Total += addContrib;
                System.out.println("After contribution: " + Total);
                Total = (Total * monthReturn) + Total;
                System.out.println("After a monthly compound: " + Total);

            }
        }
        Total = Math.round(Total * 1000) / 1000;
        return Total;
    }
}
