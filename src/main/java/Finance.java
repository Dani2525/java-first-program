import java.util.Map; 

public class Finance {
 public final static String BEST_LOAN_RATES="bestLoanRates";
 public final static String SAVINGS_CALCULATOR = "savingsCalculator";
 public final static String MORTGAGE_CALCULATOR ="mortgageCalculator"; 


 public final static Map<String,String> commandsToUsage= Map.of(
    BEST_LOAN_RATES, "usage: bestLoanRates", // pastes this to console the key is the name of the command line app
    SAVINGS_CALCULATOR, "usage: savingsCalculator <credits separated by ','> <debits separated by ','>",
    MORTGAGE_CALCULATOR, "usage: mortgageCalculator <loanAmount> <termInYears> <annualRate>");

 private static boolean validateCommandArguements(String[] args){
    switch (args[0]) { // setting the args at 0 refers to the name of the app the user wants to use 
        case BEST_LOAN_RATES:
            return args.length == 1;// when case is BLR , check if args array length is one and returns the boolean value true or false 
        case SAVINGS_CALCULATOR:
            return args.length == 3;// need to in actuality thte dets and credits but add 1 for args[0]
        case MORTGAGE_CALCULATOR:
            return args.length == 4;      
    }
    return false;
}
}