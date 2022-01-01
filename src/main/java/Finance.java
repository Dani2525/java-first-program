import java.util.Map; 

public class Finance {
 public final static String BEST_LOAN_RATES="BestLoanRates";
 public final static String SAVINGS_CALCULATOR = "savingsCalculator";
 public final static String MORTGAGE_CALCULATOR ="mortgageCalculator"; 


public final static Map<String,String> commandsToUsage= Map.of(
    BEST_LOAN_RATES, "usage: bestLoanRates", // pastes this to console the key is the name of the command line app
    SAVINGS_CALCULATOR, "usage: savingsCalculator <credits separated by ','> <debits separated by ','>",
    MORTGAGE_CALCULATOR, "usage: mortgageCalculator <loanAmount> <termInYears> <annualRate>");


    
}
